package dam.programacion.UD02.Numero;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Introduzca un numero:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Numero numero = new Numero();
        System.out.printf("Inicizalizado numero con valor %d.\n", numero.getValor());

        numero.setNumero(n);
        System.out.printf("Modificando el valor a %d.\n", numero.getValor());

        System.out.printf("El doble de %d es %d.\n", numero.getValor(), numero.getDoble());
        System.out.printf("El triple de %d es %d.\n", numero.getValor(), numero.getTriple());

        System.out.println("Introduzca cantidad a sumar:");
        numero.sumar(sc.nextInt());
        System.out.printf("El nuevo valor es %d.\n", numero.getValor());


        System.out.println("Introduzca cantidad a restar:");
        numero.restar(sc.nextInt());
        System.out.printf("El nuevo valor es %d.\n", numero.getValor());

    }
}
