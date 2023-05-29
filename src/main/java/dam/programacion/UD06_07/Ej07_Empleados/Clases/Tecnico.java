package dam.programacion.UD06_07.Ej07_Empleados.Clases;

import java.time.LocalDate;

public class Tecnico extends Operario{
    private String seccion;

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public Tecnico(String nombre, double salario, LocalDate fechaIncorporacion, String area, String nave, String seccion) {
        super(nombre, salario, fechaIncorporacion, area, nave);
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "nombre='" + super.getNombre() + '\'' +
                ", salario=" + super.getSalario() +
                ", fechaIncorporacion=" + super.getFechaIncorporacion() +
                "seccion='" + seccion + '\'' +
                '}';
    }
}
