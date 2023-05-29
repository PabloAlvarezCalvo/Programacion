package dam.programacion.Examenes.UD09.model;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Locale;

public class Empleado extends Persona {
    private double salario;
    private Seccion seccion;
    private LocalDate fechaContratacion;
    private HashMap<Integer, RegistroSeccion> registroSecciones;

    public Empleado() {
        this("", "Empleado genérico", 0, "",
                0.0, new Seccion(-1, "Sección genérica"), LocalDate.now());
    }

    public Empleado(String dni, String nombre, int edad, String direccion,
                    double salario, Seccion seccion, LocalDate fechaContratacion) {
        super(dni, nombre, edad, direccion);
        this.salario = salario;
        this.seccion = seccion;
        this.fechaContratacion = fechaContratacion;

        registroSecciones = new HashMap<>();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public HashMap<Integer, RegistroSeccion> getRegistroSecciones() {
        return registroSecciones;
    }

    public void setRegistroSecciones(HashMap<Integer, RegistroSeccion> registroSecciones) {
        this.registroSecciones = registroSecciones;
    }

    public void addSeccion(Seccion seccion, LocalDate fechaInicio, LocalDate fechaFin){
        RegistroSeccion rs = new RegistroSeccion(seccion, fechaInicio);
        rs.setFechaFin(fechaFin);
        registroSecciones.put(registroSecciones.size(), rs);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre=" + super.getNombre() +
                ", salario=" + salario +
                ", seccion=" + seccion.getNombre() +
                ", fechaContratacion=" + fechaContratacion +
                '}';
    }
}
