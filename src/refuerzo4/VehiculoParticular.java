package refuerzo4;

public class VehiculoParticular extends Vehiculo {
	private int nPlazas;

	public VehiculoParticular(int matricula, String marca, String modelo, int nPlazas) {
		super(matricula, marca, modelo);
		this.nPlazas = nPlazas;
	}

	@Override
	public String toString() {
		return "VehiculoParticular [nPlazas=" + nPlazas + ", matricula=" + matricula + ", marca=" + marca + ", modelo="
				+ modelo + "]";
	}

}
