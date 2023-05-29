package dam.programacion.Examenes.UD06_07.Ej02_Tienda.model.producto.bebida;

public class AguaMineral extends Bebida{
    private String manantial;

    public AguaMineral() {
        super();
        this.manantial = "Cerceda";
    }


    public AguaMineral(int id, String nombre, String ubicacion, double precio,
                       String envase, String manantial) {
        super(id, nombre, ubicacion, precio, envase);
        this.manantial = manantial;
    }

    public String getManantial() {
        return manantial;
    }

    public void setManantial(String manantial) {
        this.manantial = manantial;
    }

    @Override
    public double calcularPrecio() {
        if (getEnvase().equals("Botella de cristal")) setPrecio(getPrecio() * 1.1);
        if (getManantial().equals("Aguarón")) setPrecio(getPrecio() + 0.3);
        return getPrecio();
    }

    @Override
    public String toString() {
        return "AguaMineral{" +
                "nombre='" + this.nombre + '\'' +
                ", envase='" + this.envase + '\'' +
                ", manantial='" + this.manantial + '\'' +
                ", precio=" + this.precio +
                '}';
    }
}
