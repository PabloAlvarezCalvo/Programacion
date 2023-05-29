package dam.programacion.UD06_07.Ej04_Test;

import java.util.Scanner;

public class Test {
    private final int num1, num2;

    public Test(){
        System.out.println("Introduzca un número entero:");
        this.num1 = new Scanner(System.in).nextInt();

        System.out.println("Introduzca un segundo número entero:");
        this.num2 = new Scanner(System.in).nextInt();
    }

    public void mostrarOperaciones(){
        System.out.printf("Suma %d + %d = %d\n", num1, num2, num1 + num2);
        System.out.printf("Resta %d - %d = %d\n", num1, num2, num1 - num2);
        System.out.printf("Multiplicación %d * %d = %d\n", num1, num2, num1 * num2);
        try {
            System.out.printf("Divisón %d / %d = %.02f\n", num1, num2, ((double)num1 / (double)num2));
        } catch (Exception e) {
            System.out.println("Error, división entre 0.");
        }
    }
}
