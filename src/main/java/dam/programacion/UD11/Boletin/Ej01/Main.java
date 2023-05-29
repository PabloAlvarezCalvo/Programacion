package dam.programacion.UD11.Boletin.Ej01;

import utils.Utils;

import java.io.*;
import java.util.ArrayList;

public class Main {
    /*
     * A partir de un array con nombres de persona, escribir en un fichero denominado “datos.txt”
     * dichos nombres, cada uno en una línea. A continuación, leer los datos de nuevo del fichero y
     * mostrarlos por pantalla, indicando el índice de la posición que ocupa. Ejemplo de ejecución:
     * 1. Juan
     * 2. María
     * 3. Paco
     */

    private static final String RUTA_FICHERO = Utils.BOLETIN_PATH + "/datos.txt";
    public static void main(String[] args) {
        ArrayList<String> personas = new ArrayList<>();
        personas.add("Juan");
        personas.add("María");
        personas.add("Paco");

        File file = new File(RUTA_FICHERO);

        try {
            boolean result = file.createNewFile();

            if (result){
                DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));

                for (String s : personas){
                    dos.writeUTF(s);
                }

                dos.close();

                DataInputStream dis = new DataInputStream(new FileInputStream(file));

                System.out.println(dis.readUTF(dis));

            } else {
                System.err.println("No se ha podido crear el fichero: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
