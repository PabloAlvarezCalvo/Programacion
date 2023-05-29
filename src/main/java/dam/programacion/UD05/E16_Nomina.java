package dam.programacion.UD05;

import java.util.Scanner;

public class E16_Nomina {
    private static final double tarifa = 30;

    public static void main(String[] args) {
        //Realice un Pseudocódigo que calcule la nómina salarial neto, de unos obreros cuyo trabajo
        // se paga en horas.
        //El cálculo se realiza de la siguiente forma:
        //- Las primeras 35 horas mensuales a una tarifa fija. (30€, por ejemplo)
        //- Las horas extras se pagan a 1.5 más de la tarifa fija.
        //- Los impuestos a deducir de los trabajadores varian:



        System.out.println("Introduzca el número de horas trabajadas:");
        Scanner sc1 = new Scanner(System.in);
        double horas = sc1.nextDouble();
        calculoNominas(horas);

    }
    public static void calculoNominas(double horasTrabajadas) {
        double salarioBruto, salarioNeto, difHoras;
        if(horasTrabajadas <= 35) {
            salarioBruto = horasTrabajadas * tarifa;
        } else {
            difHoras = horasTrabajadas - 35;
            salarioBruto = 35 * tarifa + difHoras * tarifa * 1.5;
        }
        //Si el sueldo mensual es menor que 1000 €, el sueldo es libre de impuestos
        //En caso contrario, se descontará un 20% de impuestos.
        double impuestos = 0;
        salarioNeto = salarioBruto;
        if (salarioBruto > 1000){
            salarioNeto = salarioBruto * 0.8;
            impuestos = salarioBruto * 0.2;
        }
        System.out.printf("Para un trabajo de %4.2f horas corresponde un salario bruto de %4.2f€," +
                " del que se descuentan %4.2f€ en impuestos para un salario neto de %4.2f€.\n",
                horasTrabajadas, salarioBruto, impuestos, salarioNeto);
    }
}