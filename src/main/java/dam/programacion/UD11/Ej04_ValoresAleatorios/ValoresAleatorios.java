package dam.programacion.UD11.Ej04_ValoresAleatorios;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.*;

public class ValoresAleatorios {
    /*
     * Implementar un programa que abra un fichero y escriba 100 valores numéricos enteros obtenidos aleatoriamente.
     * A continuación, el programa deberá mostrar su contenido en pantalla y calcular su media.
     * Si se abre el fichero con el bloc de notas veremos que algunos caracteres son legibles.
     */
    private final static String FILE_PATH = "./src/Ej04_ValoresAleatorios/100numeros.txt";
    public static void main(String[] args) {
        valoresAleatorios();
    }
    private static void valoresAleatorios(){
        DataOutputStream dos;
        DataInputStream dis;
        try {
            Path path = Paths.get(FILE_PATH);
            dos = new DataOutputStream(Files.newOutputStream(path, CREATE, APPEND));
            dis = new DataInputStream(new FileInputStream(FILE_PATH));
            for (int i = 0; i < 100; i++) {
                dos.writeInt((int)(Math.random() * 100));
            }
            int total = 0;
            int count = 0;
            while (dis.available() != 0) {
                int temp = dis.readInt();
                System.out.print(temp + " ");
                total += temp;
                count++;
            }
            System.out.printf("\nEl fichero contiene %d números.\n", count);
            System.out.println("La media es: " + (total / count));
            dos.close();
            dis.close();
            if (count >= 1000) {
                try(OutputStream fic = Files.newOutputStream(path, DELETE_ON_CLOSE)) {
                    System.out.println("Se han excedido los 1000 números. Fichero eliminado");
                }catch (Exception e){
                    System.err.println(e.getMessage());
                }
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Error: No se ha encontrado el fichero.");
        } catch (IOException ex) {
            System.err.println("Error al manipular el fichero.");
        }
    }
}
