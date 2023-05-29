package dam.programacion.UD05.Boletin2;

public class T2_Ej3 {
    public static void main(String[] args) {
        for(int i = 1; i < 8; i+=2){
            for (int j = 0; j < ((7-i)/ 2); j++){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 5; i > 0; i-=2){
            for (int j = 0; j < ((7-i)/ 2); j++){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
