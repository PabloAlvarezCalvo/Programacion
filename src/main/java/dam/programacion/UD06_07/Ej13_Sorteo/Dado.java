package dam.programacion.UD06_07.Ej13_Sorteo;

public class Dado extends Sorteo {

    public Dado(int posibilidades){
        this.posibilidades = posibilidades;
    }

    @Override
    public void lanzar() {
        System.out.println("El resultado de tirar un dado de " + posibilidades
                + " caras es: " + Integer.toString((int)(Math.random() * posibilidades + 1)));
    }
}
