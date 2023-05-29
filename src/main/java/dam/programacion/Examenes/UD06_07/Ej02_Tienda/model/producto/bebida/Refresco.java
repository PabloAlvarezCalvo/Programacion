package dam.programacion.Examenes.UD06_07.Ej02_Tienda.model.producto.bebida;

public class Refresco extends Bebida {
    private double porcentajeAzucar;

    public Refresco(){
        super();
        this.porcentajeAzucar = 0.0;
    }

    public Refresco(int id, String nombre, String ubicacion, double precio,
                    String envase, double porcentajeAzucar) {
        super(id, nombre, ubicacion, precio, envase);
        this.porcentajeAzucar = porcentajeAzucar;
    }

    public double getPorcentajeAzucar() {
        return this.porcentajeAzucar;
    }

    public void setPorcentajeAzucar(double porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }

    @Override
    public double calcularPrecio() {
        if (getEnvase().equals("Lata")) setPrecio(getPrecio() * 0.95);
        if (porcentajeAzucar > 10) setPrecio(getPrecio() * 1.10);
        return getPrecio();
    }

    @Override
    public String toString() {
        return "Refresco{" +
                "nombre='" + this.nombre + '\'' +
                ", envase='" + this.envase + '\'' +
                ", precio=" + this.precio +
                ", porcentajeAzucar=" + this.porcentajeAzucar +
                '}';
    }
}
