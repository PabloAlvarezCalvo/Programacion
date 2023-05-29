package dam.programacion.UD10.Ej01_Calculadora;

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
public class Ej01_Calculadora {

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
                System.out.println("Introduzca el primer número:");
                n1 = sc.nextInt();

                System.out.println("Introduzca el segundo número:");
                n2 = sc.nextInt();
                
                numValidos = true;
            } catch (InputMismatchException e) {
                System.out.println("Los operandos introducidos deben ser números");
                numValidos = false;
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
                } catch (ArithmeticException ex) {
                    System.out.println("No se permiten las divisiones por 0");
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
