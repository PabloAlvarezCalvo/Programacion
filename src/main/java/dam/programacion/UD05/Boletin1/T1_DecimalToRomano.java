package dam.programacion.UD05.Boletin1;

import java.util.Map;
import java.util.Scanner;

public class T1_DecimalToRomano {
    public static void main(String[] args) {
        System.out.println("Introduzca un numero para convertilo a romano:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num + " convertido a romano es: " + decimalToRomano(num));
    }

    private static String decimalToRomano (int num) {
        //M = 1000, CM = 900, D = 500, CD = 400, C = 100, XC = 90, L = 50, XL = 40, X = 10, IX = 9, V = 5, IV = 4, I = 1

        String[] letras = {"M", "CM","D", "CD", "C", "XC","L", "XL", "X", "IX", "V", "IV", "I"};
        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int[] resultado = {0, 0 , 0, 0, 0, 0, 0, 0, 0 , 0, 0, 0, 0};
        StringBuilder conversion = new StringBuilder("");

        for (int i = 0; i < valores.length; i++) {
            resultado[i] = num / valores[i];
            num %= valores[i];
        }

        for (int i = 0; i < resultado.length; i++){
            for (int j = 0; j < resultado[i]; j++) {
                conversion.append(letras[i]);
            }
        }

        return conversion.toString();
    }
}
