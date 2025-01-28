package refuerzo1;

abstract class VehiculoConMotor implements Vehiculo {

	protected int velocidad;
	protected String marca;
	protected int Npuertas;

	public void arrancar() {

		System.out.println("el coche arranca ");
	}

	public void parar() {

		System.out.println("el coche se para ");
	}
	
	public void MostrarEstado() {

		
	};
	
	
}
