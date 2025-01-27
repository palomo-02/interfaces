package ej3;

public class Cliente implements Comparable<Cliente> {

	
	protected int DNI;                                                              
	protected String nombre;
	protected int salario;
	protected int saldo;
	
	public Cliente(int dNI, String nombre, int salario, int saldo) {
		DNI = dNI;
		this.nombre = nombre;
		this.salario = salario;
		this.saldo = saldo;
	}

	@Override
	public int compareTo(Cliente o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
