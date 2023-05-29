package dam.programacion.UD02.Persona;

public class Persona {

    private String nombre, dni;
    private char sexo;
    private double peso, altura;
    private int edad;

    public Persona(){
        this("", 'H', 0);
    }

    public Persona(String nombre, char sexo, int edad){
        this(nombre, "", sexo, edad, 0, 0);
    }

    public Persona(String nombre, String dni, char sexo, int edad, double altura, double peso) {
        this.nombre = nombre;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
    }

    public int calcularIMC(){
        int resultado = 0;
        int imc = 0;
        if ((peso > 0) && (altura > 0)) {
            imc = (int) (peso / Math.pow(altura, 2));
        }

        if (imc < 20) {
            resultado = -1;
        } else if (imc >= 20 && imc <= 25) {
            resultado = 0;
        } else if (imc > 25) {
            resultado = 1;
        }

        return resultado;
    }

    public boolean esMayorDeEdad(){
        return this.edad >= 18;
    }

    void comprobarSexo(char sexo){
        if (!(this.sexo == sexo)) {
           this.sexo = 'H';
        }
    }

    public void generaDNI(){
        int numero = (int)(Math.random() * 99999999 + 1);
        StringBuilder sb = new StringBuilder(Integer.toString(numero));

        String letra = "TRWAGMYFPDXBNJZSQVHLCKE";

        sb.append(letra.charAt(numero % 23));

        this.dni = sb.toString();
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                ", edad=" + edad +
                '}';
    }
}
