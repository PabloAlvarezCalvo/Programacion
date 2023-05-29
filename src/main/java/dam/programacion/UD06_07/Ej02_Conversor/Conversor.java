package dam.programacion.UD06_07.Ej02_Conversor;

public class Conversor{
    private int numero;

    public Conversor(int numero){
        this.numero = numero;
    }

    public String getNumero(char parametro){
        return switch (parametro) {
            case 'B' -> Integer.toBinaryString(numero);
            case 'H' -> Integer.toHexString(numero).toUpperCase();
            case 'O' -> Integer.toOctalString(numero);
            default -> Integer.toString(numero);
        };
    }
}
