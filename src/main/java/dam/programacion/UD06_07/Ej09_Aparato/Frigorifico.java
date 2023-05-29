package dam.programacion.UD06_07.Ej09_Aparato;

public class Frigorifico extends Aparato {
    /**
     * Crear una subclase llamada Frigorifico:
     * Tendrá como atributos propios capacidad (por defecto 300 litros) y altura (por defecto 170 cm).
     * Constructores:
     * Un constructor por defecto.
     * Un constructor con el precio y peso.
     * Un constructor con la capacidad, la altura y el resto de atributos heredados.
     *
     * Métodos:
     * getters y setters.
     * aplicarDescuento(): A mayores de las bonificaciones aplicadas en Aparato según su color y eficiencia,
     * si el Frigorifico tiene un consumo energético A o B y una capacidad superior a 400 litros, se aplicará otro
     * descuento del 10% sobre el precio de venta.
     */

    private double capacidad = 300.0d;
    private double altura = 170.0d;

    public Frigorifico(){

    }

    public Frigorifico(double pvp, double peso){
        super(pvp, peso);
    }

    public Frigorifico(double pvp, Colores color, char consumo, double peso, double capacidad, double altura) {
        super(pvp, color, consumo, peso);
        this.capacidad = capacidad;
        this.altura = altura;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**aplicarDescuento(): A mayores de las bonificaciones aplicadas en Aparato según su color y eficiencia,
     * si el Frigorifico tiene un consumo energético A o B y una capacidad superior a 400 litros, se aplicará otro
     * descuento del 10% sobre el precio de venta.
     *
     */
    @Override
    public double aplicarDescuento(){
        super.aplicarDescuento();
        if ((super.getConsumo() == 'A' || super.getConsumo() == 'B') && capacidad > 400.0) {
            super.setPvp(super.getPvp() * 0.9);
        }
        return super.getPvp();
    }
}
