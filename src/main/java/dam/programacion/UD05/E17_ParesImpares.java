package dam.programacion.UD05;

import java.util.Scanner;

public class E17_ParesImpares {
    public static void main(String[] args) {
        // Dados 10 números enteros que se ingresan por teclado,
        // calcular cuántos de ellos son pares, cuánto suman los pares,
        // el promedio de los impares y la suma total
        contadorParesImpares();
    }

    public static void contadorParesImpares(){
        Scanner sc1;

        int contadorPares = 0;
        int contadorImpares = 0;
        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 0; i < 10; i++){
            System.out.println("Introduzca un número entero");
            sc1 = new Scanner(System.in);
            int auxNumero = sc1.nextInt();

            if (auxNumero % 2 == 0) {
                //caso par
                sumaPares += auxNumero;
                contadorPares++;
            } else {
                //caso impar
                sumaImpares += auxNumero;
                contadorImpares++;
            }
        }
        if(contadorImpares > 0) {
            System.out.println("La media de los números impares es: " + sumaImpares / contadorImpares);
        } else {
            System.out.println("No se han introducido números impares.");
        }
        System.out.println("La suma de los números pares es: " + sumaPares);
        System.out.printf("Se han introducido %d números pares y %d números impares\n", contadorPares, contadorImpares);

    }
}
