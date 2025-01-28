package refuerzo1;

public class Coche extends VehiculoConMotor {

	private int cilindrada;

	public Coche(int velocidad, String marca, int npuertas, int cilindrada) {
		super(velocidad, marca, npuertas);
		this.cilindrada = cilindrada;
	}

	@Override
	public void arrancar() {
		super.arrancar();
		System.out.println("Coche con cilindrada " + cilindrada + " arrancado.");
	}

	@Override
	public void parar() {
		super.parar();
		System.out.println("Coche parado.");
	}
}
