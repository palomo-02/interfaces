package refuerzo2;

public class Perecederos extends Producto {
    private int diasParaCaducar;

    public Perecederos(String codigo, String nombre, double precio, int stock, int diasParaCaducar) {
        super(codigo, nombre, precio, stock);
        this.diasParaCaducar = diasParaCaducar;
    }

    @Override
    public String toString() {
        return super.toString() + ", Días para caducar: " + diasParaCaducar;
    }
}
