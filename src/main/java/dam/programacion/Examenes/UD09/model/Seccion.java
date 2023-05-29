package dam.programacion.Examenes.UD09.model;

public class Seccion {
    private long id;
    private String nombre;

    public Seccion() {
        this(-1, "Sección genérica");
    }

    public Seccion(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
