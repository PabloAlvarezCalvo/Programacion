package dam.programacion.UD05.Boletin2;

import java.util.Scanner;

public class T2_Ej6 {
    public static void main(String[] args) {
        System.out.println("Introduzca número del 1 al 10 para mostrar su tabla de multiplicar;");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = Math.max(num, 1);
        num = Math.min(num, 10);
        mostrarTabla(num);
    }

    private static void mostrarTabla(int num){
        System.out.printf("Tabla del %d\n", num);
        System.out.println("*****");
        for (int i = 1; i < 11; i++){
            System.out.printf("%d x %d = %d\n", num, i, num * i);
        }
        System.out.println("*****");
    }
}
