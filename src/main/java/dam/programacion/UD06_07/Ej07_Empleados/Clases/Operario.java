package dam.programacion.UD06_07.Ej07_Empleados.Clases;

import java.time.LocalDate;

public class Operario extends Empleado {
    private String area, nave;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNave() {
        return nave;
    }

    public void setNave(String nave) {
        this.nave = nave;
    }

    public Operario(String nombre, double salario, LocalDate fechaIncorporacion, String area, String nave) {
        super(nombre, salario, fechaIncorporacion);
        this.area = area;
        this.nave = nave;
    }

    @Override
    public String toString() {
        return "Operario{" +
                "nombre='" + super.getNombre() + '\'' +
                ", salario=" + super.getSalario() +
                ", fechaIncorporacion=" + super.getFechaIncorporacion() +
                "area='" + area + '\'' +
                ", nave='" + nave + '\'' +
                '}';
    }
}
