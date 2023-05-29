package dam.programacion.UD08;

import java.util.Scanner;

/**
 * Crear una matriz de 4x4 y rellenarla con valores solicitados al usuario
 * Pedir una fila al usuario, comprobar que introduce una fila existente,
 * y sumar los valores de dicha fila.
 *
 * Sumar diagonal
 *
 * Sumar diagonal inversa
 *
 * Media valores matriz
 *
 * Método que reciba otra matriz y devuelva como resultado una matriz
 * que contenga la suma de ambas matrices.
 *
 *
 */
public class Ej04_array4x4 {
    public static void rellenarMatriz(Scanner sc, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Introduzca el contenido de la posición [" + i + "][" + j + "]");
                matriz[i][j] = sc.nextInt();
            }
        }
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
    public static int sumarFila(int[][] matriz, int fila) {
        int suma = 0;
        for (int j = 0; j < matriz.length; j++) {
            suma += matriz[fila][j];
        }
        return suma;
    }

    public static int sumaDiagonal(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j)
                    suma += matriz[i][j];
            }
        }

        /*
        for (int i = 0, j = 0; i < matriz.length; i++, j++) {
            suma += matriz[i][j];
        }
        */
        return suma;
    }

    public static int sumaDiagonalInversa(int[][] matriz) {
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j == matriz.length - 1)
                    suma += matriz[i][j];
            }
        }

       /*
        for (int j = 0, i = 3; j < matriz.length; j++, i--) {
            suma += matriz[i][j];
        }
        */
        return suma;
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

    public static int[][] sumaMatrices (int[][] m1, int [][] m2) {
        int[][] resultado = new int[m1.length][m1[0].length];
        for (int i=0;i<m1.length;i++){
            for (int j=0;j<m1[0].length;j++){
                resultado[i][j]=m1[i][j]+m2[i][j];
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        rellenarMatriz(sc, matriz);
        imprimirMatriz(matriz);

        System.out.println("SUMA FILA:");
        // SUMA FILAS
        int fila;
        do {
            System.out.println("Elige una fila para sumar sus valores:");
            fila = sc.nextInt();
        } while (!(fila >= 0 && fila < matriz.length));

        System.out.println("La suma de la fila " + fila + " es: " + sumarFila(matriz, fila));

        // SUMA DIAGONAL
        System.out.println("SUMA DIAGONAL:");
        System.out.println("La suma de la diagonal es: " + sumaDiagonal(matriz));

        // SUMA DIAGONAL INVERSA
        System.out.println("SUMA DIAGONAL INVERSA:");
        System.out.println("La suma de la diagonal inversa es: " + sumaDiagonalInversa(matriz));

        // MEDIA
        System.out.println("MEDIA MATRIZ:" + mediaMatriz(matriz));

        // SUMA MATRICES
        imprimirMatriz(sumaMatrices(matriz, matriz));
    }


}
