package dam.programacion.UD11.Ej07_ActividadesFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class ActividadesFile {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            opcion = menu();

            switch (opcion){
                case 1 -> listarDirectorios();
                case 2 -> listarExtension();
                case 3 -> comprobarExiste();
                case 4 -> comprobarPermisos();
                case 5 -> comprobarDirectorioOFichero();
                case 6 -> ultimaModificacion();
                case 7 -> comprobarTamanho();
                case 8 -> crearDirectorioFicheros();
            }
        } while (opcion != 0);
    }

    private static int menu(){
        System.out.println("\n--------------- Ficheros ---------------");
        System.out.println("0 -- Salir");
        System.out.println("1 -- Obtener nombres de archivos/directorios");
        System.out.println("2 -- Obtener archivos de una extension especifica");
        System.out.println("3 -- Comprobar si existe cierto fichero");
        System.out.println("4 -- Comprobar si tiene permisos de lectura y escritura");
        System.out.println("5 -- Comprobar si una ruta es un directorio o archivo");
        System.out.println("6 -- Obtener la horas de la ultima modificacion de un archivo");
        System.out.println("7 -- Obtener el tamaño de un archivo en bytes y Kb");
        System.out.println("8 -- Crear carpeta en una ruta especifica y dos archivos");
        System.out.println("-----------------------------------------");

        return Integer.parseInt(sc.nextLine());
    }

    private static void listarDirectorios(){
        System.out.println("\nIntroduzca la ruta:");
        File file = new File(sc.nextLine());

        if (file.exists()){
            File[] ficheros = file.listFiles();
            for (int i = 0; i < ficheros.length; i++) {
                System.out.println("-" + ficheros[i].getName());
            }
        } else {
            System.out.println("La ruta especificada no existe.");
        }
    }

    private static void listarExtension(){
        System.out.println("Introduzca la ruta: ");
        String ruta = sc.nextLine();
        System.out.println("Introduzca la extension: ");
        String extension = sc.nextLine();

        File rutaFile = new File(ruta);
        if (rutaFile.exists()) {
            File[] ficheros = rutaFile.listFiles();
            for (File fichero : ficheros) {
                if (fichero.getAbsolutePath().toLowerCase().endsWith(extension))
                    System.out.println("-" + fichero);
            }
        } else {
            System.err.println("La ruta especificada no existe");
        }
    }

    private static void comprobarExiste(){
        System.out.println("Introduzca la ruta:");
        String ruta = sc.nextLine();
        System.out.println("Introduzca el nombre del fichero");
        String fileName = sc.nextLine();

        File file = new File(ruta + fileName);

        System.out.println(file.exists() ? "El fichero especificado existe." : "No se ha encontrado el fichero.");
    }

    private static void comprobarPermisos(){
        System.out.println("Introduzca la ruta:");
        String ruta = sc.nextLine();
        System.out.println("Introduzca el nombre del fichero");
        String fileName = sc.nextLine();

        File file = new File(ruta + fileName);

        if (file.exists()) {
            System.out.println(file.canRead() ? "Tiene permisos de lectura." : "No tiene permisos de lectura.");
            System.out.println(file.canWrite() ? "Tiene permisos de escritura." : "No tiene permisos de escritura.");
        } else {
            System.out.println("El fichero especificado no existe.");
        }
    }

    private static void comprobarDirectorioOFichero(){
        System.out.println("Introduzca la ruta:");
        String ruta = sc.nextLine();

        File file = new File (ruta);

        if (file.exists()){
            if (file.isDirectory()){
                System.out.println("La ruta especificada es un directorio.");
            } else if (file.isFile()){
                System.out.println("La ruta especificada es un fichero.");
            }
        } else {
            System.out.println("La ruta especificada no existe.");
        }
    }

    private static void ultimaModificacion(){
        System.out.println("Introduzca la ruta:");
        String ruta = sc.nextLine();

        File file = new File (ruta);

        if (file.exists()){
            System.out.println("Última modificación: " + new Date(file.lastModified()));
        } else {
            System.out.println("La ruta especificada no existe.");
        }
    }

    private static void crearDirectorioFicheros(){
        System.out.println("Introduzca la ruta:");
        String path = sc.nextLine();
        System.out.println("Introduzca el nombre del directorio:");
        String folderName = sc.nextLine();
        System.out.println("Introduzca el nombre del fichero 1:");
        String file1Name = sc.nextLine();
        System.out.println("Introduzca el nombre del fichero 2:");
        String file2Name = sc.nextLine();

        File fileDirectorio = new File(path + "/" + folderName);
        File file1 = new File(path + "/" + folderName + "/" + file1Name);
        File file2 = new File(path + "/" + folderName + "/" + file2Name);

        if (!fileDirectorio.exists()){
            boolean result = fileDirectorio.mkdir();
            System.out.println(result ? "Se ha creado el directorio correctamente." : "No ha podido crearse el directorio.");
        } else {
            System.out.println("Ya existe el directorio en la ruta especificada.");
        }

        if (!file1.exists()){
            try {
                boolean result = file1.createNewFile();
                System.out.println(result ? "Se ha creado el fichero correctamente." : "No ha podido crearse el fichero.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Ya existe un archivo con ese nombre.");
        }

        if (!file2.exists()){
            try {
                boolean result = file2.createNewFile();
                System.out.println(result ? "Se ha creado el fichero correctamente." : "No ha podido crearse el fichero.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Ya existe un archivo con ese nombre.");
        }

        System.out.println("Listando contenido del directorio creado:");
        for(File f : fileDirectorio.listFiles()){
            System.out.println(f.toString());
        }

    }

    private static void comprobarTamanho(){
        System.out.println("Introduzca la ruta:");
        String ruta = sc.nextLine();

        File file = new File (ruta);

        if (file.exists()){
            System.out.println("El fichero tiene un tamaño de : " + file.length() / 1024 + " KiB.");
        } else {
            System.out.println("La ruta especificada no existe.");
        }
    }
}
