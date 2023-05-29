package dam.programacion.UD09.Ej12_Hospital.models;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Iterator;

public class Paciente extends Persona {
    private LocalDate fechaIngreso;
    private String patologia;
    private HashMap<Integer, Ingreso> ingresos = new HashMap<>();

    public Paciente() {
        super();
    }

    public Paciente(String dni, String nombre, int edad, String direccion){
        super(dni, nombre, edad, direccion);
    }

    public Paciente(
            String dni,
            String nombre,
            int edad,
            String direccion,
            LocalDate fechaIngreso,
            String patologia
    ) {
        super(dni, nombre, edad, direccion);
        this.fechaIngreso = fechaIngreso;
        this.patologia = patologia;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getPatologia() {
        return patologia;
    }

    public void setPatologia(String patologia) {
        this.patologia = patologia;
    }

    public HashMap<Integer, Ingreso> getIngresos() {
        return ingresos;
    }

    public void setIngresos(HashMap<Integer, Ingreso> ingresos) {
        this.ingresos = ingresos;
    }

    public void addIngreso(Ingreso ingreso) {
        ingresos.put(ingresos.size() + 1, ingreso);
    }

    @Override
    public double calcularCoste() {
        double costeAcumulado = 0;

        for (Ingreso i : ingresos.values()){
            long dias = ChronoUnit.DAYS.between(i.getFechaIngreso(), i.getFechaAlta());
            long coste = 700 * dias;
            if (i.getArea().getNombre().equals("Traumatología")){
                coste *= 1.02;
            }
            costeAcumulado += coste;
        }
        return costeAcumulado;

        //Iterator<Ingreso> iterador = ingresos.values().iterator();
        //while (iterador.hasNext()){
        //    Ingreso i = iterador.next();
        //
        //    long dias = ChronoUnit.DAYS.between(i.getFechaAlta(), i.getFechaIngreso());
        //    long coste = 700 * dias;
        //    if (i.getArea().getNombre().equals("Traumatología")){
        //        coste *= 1.02;
        //    }
        //    costeAcumulado += coste;
        //}
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "fechaIngreso=" + fechaIngreso +
                ", patologia='" + patologia + '\'' +
                ", ingresos=" + ingresos +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
