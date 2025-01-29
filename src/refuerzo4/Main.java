package refuerzo4;

import java.util.Scanner;

import refuerzo4.Vehiculo;

public class Main {

	private static Vehiculo[] vehiculos = new Vehiculo[5];
	private static int cont = 0;

	public static void main(String[] args) {

		var sc = new Scanner(System.in);

		int opcion = 0;

		do {

			mostratMenu();
			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {

			case 1:
				registrarVehiculo(sc);
				break;
			case 2:
				MostrarVehiculo();
				break;

			case 3:
				OrdenarMatricula();
				break;

			case 4:
				OrdenarMarca();
				break;

			case 5:
				BuscarMatricula(sc);
				break;

			case 6:
				System.out.println("saliendo del programa...");
			default:
				System.out.println("opcion no valida");

			}

		} while (opcion != 6);
		sc.close();
	}

	private static void BuscarMatricula(Scanner sc) {

		System.out.println("Ingrese la matrícula a buscar:");
		int matriculaBuscar = sc.nextInt();

		boolean encontrado = false;

		for (int i = 0; i < cont; i++) {
			if (vehiculos[i] != null && vehiculos[i].matricula == matriculaBuscar) {
				System.out.println("Vehículo encontrado: " + vehiculos[i]);
				encontrado = true;
				break; // Se detiene la búsqueda al encontrar el primer resultado
			}
		}

		if (!encontrado) {
			System.out.println("No se encontró un vehículo con esa matrícula.");
		}
	}

	private static void OrdenarMarca() {
		// TODO Auto-generated method stub

	}

	private static void OrdenarMatricula() {
		// TODO Auto-generated method stub

	}

	private static void MostrarVehiculo() {
		boolean hayVehiculos = false;

		System.out.println("\n--- Vehículos Registrados ---");

		for (int i = 0; i < cont; i++) {
			if (vehiculos[i] != null) {
				System.out.println("Vehiculo:" + vehiculos[i]);
				hayVehiculos = true;
			}
		}

		if (!hayVehiculos) {
			System.out.println("No hay vehículos registrados.");
		}
	}

	private static void registrarVehiculo(Scanner sc) {

		if (cont >= 5) {
			System.out.println("no puede añadir mas vehiculos ");
			return;
		}

		System.out.println("escriba la matricula");
		int matricula = sc.nextInt();
		sc.nextLine();
		System.out.println("escriba la marca");
		String marca = sc.nextLine();
		System.out.println("escriba el modelo ");
		String modelo = sc.nextLine();

		System.out.println("Es para un comercial o para un particular");
		System.out.println("1.particular  2.comercial");

		int eleccion = sc.nextInt();

		if (eleccion == 1) {

			System.out.println("seleccione el numero de plazas");

			int plazas = sc.nextInt();

			vehiculos[cont] = new VehiculoParticular(matricula, marca, modelo, plazas);
			cont++;
		} else if (eleccion == 2) {

			System.out.println("declare la carga maxima");

			int carga = sc.nextInt();

			vehiculos[cont] = new VehiculoComercial(matricula, marca, modelo, carga);
			cont++;

		}

	}

	private static void mostratMenu() {

		System.out.println("--Menu de selección");
		System.out.println("1.Registrar vehiculo ");
		System.out.println("2. Mostrar vehiculos regitrados");
		System.out.println("3.Ordenar por matricula ");
		System.out.println("4.Ordenar por marca ");

		System.out.println("5.Buscar por matricula ");
		System.out.println("6.salir ");

	}

}
