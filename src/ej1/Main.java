package ej1;

public class Main {

    public static void main(String[] args) {
        // Crear un libro
        Libro libro = new Libro(55544, "VyV", 2025);
        System.out.println(libro); // Mostrar información del libro

        libro.prestar(); // Intentar prestar el libro

        libro.prestar(); // Intentar prestar el libro nuevamente

        libro.devolver(); // Devolver el libro
        libro.devolver(); // Intentar devolver el libro nuevamente

        System.out.println("¿El libro está prestado? " + libro.prestado());

        // Crear una revista
        Revista revista = new Revista(78688, "WOK", 1999, 5);
        System.out.println(revista); // Mostrar información de la revista
    }
}
