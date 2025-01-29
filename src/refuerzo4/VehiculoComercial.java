package refuerzo4;

public class VehiculoComercial extends Vehiculo {

	private int carga;

	public VehiculoComercial(int matricula, String marca, String modelo, int carga) {
		super(matricula, marca, modelo);
		this.carga = carga;
	}

	@Override
	public String toString() {
		return "VehiculoComercial [carga=" + carga + ", matricula=" + matricula + ", marca=" + marca + ", modelo="
				+ modelo + "]";
	}

	
	
	
	
	
	
	

}
