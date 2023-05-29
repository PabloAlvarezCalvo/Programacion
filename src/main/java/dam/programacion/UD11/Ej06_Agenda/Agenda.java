package dam.programacion.UD11.Ej06_Agenda;

import java.io.*;
import java.util.Scanner;

public class Agenda {
    /*
     * Implementar un programa que permita leer contactos de un fichero.
     * Deberá poderse buscar contactos entre los datos cargados.
     */

    private final static String DIRECTORY_PATH = "./src/Ej06_Agenda";
    private final static String AGENDA_FILE = DIRECTORY_PATH + "/agenda.txt";
    public static void main(String[] args) {
        Agenda a = new Agenda();
        a.cargarFichero();
        a.busqueda();
    }

    private void cargarFichero(){
        File file = new File(AGENDA_FILE);

        String[] nombres = {"Carla", "Jandro", "Chus"};
        int[] telefonos = {666666666, 636696666, 777777777};


        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));

            for(int i = 0; i < nombres.length; i++){
                dos.writeUTF(nombres[i] + " " + telefonos[i] + "\n");
                System.out.printf("Guardado contacto. Nombre: %s, teléfono: %d.\n", nombres[i], telefonos[i]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void busqueda(){
        File file = new File(AGENDA_FILE);

        System.out.println("Introduzca el nombre del contacto para recuperar su teléfono:");
        String name = new Scanner(System.in).nextLine();

        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))
        ){
            while(true){
                String linea = dis.readUTF();

                if (linea.split(" ") [0].equalsIgnoreCase(name)){
                    System.out.println(linea);
                }
            }
        } catch (EOFException e) {
            System.err.println("Fin de fichero");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
