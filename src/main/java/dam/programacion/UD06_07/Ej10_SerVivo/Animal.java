package dam.programacion.UD06_07.Ej10_SerVivo;

public class Animal extends SerVivo{
    private double peso, altura;

    public Animal(String nombreCientifico, String nombreComun, double peso, double altura){
        super(nombreCientifico, nombreComun);
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void alimentar() {
        System.out.println("Comiendo hierba.");
    }

    @Override
    public void reproducir() {
        System.out.println("Reproducción.");
    }
}
