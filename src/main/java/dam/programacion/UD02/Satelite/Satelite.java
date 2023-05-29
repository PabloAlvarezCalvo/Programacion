package dam.programacion.UD02.Satelite;

public class Satelite {

    private double altura;
    private double paralelo;
    private double meridiano;

    public Satelite() {
    }

    public Satelite(double altura, double paralelo, double meridiano) {
        this.altura = altura;
        this.paralelo = paralelo;
        this.meridiano = meridiano;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getParalelo() {
        return paralelo;
    }

    public void setParalelo(double paralelo) {
        this.paralelo = paralelo;
    }

    public double getMeridiano() {
        return meridiano;
    }

    public void setMeridiano(double meridiano) {
        this.meridiano = meridiano;
    }

    public void variarAltura(double desplazamiento){
        altura += desplazamiento;
    }

    public boolean enOrbita(){
        return altura > 0;
    }

    public void variaPosicion(double variaP, double variaM){
        this.paralelo += variaP;
        this.meridiano += variaM;
    }

    @Override
    public String toString() {
        return "Satelite{" +
                "altura=" + altura +
                ", paralelo=" + paralelo +
                ", meridiano=" + meridiano +
                '}';
    }
}
