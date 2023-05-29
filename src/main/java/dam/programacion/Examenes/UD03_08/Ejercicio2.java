package dam.programacion.Examenes.UD03_08;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Calcular importe matrícula");
        System.out.println("Introduzca cantidad de asignaturas a matricularse:");
        Scanner sc = new Scanner(System.in);
        int cantidadAsignaturas = sc.nextInt();

        System.out.println("Introduzca su edad:");
        sc = new Scanner(System.in);
        int edad = sc.nextInt();

        System.out.println("El precio de la matricula será de "
                + calcularMatricula(cantidadAsignaturas, edad) + "€.");

    }

    public static double calcularMatricula(int cantidadAsignaturas, int edad){
        int costeBase = cantidadAsignaturas * 60;
        double precioMatricula = costeBase;

        if (edad >= 50) {
            precioMatricula = costeBase * 0.6;
        } else if (edad >= 35) {
            precioMatricula = costeBase * 0.8;
        }

        return precioMatricula;
    }
}
