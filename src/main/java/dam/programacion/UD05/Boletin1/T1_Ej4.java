package dam.programacion.UD05.Boletin1;

public class T1_Ej4 {
    public static void main(String[] args) {
        int num = 5;
        num += num -1 * 4 + 1; //(5 + 5) - (1 * 4) + 1 = 7
        System.out.println(num);
        num = 4;
        num %= 7 * num % 3 * 7  >> 1; //num %= (((num % 3) * 7)) >> 1), num %= (7 >> 1), num %= 3 = 1
        System.out.println(num);
    }
}
