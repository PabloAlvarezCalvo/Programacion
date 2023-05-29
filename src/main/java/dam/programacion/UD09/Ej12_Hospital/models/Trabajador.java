package dam.programacion.UD09.Ej12_Hospital.models;

import java.time.LocalDate;

public class Trabajador extends Persona {
    private LocalDate fechaIncorporacion;
    private Area area;
    private String cargo;
    private double salario;

    public Trabajador(){
        super();
    }

    public Trabajador(String dni, String nombre, int edad, String direccion){
        super(dni, nombre, edad, direccion);
    }

    public Trabajador(
            String dni,
            String nombre,
            int edad,
            String direccion,
            LocalDate fechaIncorporacion,
            Area area,
            String cargo,
            double salario
    ) {
        super(dni, nombre, edad, direccion);
        this.fechaIncorporacion = fechaIncorporacion;
        this.area = area;
        this.cargo = cargo;
        this.salario = salario;
    }

    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcularCoste() {
        return salario * 14 * 1.05;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "fechaIncorporacion=" + fechaIncorporacion +
                ", area=" + area +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
