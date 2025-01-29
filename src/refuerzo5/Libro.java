package refuerzo5;

public class Libro {

	protected String ISBN;
	protected String titulo;
	protected String autor;
	
	
	
	public Libro(String iSBN, String titulo, String autor) {
		ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
	}



	@Override
	public String toString() {
		return "Libro [ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + "]";
	}

	
	
	
	
	
}
