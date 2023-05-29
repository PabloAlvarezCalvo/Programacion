package dam.programacion.UD06_07.Ej14_Legislador;

public abstract class Legislador extends Persona{
    protected String provinciaRepresentada;

    public abstract String getCamaraEnQueTrabaja();
}

class Senador extends Legislador {
    public Senador(String dni, String nombre, String apellidos, int edad, String provinciaRepresentada){
        super.dni = dni;
        super.nombre = nombre;
        super.apellidos = apellidos;
        super.edad = edad;
        super.provinciaRepresentada = provinciaRepresentada;
    }

    @Override
    public String getCamaraEnQueTrabaja() {
        return "Senado";
    }

}

class Diputado extends Legislador {
    public Diputado(String dni, String nombre, String apellidos, int edad, String provinciaRepresentada){
        super.dni = dni;
        super.nombre = nombre;
        super.apellidos = apellidos;
        super.edad = edad;
        super.provinciaRepresentada = provinciaRepresentada;
    }

    @Override
    public String getCamaraEnQueTrabaja() {
        return "Congreso de los Diputados";
    }

}
