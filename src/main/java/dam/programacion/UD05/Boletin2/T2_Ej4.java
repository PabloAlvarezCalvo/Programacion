package dam.programacion.UD05.Boletin2;

public class T2_Ej4 {
    public static void main(String[] args) {
        //la parte de arriba
        for (int i = 1; i < 5; i++) {
            int estrellas = 2 * i - 1;
            int espacios = 4 - i;
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < estrellas; j++) {
                if (j == 0 || j == (estrellas - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        //la parte de abajo
        for (int i = 3; i > 0; i--) {
            int estrellas = 2 * i - 1;
            int espacios = 4 - i;
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < estrellas; j++) {
                if (j == 0 || j == (estrellas - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
