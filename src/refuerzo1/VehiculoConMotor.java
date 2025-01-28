package refuerzo1;

abstract class VehiculoConMotor implements Vehiculo {
    protected int velocidad;
    protected String marca;
    protected int Npuertas;
    private boolean encendido = false;

    public VehiculoConMotor(int velocidad, String marca, int npuertas) {
        this.velocidad = velocidad;
        this.marca = marca;
        this.Npuertas = npuertas;
    }

    @Override
    public void arrancar() {
        setEncendido(true);
        System.out.println("El vehículo arranca.");
    }

    @Override
    public void parar() {
        setEncendido(false);
        System.out.println("El vehículo se para.");
    }

    public void mostrarEstado() {
        System.out.println("Estado: " + (encendido ? "Encendido" : "Apagado"));
    }

    protected void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public boolean isEncendido() {
        return encendido;
    }
}