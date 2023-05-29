package dam.programacion.Examenes.UD03_08;

import java.util.Arrays;

public class Ejercicio3 {
    private  static final int FILAS = 4;
    private  static final int COLUMNAS = 3;

    public static void main(String[] args) {
        int[][] matriz = new int[FILAS][COLUMNAS];
        //Apartado a, llenar matriz
        matriz = llenarMatriz(matriz);

        //Apartado b, obtener múltiplos de 5 y 7
        int[] listaMultiplos = buscarMultiplos(matriz);
        System.out.println("Los múltiplos de 5 y 7 presentes en la matriz son:");
        System.out.println(Arrays.toString(listaMultiplos));

        //Apartado c, obtener la media del array anterior
        System.out.println("La media de los múltiplos es: " + calcularMedia(listaMultiplos));

    }

    public static int[][] llenarMatriz(int[][] m){
        int filas = m.length;
        int columnas = m[0].length;

        for (int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                m[i][j] = (int)(Math.random() * 100 + 1);
                System.out.print(m[i][j] + ", ");
            }
            System.out.println();
        }
        return m;
    }

    public static int[] buscarMultiplos(int[][] m){
        int filas = m.length;
        int columnas = m[0].length;

        int[] listaMultiplos = new int[0];
        int contadorMultiplos = 0;
        for (int i = 0; i < filas && contadorMultiplos < 12; i++){
            for(int j = 0; j < columnas && contadorMultiplos < 12; j++) {
                if ((m[i][j] % 5 == 0) || (m[i][j] % 7 == 0)) {
                    listaMultiplos = ampliarArray(listaMultiplos, m[i][j]);
                    contadorMultiplos++;
                }
            }
        }
        return listaMultiplos;
    }

    public static int[] ampliarArray(int[] a, int n){
        int[] lista = Arrays.copyOf(a, a.length+1);
        lista[lista.length - 1] = n;

        return lista;
    }

    public static double calcularMedia(int[] numeros){
        double media = 0.0d;

        if (numeros.length > 0) {
            for (int i : numeros){
                media += i;
            }
            return (double)(media/numeros.length);
        } else {
            return 0.0d;
        }
    }
}
