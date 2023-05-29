package dam.programacion.UD05.Boletin1;

public class T1_Ej8 {
    private static final char[] vocales = {'A', 'E', 'I', 'O', 'U'};

    public static void main(String[] args) {
        char letra = (char) (Math.random() * 26 + 'A');
        boolean vocal = false;
        for (char c : vocales) {
            if (c == letra) {
                vocal = true;
                break;
            }
        }
        String print = vocal ? letra + " es una vocal" : letra + " es una consonante";
        System.out.println(print);
    }
}
