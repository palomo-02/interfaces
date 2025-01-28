package refuerzo2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    private static final int TAMANO_ARRAY = 5; // Tamaño fijo del array
    private static Producto[] productos = new Producto[TAMANO_ARRAY];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1 -> registrarProducto(sc); // Registrar un producto
                case 2 -> mostrarProductos(); // Mostrar todos los productos
                case 3 -> ordenarProductos(sc); // Ordenar productos
                case 4 -> buscarProducto(sc); // Buscar un producto por código
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 5);

        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Sistema de Gestión de Productos ---");
        System.out.println("1. Registrar un producto");
        System.out.println("2. Mostrar todos los productos registrados");
        System.out.println("3. Ordenar productos (por precio, nombre o código)");
        System.out.println("4. Buscar producto por código");
        System.out.println("5. Salir");
        System.out.print("Selecciona una opción: ");
    }

    private static void registrarProducto(Scanner sc) {
        int posicionLibre = buscarPosicionLibre();

        if (posicionLibre == -1) {
            System.out.println("No se pueden registrar más productos. Capacidad alcanzada.");
            return;
        }

        System.out.print("Introduce el código del producto: ");
        String codigo = sc.nextLine();

        System.out.print("Introduce el nombre del producto: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce el precio del producto: ");
        double precio = sc.nextDouble();

        System.out.print("Introduce la cantidad en stock: ");
        int stock = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer

        System.out.print("¿Es perecedero o no perecedero? (1: Perecedero, 2: No perecedero): ");
        int tipoProducto = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer

        if (tipoProducto == 1) {
            System.out.print("Introduce los días para caducar: ");
            int diasParaCaducar = sc.nextInt();
            sc.nextLine();
            productos[posicionLibre] = new Perecederos(codigo, nombre, precio, stock, diasParaCaducar);
        } else if (tipoProducto == 2) {
            System.out.print("Introduce el tipo (Electrónica, Hogar, etc.): ");
            String tipo = sc.nextLine();
            productos[posicionLibre] = new NoPerecederos(codigo, nombre, precio, stock, tipo);
        } else {
            System.out.println("Opción no válida. Producto no registrado.");
        }

        System.out.println("Producto registrado con éxito.");
    }

    private static int buscarPosicionLibre() {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] == null) {
                return i;
            }
        }
        return -1; // Indica que no hay posiciones libres
    }

    private static void mostrarProductos() {
        boolean hayProductos = false;

        System.out.println("\n--- Productos Registrados ---");
        for (Producto producto : productos) {
            if (producto != null) {
                System.out.println(producto);
                hayProductos = true;
            }
        }

        if (!hayProductos) {
            System.out.println("No hay productos registrados.");
        }
    }

    private static void ordenarProductos(Scanner sc) {
        boolean hayProductos = Arrays.stream(productos).anyMatch(producto -> producto != null);
        if (!hayProductos) {
            System.out.println("No hay productos para ordenar.");
            return;
        }

        System.out.print("¿Cómo deseas ordenar los productos? (1: Por precio, 2: Por nombre, 3: Por código): ");
        int criterio = sc.nextInt();
        sc.nextLine();

        Producto[] productosOrdenados = Arrays.stream(productos)
                .filter(producto -> producto != null) // Filtrar solo los productos no nulos
                .toArray(Producto[]::new);

        switch (criterio) {
            case 1 -> {
                // Usando Comparator para ordenar por precio
                Arrays.sort(productosOrdenados, Comparator.comparingDouble(Producto::getPrecio));
                System.out.println("Productos ordenados por precio:");
            }
            case 2 -> {
                // Usando Comparator para ordenar por nombre
                Arrays.sort(productosOrdenados, Comparator.comparing(Producto::getNombre));
                System.out.println("Productos ordenados por nombre:");
            }
            case 3 -> {
                // Usando el método compareTo (orden natural por código)
                Arrays.sort(productosOrdenados);
                System.out.println("Productos ordenados por código:");
            }
            default -> {
                System.out.println("Criterio no válido.");
                return;
            }
        }

        for (Producto producto : productosOrdenados) {
            System.out.println(producto);
        }
    }

    private static void buscarProducto(Scanner sc) {
        System.out.print("Introduce el código del producto que deseas buscar: ");
        String codigo = sc.nextLine();

        for (Producto producto : productos) {
            if (producto != null && producto.getCodigo().equalsIgnoreCase(codigo)) {
                System.out.println("Producto encontrado: " + producto);
                return;
            }
        }

        System.out.println("Producto con código " + codigo + " no encontrado.");
    }
}

