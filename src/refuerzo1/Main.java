package refuerzo1;

import java.util.Scanner;

public class Main {

	private static final int Max_vehiculos = 10;
	private static Vehiculo[] vehiculos = new Vehiculo[Max_vehiculos];

	private static int Cont = 0;

	public static void main(String[] args) {

		var sc = new Scanner(System.in);

		int opcion = sc.nextInt();

		do {
			mostrarMenu(); // Mostrar el menú de opciones
			opcion = sc.nextInt();
			sc.nextLine(); // Limpiar el buffer del scanner

			switch (opcion) {
			case 1 -> registrarVehiculo(sc); // Registrar un nuevo vehículo
			case 2 -> mostrarEstados(); // Mostrar el estado de todos los vehículos
			// case 3 -> arrancarOPararVehiculo(sc); // Arrancar o parar un vehículo
			case 4 -> System.out.println("Saliendo del programa..."); // Salir
			default -> System.out.println("Opción no válida. Inténtalo de nuevo.");
			}
		} while (opcion != 4);

		sc.close();

	}

	private static void mostrarMenu() {
		System.out.println("\n--- Menú ---");
		System.out.println("1. Registrar un nuevo vehículo (Coche o Moto)");
		System.out.println("2. Mostrar el estado de todos los vehículos registrados");
		System.out.println("3. Arrancar o parar un vehículo por su índice");
		System.out.println("4. Salir del programa");
		System.out.print("Selecciona una opción: ");
	}

	private static void registrarVehiculo(Scanner sc) {
		if (Cont >= Max_vehiculos) {
			System.out.println("No se pueden registrar más vehículos. Límite alcanzado.");
			return;
		}

		System.out.print("¿Qué vehículo deseas registrar? (1: Coche, 2: Moto): ");
		int tipo = sc.nextInt();
		sc.nextLine(); // Limpiar el buffer

		System.out.println("introduce la velocidad maxima");
		int velocidad = sc.nextInt();
		sc.nextLine();

		System.out.println("introduce la marca del vehiculo");
		String Marca = sc.nextLine();

		sc.nextLine();
		System.out.println("introduce el numero de puertas");
		int puertas = sc.nextInt();

		sc.nextLine();

		if (tipo == 1) {

			System.out.println("introduce la cilindrada del coche ");

			int cilindrada = sc.nextInt();
			sc.nextLine();

			vehiculos[Cont] = new Coche(velocidad, Marca, puertas, cilindrada);
			Cont++;

		} else if (tipo == 2) {

			System.out.println("introduce el tipo de moto ");
			String estilo = sc.nextLine();
			sc.nextLine();
			vehiculos[Cont] = new Moto(velocidad, Marca, puertas, estilo);
			Cont++;

		}

	}

	private static void mostrarEstados() {

		if (Cont == 0) {

			System.out.println("no hay elementos en el array, no se puede mostrar nada ");
			return;
		}

		for (int i = 0; i < Cont; i++) {

			if (vehiculos[i] instanceof Moto) {

				System.out.println("es una moto");

			} else if (vehiculos[i] instanceof Coche) {

				System.out.println("es un coche");

			}
			((VehiculoConMotor) vehiculos[i]).mostrarEstado();
		}

	}

}
