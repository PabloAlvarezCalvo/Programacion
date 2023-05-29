package dam.programacion.UD05.Boletin1;

public class T1_Ej1Suma {
    static int n1 = 50;
    public static void main(String[] args) {
        int n2 = 30, suma = 0, n3 = 5; //n3 no está inicializado.
        suma = n1 + n2;
        System.out.println("La suma es: " + suma);
        suma = suma + n3;
        System.out.println(suma);
    }
}
