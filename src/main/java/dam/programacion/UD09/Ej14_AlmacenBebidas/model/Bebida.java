package dam.programacion.UD09.Ej14_AlmacenBebidas.model;

public abstract class Bebida extends Producto {
    private String envase;

    public Bebida() {
        super();
        this.envase = "lata";
    }

    public Bebida(int identificador, String nombre, String localizacion, double precio, String envase) {
        super(identificador, nombre, localizacion, precio);
        this.envase = envase;
    }

    public String getEnvase() {
        return envase;
    }

    public void setEnvase(String envase) {
        this.envase = envase;
    }

    public abstract void calcularPrecio();
}
