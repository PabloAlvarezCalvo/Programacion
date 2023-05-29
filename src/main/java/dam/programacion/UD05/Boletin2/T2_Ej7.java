package dam.programacion.UD05.Boletin2;

import java.util.Random;

public class T2_Ej7 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int valor = rnd.nextInt(100, 201);
        if (valor % 2 == 0) {
            System.out.println(valor + " es par.");
        } else {
            System.out.println(valor + " es impar");
        }
    }
}
