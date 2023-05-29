package dam.programacion.UD06_07.Ej08_Cuenta.ConTitular;

public class Cuenta {
    private Titular titular;
    private double montante;

    public Cuenta(Titular titular){
        this.titular = titular;
    }

    public Cuenta(Titular titular, double montante){
        this.titular = titular;
        this.montante = montante;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public double getMontante() {
        return montante;
    }

    public void setMontante(double montante) {
        this.montante = montante;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + titular.mostrar() + '\'' +
                ", montante=" + montante +
                '}';
    }

    /*ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad
     * introducida es negativa, no se hará nada.
     * retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad
     * actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.

     */

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.montante += cantidad;
        }
    }

    public double retirar(double cantidad){
        if (this.montante > cantidad) {
            this.montante -= cantidad;
        } else {
            this.montante = 0;
        }
        return this.montante;
    }
}
