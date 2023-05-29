package dam.programacion.UD06_07.Ej09_Aparato;

public class Aparato {
    /**
     * Crear clase Aparato que contenga:
     * Atributos:
     * 	PVP
     * 	Color
     * 	Consumo (letras entre A y F)
     * 	Peso.
     * Por defecto, el color sera blanco, el consumo energético será F, el PVP 100 € y el peso 5 kg. Los posibles colores son blanco, negro, rojo, azul y gris.
     * Constructores:
     * 	Por defecto.
     * 	Uno con el precio y peso. El resto por defecto.
     * 	Uno con todos los atributos.
     * Métodos:
     * Getters y Setters.
     */

    enum Colores {Blanco, Negro, Rojo, Gris};
    private double pvp = 100.0d;
    private Colores color = Colores.Blanco;
    private char consumo = 'F';
    private double peso = 5.0d;

    public Aparato(){

    }

    public Aparato(double pvp, double peso){
        this.pvp = pvp;
        this.peso = peso;
    }

    public Aparato(double pvp, Colores color, char consumo, double peso) {
        this.pvp = pvp;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**comprobarConsumo(char letra):
     * se comprueba que la letra esté entre las válidas.
     * Si no, se asignará la letra por defecto (F). Se invocará al crear el objeto.
     * @param letra
     */
    public void comprobarConsumo(char letra){
        String consumos = "ABCDEF";
        this.consumo = consumos.contains(String.valueOf(letra).toUpperCase()) ? letra : 'F';

    }

    /**aplicarDescuento(): con la nueva normativa vigente, a los electrodomésticos con un menor impacto medioambiental, se les aplicará un descuento:
     * A los electrodomésticos que no empleen esmalte de color (gris), se les aplicará una bonificación de un 5% en el precio de venta.
     *      * * Según consumo energético, se les aplicarán además los siguientes descuentos:
     *      *
     *      * LETRA	DESCUENTO
     *      * A		20%
     *      * B		15%
     *      * C		10%
     *      * D		5%
     *      * E		0
     *      * F		0
     */
    public double aplicarDescuento(){
        if (this.color == Colores.Gris) { this.pvp *= 0.95; }
        switch (this.consumo){
            case 'A' -> this.pvp *= 0.8;
            case 'B' -> this.pvp *= 0.85;
            case 'C' -> this.pvp *= 0.90;
            case 'D' -> this.pvp *= 0.95;
        }

        return this.pvp;
    }
}
