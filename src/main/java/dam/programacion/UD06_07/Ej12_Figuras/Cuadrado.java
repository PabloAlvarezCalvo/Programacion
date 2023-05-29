package dam.programacion.UD06_07.Ej12_Figuras;

public class Cuadrado extends Figura {
    private double longitud;

    public Cuadrado(String color, double longitud){
        super(color);
        this.longitud = longitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public double calcularArea() {
        return Math.pow(longitud, 2);
    }
}
