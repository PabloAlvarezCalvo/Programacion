package dam.programacion.UD05.Boletin1;

import java.util.Scanner;

public class T1_Ej12 {
    public static void main(String[] args) {
        //Realizar un programa que dado un importe en euros nos indique el mínimo número de billetes
        //y la cantidad sobrante que se pueden utilizar para obtener esa cantidad.
        //Ejemplo: 232€ = 1x 200€, 1x 20€, 1x 10€, sobran 2€.
        System.out.println("Introduzca una cantidad:");
        Scanner sc1 = new Scanner(System.in);
        int cantidad = sc1.nextInt();
        calcularBilletes(cantidad);
    }

    private static void calcularBilletes (int cantidad){
        int[] billetes = {500, 200, 100, 50, 20, 10 , 5};
        int[] resultado = {0, 0 ,0 ,0 ,0 ,0 , 0};

        for (int i = 0; i < billetes.length; i++){
            resultado[i] = cantidad / billetes[i];
            cantidad %= billetes[i];
        }
        System.out.println(cantidad + "€ descompuesto en billetes es: ");
        for (int i = 0; i < billetes.length; i++) {
            if (resultado[i] > 0) {
                System.out.println(resultado[i] + " billete de " + billetes[i] + "€");
            }
        }
        System.out.println("Sobran " + cantidad + "€");

        }
}
