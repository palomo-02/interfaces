package refuerzo5;

public class LibroTexto extends Libro {
	
	
	private String niveEducativo;
	private String asignatura;
	public LibroTexto(String iSBN, String titulo, String autor,String niveEducativo,String asignatura) {
		super(iSBN, titulo, autor);
this.asignatura=asignatura;
	
	
	
	
	}
	@Override
	public String toString() {
		return "LibroTexto [niveEducativo=" + niveEducativo + ", asignatura=" + asignatura + ", ISBN=" + ISBN
				+ ", titulo=" + titulo + ", autor=" + autor + "]";
	}

}
