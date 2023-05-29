package dam.programacion.UD05;

import java.util.Scanner;

public class E18_Multiplos3 {
    public static void main(String[] args) {
        //Imprimir y contar los números múltiplos de 3 desde 1 hasta
        // un número que introduzcamos por teclado
        contarMultiplos();
    }

    public static void contarMultiplos() {
        int contadorMultiplos = 0;

        System.out.println("Introduzca un numero entero");
        Scanner sc1 = new Scanner(System.in);
        int auxInput = sc1.nextInt();
        for (int i = 1; i <= auxInput; i++){
            if(i % 3 == 0) {
                contadorMultiplos++;
                System.out.println(i);
            }
        }
        System.out.printf("Se han contado %d múltiplos de 3.\n", contadorMultiplos);
    }
}
