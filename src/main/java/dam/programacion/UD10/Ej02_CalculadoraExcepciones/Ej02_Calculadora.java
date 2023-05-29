package dam.programacion.UD10.Ej02_CalculadoraExcepciones;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author nccasares
 */
public class Ej02_Calculadora {

    public static int suma(int num1, int num2) {
        return num1 + num2;
    }

    public static int resta(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        if (num2 == 0) {
            throw new Ej02_DivisionCeroException("***NO SE PERMITEN LAS DIVISIONES POR 0");
        }
        return num1 / num2;
    }

    public static double potencia(int num1, int num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double resultado = 0;
        int n1 = 0, n2 = 0;
        boolean numValidos = true;
        do {
            sc = new Scanner(System.in);
            try {
                try {
                    System.out.println("Introduzca el primer número:");
                    n1 = sc.nextInt();

                    System.out.println("Introduzca el segundo número:");
                    n2 = sc.nextInt();

                    numValidos = true;
                } catch (InputMismatchException e) {
                    throw new Ej02_ArgumentoIncorrecto("***ERROR DE FORMATO");
                }
            } catch (Ej02_ArgumentoIncorrecto ex) {
                numValidos = false;
                System.out.println(ex.getMessage());
            }
        } while (!numValidos);

        System.out.println("Introduzca la operación a realizar:");
        String op = sc.next();

        switch (op.toLowerCase()) {
            case "suma":
                resultado = suma(n1, n2);
                break;
            case "resta":
                resultado = resta(n1, n2);
                break;
            case "division":
                try {
                    resultado = division(n1, n2);
                } catch (Ej02_DivisionCeroException ex) {
                    System.out.println(ex.getMessage());
                    //ex.printStackTrace();
                } catch (Exception ex) {
                    System.out.println("ERROR " + ex.getMessage());
                }
                break;
            case "multiplicacion":
                resultado = multiplicacion(n1, n2);
                break;
            case "potencia":
                resultado = potencia(n1, n2);
                break;
        }

        System.out.println("El resultado de la operación es: " + resultado);

    }
}
