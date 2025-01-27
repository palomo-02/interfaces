package ej1;

public class Libro extends Publicacion implements prestable {
	private boolean prestado;

	public Libro(int codigo, String nombre, int año) {
		super(codigo, nombre, año);
		this.prestado = false;
	}

	public void prestar() {

		if (prestado) {
prestado=true;
			System.out.println("el libro esta prestado");
		} else {
			System.out.println("el libro esta disponible");
		}

	}

	public void devolver() {

		if (!prestado) {

			System.out.println("el libro esta devuelto");
		} else {
			System.out.println("el libro no esta devuelto");
		}

	}
	
	
	public boolean prestado() {
		
		return prestado;
	}

	@Override
	public String toString() {
		return super.toString()+ "Libro [prestado=" + prestado + "]";
	}

	
	
	
	
	
	

}
