package dam.programacion.UD05.Boletin1;

import java.util.Scanner;

public class T3_EjProp5_LuckyNumber {
    public static void main(String[] args) {
        System.out.println("Introduzca su fecha de nacimiento, formato dd-mm-aaaa");
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        System.out.println("El número de la suerte es: " + calcularLuckyNumber(entrada));

    }

    private static int calcularLuckyNumber(String fecha){
        String[] numeros = fecha.split("-");
        int cifra = 0;
        for (String s : numeros) {
            cifra += Integer.parseInt(s);
        }

        while (cifra > 9) {
            cifra = reducirNumero(cifra);
        }

        return cifra;
    }

    private static int reducirNumero(int num){
        String auxNum = Integer.toString(num);
        int luckyNumber = 0;
        for (int i = 0; i < auxNum.length(); i++) {
            luckyNumber += Integer.parseInt(auxNum.substring(i, i+1));
        }


        return luckyNumber;
    }
}
