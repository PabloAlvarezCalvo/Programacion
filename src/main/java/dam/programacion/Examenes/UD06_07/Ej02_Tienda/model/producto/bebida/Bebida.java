package dam.programacion.Examenes.UD06_07.Ej02_Tienda.model.producto.bebida;

import Ej02_Tienda.model.producto.Producto;

public abstract class Bebida extends Producto {
    protected String envase;

    public Bebida(){
        super();
        this.envase = "Botella de plástico";
    }


    public Bebida(int id, String nombre, String ubicacion, double precio, String envase) {
        super(id, nombre, ubicacion, precio);
        this.envase = envase;
    }

    public String getEnvase() {
        return envase;
    }

    public void setEnvase(String envase) {
        this.envase = envase;
    }

    public abstract double calcularPrecio();

    @Override
    public String toString() {
        return "Bebida{" +
                "envase='" + envase + '\'' +
                '}';
    }
}
