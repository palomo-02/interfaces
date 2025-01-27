package ej1;

abstract class Publicacion {

	protected int codigo;
	protected String nombre;
	protected int año;

	public Publicacion(int codigo, String nombre, int año) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.año = año;
	}

	public int getCodigo() {
		return codigo;
	}

	public int getAño() {
		return año;
	}

	@Override
	public String toString() {
		return "Publicacion [codigo=" + codigo + ", nombre=" + nombre + ", año=" + año + "]";
	}



}
