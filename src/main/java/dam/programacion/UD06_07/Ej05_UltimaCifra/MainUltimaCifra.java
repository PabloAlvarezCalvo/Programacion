package dam.programacion.UD06_07.Ej05_UltimaCifra;

public class MainUltimaCifra {
    public static void main(String[] args) {
        /*
         * Diseña una clase con un método que permita averiguar la última cifra de un número introducido por teclado.
         * */

        UltimaCifra uc = new UltimaCifra((int)(Math.random() * 10000));

        System.out.printf("Última cifra del número: %d, es: %d.\n",uc.getNumero(), uc.getUltimaCifra());
    }
}
