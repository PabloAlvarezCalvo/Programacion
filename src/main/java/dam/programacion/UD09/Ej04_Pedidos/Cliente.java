package dam.programacion.UD09.Ej04_Pedidos;

public class Cliente {
    private String nif;
    private String razonSocial;

    public Cliente(String nif, String razonSocial) {
        this.nif = nif;
        this.razonSocial = razonSocial;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nif='" + nif + '\'' +
                ", razon social='" + razonSocial + '\'' +
                '}';
    }
}
