package dam.programacion.UD06_07.Ej08_Cuenta.ConTitular;

public class Titular {

    /**
     * Vamos a crear una clase Titular. Sus atributos son: nombre, edad y DNI. Construye los siguientes
     * métodos para la clase:
     *
     * Un constructor, donde los datos pueden estar vacíos.
     * Los setters y getters para cada uno de los atributos.
     * mostrar(): Muestra los datos de la persona.
     * esMayorDeEdad(): Devuelve un valor lógico indicando si es mayor de edad.
     *
     * A continuación, sustituye en la clase Cuenta y CuentaJoven todas las referencias al titular,
     * para que, en vez de gestionar sus datos a través de atributos, lo realice mediante un objeto de tipo Titular.
     *
     * */


    private String nombre;
    private int edad;
    private String Dni;

    public Titular() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public boolean esMayorDeEdad(){
        return this.edad >= 18;
    }

    public String mostrar() {
        return "Titular{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", Dni='" + Dni + '\'' +
                '}';
    }
}
