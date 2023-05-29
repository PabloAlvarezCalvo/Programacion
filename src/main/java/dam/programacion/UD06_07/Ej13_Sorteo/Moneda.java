package dam.programacion.UD06_07.Ej13_Sorteo;

public class Moneda extends Sorteo {

    public Moneda() {
        this.posibilidades = 2;
    }

    @Override
    public void lanzar() {
        switch ((int)(Math.random() * posibilidades)){
            case 0:
                    System.out.println("El resultado es cruz.");
                break;

            case 1:
                    System.out.println("El resultado es cara.");
                break;
        }
    }
}
