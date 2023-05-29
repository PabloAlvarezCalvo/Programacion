package dam.programacion.UD06_07.Ej03_ConversorFechas;

public class Main {
    public static void main(String[] args) {
        System.out.println("Fecha americana 08/13/1990");
        System.out.println(ConversorFechas.americanoToEuropeo("08/13/1990"));

        System.out.println("Fecha europea 12/01/2022");
        System.out.println(ConversorFechas.europeoToAmericano("12/01/2022"));

        //Fechas incorrectas
        System.out.println("Fecha americana con mes > 12");
        System.out.println(ConversorFechas.americanoToEuropeo("22/13/1990"));

        System.out.println("Fecha europea con mes > 12");
        System.out.println(ConversorFechas.europeoToAmericano("12/13/20000"));
    }
}
