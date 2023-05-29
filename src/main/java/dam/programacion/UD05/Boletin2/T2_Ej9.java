package dam.programacion.UD05.Boletin2;

import java.util.Scanner;

public class T2_Ej9 {
    public static void main(String[] args) {
        System.out.println("Introduzca un numero:");
        Scanner sc = new Scanner(System.in);
        esOmirp(Math.max(sc.nextInt(), 1));
    }

    private static void esOmirp(int num){
        int inverso = Integer.parseInt(new StringBuilder(Integer.toString(num)).reverse().toString());
        boolean esPrimo = esPrimo(num);
        boolean esOmirp = esPrimo(inverso);

        if (esPrimo && esOmirp){
            System.out.println(num + " es un numero Omirp.");
        } else {
            System.out.println(num + " no es un numero Omirp.");
        }
    }

    private  static boolean esPrimo(int num){
        boolean esPrimo = false;
        int contadorDivisores = 0;

        for (int i = 1; i < num; i++){
            if (num % i == 0){
                contadorDivisores++;
            }
        }

        if (contadorDivisores >= 2) {
            return false;
        } else {
            return true;
        }
    }
}
