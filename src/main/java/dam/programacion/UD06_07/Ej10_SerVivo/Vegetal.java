package dam.programacion.UD06_07.Ej10_SerVivo;

public class Vegetal extends SerVivo{
    private double altura;

    public Vegetal(String nombreCientifico, String nombreComun, double altura){
        super(nombreCientifico, nombreComun);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void alimentar() {
        System.out.println("Haciendo la fotosíntesis");
    }

    @Override
    public void reproducir() {
        System.out.println("Polinización.");
    }
}
