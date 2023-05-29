package dam.programacion.UD05.Boletin1;

import java.util.Scanner;

public class T1_Ej4Armstrong {
    public static void main(String[] args) {
        System.out.println("Introduzca un numero:");
        Scanner sc1 = new Scanner(System.in);
        int numero = sc1.nextInt();
        if (calcularArmstrong(numero)) {
            System.out.println(numero + " es un numero de Armstrong.");
        } else {
            System.out.println(numero + " no es un numero de Armstrong.");
        };

    }

    private static boolean calcularArmstrong(int num){
        String auxNum = Integer.toString(num);
        int valorArmstrong = 0;
        for (int i = 0; i < auxNum.length(); i++) {
            valorArmstrong += Math.pow(Character.getNumericValue(auxNum.charAt(i)), auxNum.length());
        }

        System.out.println("El valor de Armstrong es: " + valorArmstrong);

        if (num == valorArmstrong) {
            return true;
        } else {
            return false;
        }
    }
}
