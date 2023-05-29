package dam.programacion.UD06_07.T7_Ejercicio1;

public class Animal extends SerVivo {
    private double peso;
    private double altura;

    public Animal(String nombreCientifico, String nombreComun, double peso, double altura){
        super(nombreCientifico, nombreComun);
        this.peso = peso;
        this.altura = altura;
    }

    @Override
    public void alimentar() {
        System.out.println("Este ser vivo come *ñom ñom*");
    }
}
