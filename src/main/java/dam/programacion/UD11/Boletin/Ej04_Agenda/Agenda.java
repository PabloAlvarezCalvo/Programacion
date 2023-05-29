package dam.programacion.UD11.Boletin.Ej04_Agenda;

import utils.Utils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.APPEND;

public class Agenda {
    /*
     * Implementar un programa que gestione registros (de 3 campos) almacenados en un fichero.
     * Cada registro deberá tener nombre, dirección y teléfono, y el programa, a través de un menú,
     * deberá permitir añadir registros al fichero, listarlos,
     * buscar uno en concreto por nombre (en caso de que encuentre el contacto, deberá mostrarlo por pantalla,
     * nombre y teléfono) y borrar.
     */
    private static final String RUTA_FICHERO = Utils.BOLETIN_PATH + "/Ej04_Agenda/contactos.txt";
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        agenda();
    }

    private static void agenda(){
        File file = new File(RUTA_FICHERO);

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        int opcion;

        do {
            opcion = menu();
            switch (opcion){
                case 1 -> addContacto();
                case 2 -> listarContactos();
                case 3 -> buscarContacto();
                case 4 -> borrarContacto();
            }
        } while (opcion != 0);
    }

    private static int menu() {
        System.out.println("\n---------- Agenda Contactos ----------");
        System.out.println("0 -- Salir");
        System.out.println("1 -- Añadir contacto");
        System.out.println("2 -- Listar contactos");
        System.out.println("3 -- Buscar contacto");
        System.out.println("4 -- Borrar contacto");
        System.out.println("---------------------------------------");

        return Integer.parseInt(sc.nextLine());
    }

    private static void addContacto() {

        try(
                DataOutputStream oos = new DataOutputStream(Files.newOutputStream(Paths.get(RUTA_FICHERO), APPEND))
        ) {

            System.out.println("Introduzca el nombre del contacto:");
            String nombre = sc.nextLine();

            System.out.println("Introduzca la dirección del contacto:");
            String direccion = sc.nextLine();


            System.out.println("Introduzca el teléfono del contacto:");
            int telefono = Integer.parseInt(sc.nextLine());

            oos.writeUTF(nombre + "," + direccion + "," + telefono + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void listarContactos() {
        ArrayList<Contacto> contactos = leerContactos();
        for (Contacto c : contactos) System.out.println(c);
    }

    private static void buscarContacto() {
        System.out.println("Introduzca el nombre del contacto:");
        String nombre = sc.nextLine();

        for (Contacto c : leerContactos()){
            if (nombre.equals(c.getNombre())){
                System.out.println(c);
            }
        }
    }

    private static void borrarContacto() {
        ArrayList<Contacto> contactos = leerContactos();

        System.out.println("Introduzca el nombre del contacto a borrar");
        String nombre = sc.nextLine();

        contactos.removeIf(c -> nombre.equals(c.getNombre()));

        File file = new File(RUTA_FICHERO);
        file.delete();
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (
                DataOutputStream oos = new DataOutputStream(new FileOutputStream(file))
        ){
            for (Contacto c : contactos){
                oos.writeUTF(c.getNombre() + ", " + c.getDireccion() + ", " + c.getTelefono());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<Contacto> leerContactos() {
        ArrayList<Contacto> contactos = new ArrayList<>();

        try (
                DataInputStream ois = new DataInputStream(Files.newInputStream(Paths.get(RUTA_FICHERO)))
        ) {
            String linea;

            while (!(linea = ois.readUTF()).equals("")) {
                String nombre = linea.split(",")[0];
                String direccion = linea.split(",")[1];
                int telefono = Integer.parseInt(linea.split(",")[2].trim());
                Contacto c = new Contacto(nombre, direccion, telefono);
                contactos.add(c);
            }

        } catch (EOFException ignore) {

        } catch (IOException e) {
            e.printStackTrace();
        }

        return contactos;
    }
}
