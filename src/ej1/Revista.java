package ej1;

public class Revista extends Publicacion {

    private int numero;

    public Revista(int codigo, String nombre, int año, int numero) {
        super(codigo, nombre, año);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString() + ", Revista [numero=" + numero + "]";
    }
}
