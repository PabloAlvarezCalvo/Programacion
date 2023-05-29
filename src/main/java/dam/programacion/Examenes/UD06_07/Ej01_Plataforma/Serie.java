package dam.programacion.Examenes.UD06_07.Ej01_Plataforma;

public class Serie implements Contenido {
    private String nombre;
    private int numEpisodios;
    private boolean reproduciendose;

    public Serie(String nombre, int numEpisodios) {
        this.nombre = nombre;
        this.numEpisodios = numEpisodios;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumEpisodios() {
        return this.numEpisodios;
    }

    public void setNumEpisodios(int numEpisodios) {
        this.numEpisodios = numEpisodios;
    }

    @Override
    public void reproducir() {
        this.reproduciendose = true;
        System.out.println("La serie \"" + this.nombre + "\" se está reproduciendo.");
    }

    @Override
    public void parar() {
        this.reproduciendose = false;
        System.out.println("La serie \"" + this.nombre + "\" se ha pausado.");
    }

    @Override
    public void reanudar() {
        this.reproduciendose = true;
        System.out.println("La serie \"" + this.nombre + "\" se ha reanudado.");
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nombre='" + this.nombre + '\'' +
                ", numEpisodios=" + this.numEpisodios +
                ", reproduciendose=" + this.reproduciendose +
                '}';
    }
}
