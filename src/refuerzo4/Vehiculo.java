package refuerzo4;

abstract class Vehiculo {

	protected int matricula;
	protected String marca;
	protected String modelo;
	
	public Vehiculo(int matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}

	public String MostarInfo() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + "]";
	}

}
