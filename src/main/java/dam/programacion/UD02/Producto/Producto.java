package dam.programacion.UD02.Producto;

public class Producto {
    private double precioFinal = 0.0d;
    public static double rebaja = 0;

    Producto(double precio){
        this.precioFinal = precio;
    }

    public double getPrecioFinal(){
        return (this.precioFinal * (1 - rebaja/100));
    }

    public static void infoRebajaActual(){
        System.out.println("Rebaja actual: " + rebaja + "%.");
    }
}
