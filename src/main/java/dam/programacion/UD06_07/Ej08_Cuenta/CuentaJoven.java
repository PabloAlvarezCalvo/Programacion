package dam.programacion.UD06_07.Ej08_Cuenta;

public class CuentaJoven extends Cuenta {

    /*
     * Vamos a definir ahora una “Cuenta Joven”, para ello vamos a crear una nueva clase CuentaJoven que deriva de la anterior.
     * Cuando se crea esta nueva clase, además del titular y la cantidad se debe guardar una bonificación que estará expresada
     * en tanto por ciento y la edad del titular de la cuenta joven.
     * Construye los siguientes métodos para la clase:
     *
     * Un constructor.
     * Los setters y getters para el nuevo atributo.
     * En esta ocasión los titulares de este tipo de cuenta tienen que ser mayor de edad., por lo tanto hay que crear un método
     * esTitularValido() que devuelve verdadero si el titular es mayor de edad pero menor de 25 años y falso en caso contrario.
     * Además la retirada de dinero sólo se podrá hacer si el titular es válido.
     * El método mostrar() debe devolver el mensaje de “Cuenta Joven” y la bonificación de la cuenta.
     * Piensa los métodos heredados de la clase madre que hay que reescribir.
     *
     * */

    private double bonificacion;
    private int edad;

    public CuentaJoven(String titular, int montante, double bonificacion, int edad) {
        super(titular, montante);
        this.bonificacion = bonificacion;
        this.edad = edad;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean esTitularValido(){
       return (this.edad >= 18 && this.edad < 25);
    }

    @Override
    public double retirar(double cantidad){
        if (esTitularValido()) {
            super.retirar(cantidad);
        } else {
            System.out.println("No es titular válido.");
        }

        return super.getMontante();
    }

    public String mostrar(){
        return "Cuenta Joven, bonificación: " + this.bonificacion;
    }
}
