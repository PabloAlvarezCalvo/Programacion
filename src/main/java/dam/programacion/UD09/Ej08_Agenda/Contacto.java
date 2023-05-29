package dam.programacion.UD09.Ej08_Agenda;

public class Contacto {
    //Un contacto está definido por un nombre y un teléfono (No es necesario de validar).
    // Un contacto es igual a otro cuando sus nombres son iguales.

    private String nombre;
    private int telefono;

    public Contacto(String nombre, int telefono){
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
