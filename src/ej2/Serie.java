package ej2;

public class Serie implements Entregable, Comparable<Serie> {

    protected String titulo;
    protected int numeroTemporadas;
    protected String genero;
    protected String creador;
    protected boolean entregado;

    // Constructor por defecto
    public Serie() {
        this.titulo = "";
        this.numeroTemporadas = 3;
        this.genero = "";
        this.creador = "";
        this.entregado = false;
    }

    // Constructor con título y creador
    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.numeroTemporadas = 3;
        this.genero = "";
        this.entregado = false;
    }

    // Constructor con todos los atributos excepto entregado
    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
        this.entregado = false;
    }

    // Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
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
        return "Serie [titulo=" + titulo + ", numeroTemporadas=" + numeroTemporadas + ", genero=" + genero
                + ", creador=" + creador + ", entregado=" + entregado + "]";
    }

    @Override
    public int compareTo() {
        return this.numeroTemporadas;
    }

    @Override
    public int compareTo(Serie o) {
        return Integer.compare(this.numeroTemporadas, o.numeroTemporadas);
    }
}
