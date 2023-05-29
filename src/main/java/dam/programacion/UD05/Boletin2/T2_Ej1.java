package dam.programacion.UD05.Boletin2;

import java.util.Arrays;
import java.util.Scanner;

public class T2_Ej1 {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Introduzca primer número");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        System.out.println("Introduzca segundo número");
        sc = new Scanner(System.in);
        b = sc.nextInt();

        System.out.println("Introduzca tercer número");
        sc = new Scanner(System.in);
        c = sc.nextInt();


        mostrarMayorMenor(a, b, c);
    }

    private static void mostrarMayorMenor(int a, int b, int c){
        int[] nums = {a, b, c};
        int mayor, menor;

        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < i; j++){
                if (nums[j] > nums[j+1]){
                    int aux = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = aux;
                }
            }
        }
        System.out.println("En la colección: " + Arrays.toString(nums) + ", " + nums[0] + " es el menor y " + nums[2] + " es el mayor.");
    }
}
