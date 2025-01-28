package refuerzo2;

public class Noperecederos extends Producto {
	
private String tipo;

	public Noperecederos(int codigo, String nombre, int precio, int proteccion, String tipo ) {
		super(codigo, nombre, precio, proteccion);
		this.tipo=tipo;
	}

	@Override
	public String toString() {
		return "Noperecederos [tipo=" + tipo + ", codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio
				+ ", proteccion=" + proteccion + "]";
	}

}
