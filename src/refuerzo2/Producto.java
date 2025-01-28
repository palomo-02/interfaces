package refuerzo2;

public class Producto {

	
	protected int codigo;
	protected String nombre;
	protected int precio;
	protected int proteccion;
	
	
	public Producto(int codigo, String nombre, int precio, int proteccion) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.proteccion = proteccion;
	}


	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", proteccion=" + proteccion
				+ "]";
	}
	
	
	
	
	
}
