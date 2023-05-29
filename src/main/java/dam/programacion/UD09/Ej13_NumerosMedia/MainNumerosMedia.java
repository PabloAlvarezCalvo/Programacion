package dam.programacion.UD09.Ej13_NumerosMedia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainNumerosMedia {
    /*
     * Programa Java que lea una serie de valores numéricos enteros desde el teclado y los guarde en un ArrayList
     * de tipo Integer. La lectura de números enteros termina cuando se introduzca el valor -99. Este valor no se guarda
     * en el ArrayList. A continuación el programa mostrará por pantalla el número de valores que se han leído, su suma y su
     * media. Por último se mostrarán todos los valores leídos, indicando cuántos de ellos son mayores que la media.
     *
     */
    private static ArrayList<Integer> numeros = new ArrayList<>();
    public static void main(String[] args) {
        guardarNumeros();

        double media = obtenerMedia();

        System.out.printf("Hay %d valores superiores a la media.\n", compararMedia(media));

    }

    private static void guardarNumeros() {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Introduzca un número, -99 para salir");
            num = sc.nextInt();
            if (num != -99){
                numeros.add(num);
            }
        } while (num != -99);
        System.out.printf("Se han introducido %d valores.\n", numeros.size());
    }

    private static double obtenerMedia() {
        int suma = 0;
        for (Integer i : numeros){
            suma += i;
        }
        double media = (double)suma / numeros.size();
        System.out.printf("Su suma es %d y su media es %.2f.\n", suma, media);
        return media;
    }

    private static int compararMedia(double media) {
        int superiores = 0;

        Iterator<Integer> iterator = numeros.iterator();

        while (iterator.hasNext()){
            Integer num = iterator.next();
            if (num > media) superiores++;
        }

        return superiores;
    }
}
