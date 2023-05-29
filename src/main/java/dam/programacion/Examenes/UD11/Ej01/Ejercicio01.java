package dam.programacion.Examenes.UD11.Ej01;

import java.io.File;
import java.util.Scanner;

public class Ejercicio01 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        datosFicheros();
    }

    private static void datosFicheros(){
        System.out.println("Introduzca la ruta del directorio:");
        String path = sc.nextLine();
        System.out.println("Introduzca el prefijo de los ficheros (máximo 4 caracteres):");
        String prefix = sc.nextLine();

        File file = new File(path);

        if (file.isDirectory() && file.exists()){
            File[] files = file.listFiles();

            for (int i = 0; i < files.length; i++){
                File f = files[i];
                if (f.getName().startsWith(prefix)){
                    System.out.println("[" + i + "]-------------------");
                    System.out.println("Archivo: " + f.getName());
                    System.out.println("Ruta absoluta: " + f.getAbsolutePath());
                    System.out.println(file.canRead() ? "Tiene permisos de lectura." : "No tiene permisos de lectura.");
                    System.out.println(file.canWrite() ? "Tiene permisos de escritura." : "No tiene permisos de escritura.");
                    System.out.println("Tamaño: " + file.length() /1000 + " KB.");
                    System.out.println("------------------------------");
                }
            }
        } else {
            System.out.println("La ruta no existe o no es un directorio.");
        }

    }
}
