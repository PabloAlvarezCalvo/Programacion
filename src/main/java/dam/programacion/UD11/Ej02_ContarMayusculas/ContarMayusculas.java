package dam.programacion.UD11.Ej02_ContarMayusculas;

import java.io.*;

public class ContarMayusculas {
    /*
     * Realizar un programa que lea el contenido de un fichero y cuente la cantidad de letras mayúsculas.
     */
    private final static String FILE_PATH = "./src/Ej02_ContarMayusculas/entrada.txt";

    public static void main(String[] args) {
        File file = new File(FILE_PATH);

        try (FileReader fr =  new FileReader(file)) {
            int count = 0;
            int c;
            while ((c = fr.read()) != -1) {
                if (c >= 65 && c <= 90) {
                    count++;
                }
            }
            System.out.printf("Se han encontrado %d letras mayúsculas en el fichero.\n", count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
