package dam.programacion.UD08;

import java.util.Scanner;

/**
 * Crear un array que contenga 30 números enteros aleatorios entre 0 y 99.
 * Crear un nuevo array con los números primos que haya entre esos 30 números.
 * A continuación debe mostrar el contenido de los dos arrays
 */
public class Ej02_arrayPrimos {

    public static int[] creaArray(){
        int[] array = new int[30];
        System.out.println("CREANDO ARRAY");
        for (int i = 0; i < 30; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    public static int[] elegirPrimos (int[] array) {
        int cont = 0;
        boolean esPrimo;
        int[] primos = new int[30];
        for (int n : array) {
            esPrimo = true;
            for (int i = 2; i < n && esPrimo; i++) {
                if ((n % i) == 0) {
                    esPrimo = false;
                }
            }
            if (esPrimo) {
                primos[cont] = n;
                cont++;
            }
        }
        return primos;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] numeros = creaArray();
        int[] primos = elegirPrimos(numeros);

        System.out.println("Números:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

        System.out.println();
        System.out.println("Números primos:");
        for (int n : primos) {
            System.out.print(n + " ");
        }
    }
}
