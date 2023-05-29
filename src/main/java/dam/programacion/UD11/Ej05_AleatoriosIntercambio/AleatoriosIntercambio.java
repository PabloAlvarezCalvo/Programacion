package dam.programacion.UD11.Ej05_AleatoriosIntercambio;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.*;

public class AleatoriosIntercambio {
    /*
     * Implementar un programa que abra un fichero y escriba 100 valores numéricos enteros obtenidos aleatoriamente.
     * A continuación, el programa deberá mostrar su contenido en pantalla y calcular su media.
     * Si se abre el fichero con el bloc de notas veremos que algunos caracteres son legibles.
     */

    private final static String DIRECTORY_PATH = "./src/Ej05_AleatoriosIntercambio";
    private final static String NUMEROS_PATH = DIRECTORY_PATH + "/100numeros.txt";
    private final static String FILE1_PATH = DIRECTORY_PATH + "/fichero1.txt";
    private final static String FILE2_PATH = DIRECTORY_PATH + "/fichero2.txt";
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int opcion;

        do {
            opcion = menu();

            switch (opcion) {
                case 0 -> {}
                case 1 -> valoresAleatorios();
                case 2 -> intercambiarFicheros();
            }
        } while(opcion != 0);
    }

    private static int menu(){
        System.out.println("Seleccione un modo.");
        System.out.println("0 - Salir");
        System.out.println("1 - Valores aleatorios");
        System.out.println("2 - Intercambiar ficheros");

        return Integer.parseInt(sc.nextLine());
    }

    private static void valoresAleatorios(){
        Path path = Paths.get(NUMEROS_PATH);
        try(
            DataOutputStream dos = new DataOutputStream(Files.newOutputStream(path, CREATE, APPEND));
            DataInputStream dis = new DataInputStream(Files.newInputStream(path));
        ) {
            for (int i = 0; i < 100; i++) {
                dos.writeInt((int) (Math.random() * 101));
            }

            int sum = 0;
            int count = 0;

            while(dis.available() != 0) {
                int n = dis.readInt();
                sum += n;
                count++;
                System.out.print(n + ", ");
            }

            System.out.printf("\nSe han leído %d valores. La media es %.2f.\n", count, (double)sum/count);

            if (count >= 1000) {
                try(OutputStream fic = Files.newOutputStream(path, DELETE_ON_CLOSE)) {
                    System.out.println("Se han excedido los 1000 números. Fichero eliminado");
                } catch (Exception e){
                    System.err.println(e.getMessage());
                }
            }
        } catch (FileNotFoundException ex) {
            System.err.println("Error: No se ha encontrado el fichero.");
        } catch (IOException ex) {
            System.err.println("Error al manipular el fichero.");
        }
    }

    private static void intercambiarFicheros() {
        File temp;
        DataInputStream fichero1Leer, fichero2Leer, ficheroTemporalLeer;
        DataOutputStream fichero1Escribir, fichero2Escribir, ficheroTemporalEscribir;

        try {
            temp = File.createTempFile("temp", ".txt");

            fichero1Leer = new DataInputStream(new FileInputStream(FILE1_PATH));
            ficheroTemporalEscribir = new DataOutputStream(new FileOutputStream(temp));

            while (fichero1Leer.available() != 0) {
                ficheroTemporalEscribir.write(fichero1Leer.read());
            }

            fichero1Leer.close();
            ficheroTemporalEscribir.close();

            fichero2Leer = new DataInputStream(new FileInputStream(FILE2_PATH));
            fichero1Escribir = new DataOutputStream(new FileOutputStream(FILE1_PATH));

            while (fichero2Leer.available() != 0) {
                fichero1Escribir.write(fichero2Leer.read());
            }

            fichero2Leer.close();
            fichero1Escribir.close();

            ficheroTemporalLeer = new DataInputStream(new FileInputStream(temp));
            fichero2Escribir = new DataOutputStream(new FileOutputStream(FILE2_PATH));

            while (ficheroTemporalLeer.available() != 0) {
                fichero2Escribir.write(ficheroTemporalLeer.read());
            }

            ficheroTemporalLeer.close();
            fichero2Escribir.close();

            System.out.println((temp.delete() ? "Temporal eliminado con exito" : "No se pudo eliminar el temporal"));
        } catch (FileNotFoundException ex) {
            System.err.println("Error al encontrar el fichero");
        } catch (IOException ex) {
            System.err.println("Error al manipular el archivo");
        }
    }
}
