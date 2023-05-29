package dam.programacion.UD05;

import java.util.Scanner;

public class E19_MayorMenorSerie {
    public static void main(String[] args) {
        mayorMenorSerie();
    }
    public static void mayorMenorSerie(){
        // Algoritmo que imprima el mayor y el menor número de una serie
        // de números introducidos por teclado(-1 para salir)
        int auxScanner;
        int mayor = 0; int menor = 0;
        do {
            System.out.println("Introduzca un número, escriba -1 para salir.");
            Scanner sc1 = new Scanner(System.in);
            auxScanner = sc1.nextInt();

            if (auxScanner != -1) {
                if (auxScanner > mayor) {
                    mayor = auxScanner;
                }
                if (auxScanner < menor) {
                    menor = auxScanner;
                }
            }

        } while (auxScanner != -1);

        System.out.printf("El número menor de la serie introducida es %d y el mayor es %d.\n", menor, mayor);

    }
}
