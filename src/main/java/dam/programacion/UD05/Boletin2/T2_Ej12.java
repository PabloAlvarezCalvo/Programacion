package dam.programacion.UD05.Boletin2;

public class T2_Ej12 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++){
            if (i % 5 != 0) {
                System.out.print(i + ", ");
            }
            if (i % 10 == 0){
                System.out.println();
            }
        }
    }
}
