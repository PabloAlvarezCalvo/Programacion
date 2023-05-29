package dam.programacion.Examenes.UD06_07.Ej01_Plataforma;

public class Pelicula implements Contenido {
    private String nombre;
    private int duracion; //En minutos
    private boolean reproduciendose;

    public Pelicula(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public void reproducir() {
        this.reproduciendose = true;
        System.out.println("La película \"" + this.nombre + "\" se está reproduciendo.");
    }

    @Override
    public void parar() {
        this.reproduciendose = false;
        System.out.println("La película \"" + this.nombre + "\" se ha pausado.");
    }

    @Override
    public void reanudar() {
        this.reproduciendose = true;
        System.out.println("La película \"" + this.nombre + "\" se ha reanudado.");
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "nombre='" + this.nombre + '\'' +
                ", duracion=" + this.duracion +
                ", reproduciendose=" + this.reproduciendose +
                '}';
    }
}
