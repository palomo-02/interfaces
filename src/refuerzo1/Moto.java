package refuerzo1;

public class Moto extends VehiculoConMotor {

	private String tipo;

	public Moto(int velocidad, String marca, int npuertas, String tipo) {
		super(velocidad, marca, npuertas);
		this.tipo = tipo;
	}

	@Override
	public void arrancar() {
		super.arrancar();
		System.out.println("Moto de tipo " + tipo + " arrancado.");
	}

	@Override
	public void parar() {
		super.parar();
		System.out.println("moto parado.");

	}
}