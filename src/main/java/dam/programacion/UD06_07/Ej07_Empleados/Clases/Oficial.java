package dam.programacion.UD06_07.Ej07_Empleados.Clases;

import java.time.LocalDate;

public class Oficial extends Operario{
    private String linea;

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public Oficial(String nombre, double salario, LocalDate fechaIncorporacion, String area, String nave, String linea) {
        super(nombre, salario, fechaIncorporacion, area, nave);
        this.linea = linea;
    }

    @Override
    public String toString() {
        return "Oficial{" +
                "nombre='" + super.getNombre() + '\'' +
                ", salario=" + super.getSalario() +
                ", fechaIncorporacion=" + super.getFechaIncorporacion() +
                "linea='" + linea + '\'' +
                '}';
    }
}
