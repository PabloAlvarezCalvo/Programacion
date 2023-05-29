package dam.programacion.UD11.Ej03_ContarLineas;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ContarLineas {
    /*
     * Implementa un programa que lea el contenido de un fichero y cuente el número de líneas que tiene el fichero.
     */
    private final static String FILE_PATH = "./src/Ej03_ContarLineas/entrada.txt";
    public static void main(String[] args) {
        File file = new File(FILE_PATH);

        try (FileReader fr = new FileReader(file)){
            System.out.println("Leyendo fichero:");
            int c;
            int count = 0;
            while ((c = fr.read()) != -1){
                System.out.print((char)c);
                if (c == 13) {
                  count++;
                }
            }

            System.out.printf("\n\nSe han encontrado %d líneas en el fichero.\n", count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
