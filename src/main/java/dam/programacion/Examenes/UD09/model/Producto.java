package dam.programacion.Examenes.UD09.model;

import java.time.LocalDate;

public class Producto {
    private long id;
    private String nombre;
    private Seccion seccion;
    private LocalDate fechaCaducidad;

    public Producto(){
        this(-1, "Producto genérico", new Seccion(-1, "Sección genérica"), LocalDate.now());
    }

    public Producto(long id, String nombre, Seccion seccion, LocalDate fechaCaducidad) {
        this.id = id;
        this.nombre = nombre;
        this.seccion = seccion;
        this.fechaCaducidad = fechaCaducidad;
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

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", seccion=" + seccion.getNombre() +
                ", fechaCaducidad=" + fechaCaducidad +
                '}';
    }
}
