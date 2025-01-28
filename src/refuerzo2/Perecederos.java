package refuerzo2;

public class Perecederos extends Producto {

	private int diascaducar;
	
	
	public Perecederos(int codigo, String nombre, int precio, int proteccion,int diascaducar) {
		super(codigo, nombre, precio, proteccion);
this.diascaducar=diascaducar;}


	@Override
	public String toString() {
		return "Perecederos [diascaducar=" + diascaducar + ", codigo=" + codigo + ", nombre=" + nombre + ", precio="
				+ precio + ", proteccion=" + proteccion + "]";
	}



}
