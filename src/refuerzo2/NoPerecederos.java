package refuerzo2;

public class NoPerecederos extends Producto {
    private String tipo;

    public NoPerecederos(String codigo, String nombre, double precio, int stock, String tipo) {
        super(codigo, nombre, precio, stock);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: " + tipo;
    }
}
