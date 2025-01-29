package refuerzo5;

public class LibroNarrativa extends Libro {

	private String genero;
	public LibroNarrativa(String iSBN, String titulo, String autor,String genero) {
		super(iSBN, titulo, autor);
		
		this.genero=genero;
		
		
		
	}
	@Override
	public String toString() {
		return "LibroNarrativa [genero=" + genero + ", ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + "]";
	}

	
	
	
	
	
	
	
}
