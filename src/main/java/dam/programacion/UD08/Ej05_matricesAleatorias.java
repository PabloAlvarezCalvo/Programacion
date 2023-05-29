package dam.programacion.UD08;

import java.util.Scanner;

/**
 * Aplicación que solicite por teclado las dimensiones de las matrices,
 * y las genere con números aleatorios.
 *
 * A continuación las muestre y multiplique cada una de ellas por
 * la media de la otra.
 */
public class Ej05_matricesAleatorias {
    public static int[][] generaMatriz () {
        Scanner sn=new Scanner(System.in);

        System.out.println("Indica el tamaño de la matriz:");
        int tam=sn.nextInt();

        int matriz[][]=new int[tam][tam];

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("MATRIZ:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public static int mediaMatriz(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma/(matriz.length*matriz[0].length);
    }

    public static int[][] multiplicarMedia(int[][] matriz, int media) {
        int[][] resultado = new int[matriz.length][matriz.length];
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[0].length;j++){
                resultado[i][j]=matriz[i][j]*media;
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println("CREANDO MATRIZ 1:");
        int[][] m1 = generaMatriz();
        imprimirMatriz(m1);

        System.out.println("CREANDO MATRIZ 2:");
        int[][] m2 = generaMatriz();
        imprimirMatriz(m2);

        System.out.println("MULTIPLICAR MATRIZ 1 POR MEDIA DE M2:");
        int mediaM2 = mediaMatriz(m2);
        System.out.println("MEDIA M2: " + mediaM2);
        imprimirMatriz(multiplicarMedia(m1, mediaM2));

        System.out.println("MULTIPLICAR MATRIZ 2 POR MEDIA DE M1:");
        int mediaM1 = mediaMatriz(m1);
        System.out.println("MEDIA M1: " + mediaM1);
        imprimirMatriz(multiplicarMedia(m2, mediaM2));
    }
}
