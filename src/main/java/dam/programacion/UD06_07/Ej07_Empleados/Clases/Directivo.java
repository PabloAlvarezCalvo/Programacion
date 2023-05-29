package dam.programacion.UD06_07.Ej07_Empleados.Clases;

import java.time.LocalDate;

public class Directivo extends Empleado {
    private String cargo, departamento;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Directivo(String nombre, double salario, LocalDate fechaIncorporacion, String cargo, String departamento) {
        super(nombre, salario, fechaIncorporacion);
        this.cargo = cargo;
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Directivo{" +
                "nombre='" + super.getNombre() + '\'' +
                ", salario=" + super.getSalario() +
                ", fechaIncorporacion=" + super.getFechaIncorporacion() +
                "cargo='" + cargo + '\'' +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}
