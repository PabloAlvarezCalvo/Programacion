package dam.programacion.UD05.Boletin1;

public class T1_Ej11 {
    public static void main(String[] args) {
        int t = 26581215;

        System.out.printf("%d convertido a hh:mm:ss es: %d:%d:%s", t, t /3600, (t % 3600 / 60), t % 60);

    }
}
