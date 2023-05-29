package dam.programacion.UD06_07.T7_Ejercicio1;

public class Vegetal extends SerVivo{
    private double altura;

    public Vegetal(String nombreCientifico, String nombreComun, double altura){
        super(nombreCientifico, nombreComun);
        this.altura = altura;
    }


    @Override
    public void alimentar() {
        System.out.println("Este ser vivo hace la fotosíntesis");
    }
}
