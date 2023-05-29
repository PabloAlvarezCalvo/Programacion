package dam.programacion.UD11.Ej01_ExcluirCaracteres;

import java.io.*;

public class ExcluirCaracteres {
    /*
     * Implementar un programa que lea el contenido de un fichero y muestre por pantalla
     * todos aquellos caracteres de su contenido, exceptuando los espacios y las vocales.
     */

    private final static String FILE_PATH = "./src/Ej01_ExcluirCaracteres/entrada.txt";

    public static void main(String[] args) {
        File file = new File(FILE_PATH);

        try (FileReader fr = new FileReader(file);)
        {
            int read;
            while ((read = fr.read()) != -1) {
                char c = (char)read;
                if (c != 'a' && c != 'A' &&
                    c != 'e' && c != 'E' &&
                    c != 'i' && c != 'I' &&
                    c != 'o' && c != 'O' &&
                    c != 'u' && c != 'U' &&
                    c != ' '
                ) {
                    System.out.print(c);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
