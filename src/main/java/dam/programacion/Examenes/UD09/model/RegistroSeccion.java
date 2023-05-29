package dam.programacion.Examenes.UD09.model;

import java.time.LocalDate;

public class RegistroSeccion {
    private Seccion seccion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public RegistroSeccion(Seccion seccion, LocalDate fechaInicio) {
        this.seccion = seccion;
        this.fechaInicio = fechaInicio;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "RegistroSeccion{" +
                "seccion=" + seccion.getNombre() +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + ((fechaFin != null) ? fechaFin : "actualmente") +
                '}';
    }
}
