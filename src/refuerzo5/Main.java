package refuerzo5;
import java.util.Scanner;


public class Main {

	private static Libro[] libros = new Libro[5];

	
	private static int cont=0;
	
	
	
	
	
	public static void main(String[] args) {

		
		var sc = new Scanner(System.in);
		
		int opcion =0;
		
		
		
		do {
			
			MostrarMenu();
			opcion = sc.nextInt();
			sc.nextLine(); // Limpiar el buffer del scanner

			
			switch(opcion) {
			
			
			
			
			case 1 ->RegistroLibro();
			case 2 ->MostrarLibro();
			case 3 ->ordenarTitulo();
			case 4 ->ordenarAutor();
			case 5 ->ordenarISBN();
			case 6 ->System.out.println("saliendo del programa...");

			
			
			
			}
			
			
			
		}while(opcion!=7);
		
		
		sc.close();
		
		
	}
	private static void RegistroLibro() {
		
		if (cont>=5) {
			
			
			System.out.println("ya no caben msa libros ");
		}
		System.out.println("inserte");
		
	}
	private static void MostrarLibro() {
	}
	private static void ordenarTitulo() {
	}


	private static void ordenarAutor() {
	}
	private static void ordenarISBN() {
	}

	private static void MostrarMenu() {
		
		System.out.println("--Mostrando Menu--");
		System.out.println("1.Registrar libros");
		System.out.println("2.Mostrar todos los libros registrados");
		System.out.println("3.ordenar por titulo");
		System.out.println("4.ordenar por autor");
		System.out.println("5.ordenar por ISBN");
		System.out.println("6.salir del sistema");

		
		
		
	}
	

}
