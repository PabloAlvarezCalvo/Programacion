package dam.programacion.UD06_07.Ej02_Conversor;

public class MainConversor {
    public static void main(String[] args) {
        /*
         * Realiza una clase conversor que tenga las siguientes características:
         * * Toma como parámetro en el constructor un valor entero
         * * Tiene un método getNumero que dependiendo del parámetros devolverá
         * el mismo número en el siguiente formato
         * Parámetro 	Formato
         * B			Binario (String)
         * H			Hexadecimal (String)
         * O 			Octal (String)
         *
         * Realiza un main para probar lo anterior
         */

        int num = (int)(Math.random() * 101);
        System.out.println("Conversor para el numero:" + num);
        Conversor conversor = new Conversor(num);

        System.out.println("Valor binario:" + conversor.getNumero('B'));
        System.out.println("Valor hexadecimal:" + conversor.getNumero('H'));
        System.out.println("Valor octal:" + conversor.getNumero('O'));

    }
}
