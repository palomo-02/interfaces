package refuerzo2;

import java.util.Scanner;

import refuerzo1.Vehiculo;

public class Main {
	private static final int Max_productos = 5;
	private static Producto[] productos = new Producto[Max_productos];
	
	public static void main(String[] args) {


		var sc = new Scanner(System.in);

		int opcion =0;
		
		
		do {
			
			mostrarMenu(); 
			opcion = sc.nextInt();
			sc.nextLine(); //
			
			
			switch (opcion) {
			
			
			case 1->registrarProducto
			case 2->mostrarProducto
			case 3->ordenarProducto
			case 4->buscarProducto
			case 5->System.out.println("saliendo del programa... ");

			}
			
			
			
			
			
		}while(opcion !=5);
		sc.close();
		
		
			
			
			
			
		}
	private static void  mostrarMenu() {
		System.out.println("\n--- Menú ---");
		System.out.println("1. Registrar un nuevo producto");
		System.out.println("2. Mostrar todos los productos registrados registrados");
		System.out.println("3. ordenar los productos por precio");
		System.out.println("4. buscar un producto por su codigo y mostrar la informacion ");
		System.out.println("5. salir del programa");

		System.out.print("Selecciona una opción: ");
	}
	private static void  registrarProducto() {
		
		
		if() {
			System.out.println("se ha llegado al maximo del array");
			
		}
		
		System.out.println("introduzca ");
		
		
	}
}
