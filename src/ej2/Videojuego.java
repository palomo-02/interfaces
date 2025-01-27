package ej2;

public class Videojuego implements Entregable, Comparable<Videojuego> {

    protected String titulo;
    protected int horasEstimadas;
    protected boolean entregado;
    protected String genero;
    protected String compania;

    // Constructor por defecto
    public Videojuego() {
        this.titulo = "";
        this.horasEstimadas = 10;
        this.entregado = false;
        this.genero = "";
        this.compania = "";
    }

    // Constructor con título y horas estimadas
    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = "";
        this.compania = "";
    }

    // Constructor con todos los atributos excepto entregado
    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
        this.genero = genero;
        this.compania = compania;
    }

    // Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    // Métodos de la interfaz Entregable
    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }

    @Override
    public String toString() {
        return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
                + ", genero=" + genero + ", compania=" + compania + "]";
    }

    @Override
    public int compareTo() {
        return this.horasEstimadas;
    }

    @Override
    public int compareTo(Videojuego o) {
        return Integer.compare(this.horasEstimadas, o.horasEstimadas);
    }
}

