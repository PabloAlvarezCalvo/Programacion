package dam.programacion.UD02.miNumero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int n = sc.nextInt();
        MiNumero miNumero = new MiNumero(n);
        System.out.printf("El doble de %d es %d.\n", n, miNumero.getDoble());
        System.out.printf("El triple de %d es %d.\n", n, miNumero.getTriple());
        System.out.printf("El cuádruple de %d es %d.\n", n, miNumero.getCuadruple());
    }
}