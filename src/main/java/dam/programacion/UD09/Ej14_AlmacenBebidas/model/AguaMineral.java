package dam.programacion.UD09.Ej14_AlmacenBebidas.model;

public class AguaMineral extends Bebida {

    private String manantial;

    public AguaMineral() {
        super();
        this.manantial = "";
    }

    public AguaMineral(int identificador, String nombre, String localizacion, double precio, String envase, String manantial) {
        super(identificador, nombre, localizacion, precio, envase);
        this.manantial = manantial;
    }

    public String getManantial() {
        return manantial;
    }

    public void setManantial(String manantial) {
        this.manantial = manantial;
    }

    @Override
    public void calcularPrecio() {
        if (getEnvase().equals("botella de cristal")) setPrecio(getPrecio() * 1.10);
        if (getManantial().equals("aguarón")) setPrecio(getPrecio() + 0.30);
    }
}