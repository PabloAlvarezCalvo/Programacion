package dam.programacion.UD11.Ej_CrearFicheros;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class Main {

    private static final String RUTA_DIRECTORIO = "C:/Users/a21pabloac1/Desktop/Directorio1";
    private static final String FICHERO1 = RUTA_DIRECTORIO + "/fichero1.txt";
    private static final String FICHERO2 = RUTA_DIRECTORIO + "/fichero2.txt";

    public static void main(String[] args) {
        /*
         * Programa que cree una carpeta en una ruta especificada, y dos archivos en ella.
         * Lista los nombres de los archivos y eliminar uno de ellos.
         */

        File directorio = new File(RUTA_DIRECTORIO);

        if (directorio.mkdir()) {
            System.out.println("Se ha creado el directorio: " + directorio.getAbsolutePath());
        }

        File fichero1 = new File(FICHERO1);
        File fichero2 = new File(FICHERO2);

        crearFichero(fichero1);
        crearFichero(fichero2);

        listarFicheros(directorio);

        fichero1.delete();

        listarFicheros(directorio);

    }

    private static void crearFichero(File file){
        System.out.println("Intentando crear el fichero: " + file.getName());

        try {
            if (file.createNewFile()){
                System.out.println("Se ha creado el archivo: " + file.getAbsolutePath() + "\n");
            } else {
                System.out.println("No se ha podido craer el archivo: " + file.getAbsolutePath() + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void listarFicheros(File file){
        System.out.println("Listando directorios:");
        for (File f: Objects.requireNonNull(file.listFiles())){
            System.out.println(f.toString());
        }
        System.out.println();
    }
}
