package dam.programacion.Examenes.UD03_08;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Mostrar números primos entre un rango de números");
        System.out.println("Introduzca el rango inferior");
        Scanner sc = new Scanner(System.in);
        int inf = sc.nextInt();
        System.out.println("Introduzca el rango superior");
        sc = new Scanner(System.in);
        int sup = sc.nextInt();

        imprimirPrimios(Math.max(1, Math.min(inf, sup)), Math.max(inf, sup));
    }

    public static void imprimirPrimios(int inf, int sup){
        for (int i = inf; i <= sup; i++){
            int contadorPrimos = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    contadorPrimos++;
                }
            }
            if (!(contadorPrimos > 1)) {
                System.out.println(i);
            }
        }
    }
}