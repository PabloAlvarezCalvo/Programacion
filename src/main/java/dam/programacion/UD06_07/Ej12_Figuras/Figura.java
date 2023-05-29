package dam.programacion.UD06_07.Ej12_Figuras;

public abstract class Figura {
    private String color;

    public Figura(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calcularArea();
}
