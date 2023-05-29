package dam.programacion.UD09.Ej05_BuscarNombres;

import java.util.ArrayList;
import java.util.Scanner;

public class MainBuscarNombres {
    private static ArrayList<String> cadenas;
    public static void main(String[] args) {
        /**
         * Implementa un método que cree un array de cadenas de texto. A continuación,
         * implementa un método que cargue el array con nombres. Deberá existir otro
         * método que visualice el contenido del array, con el índice de cada posición.
         * Implementar un método que busque un nombre en el array y devuelva su
         * posición. Por último, desarrollar un método para eliminar un nombre de
         * la lista.
         */

        cargarArrayList();

        visualizarArrayList(cadenas);

        buscarNombre(cadenas, "Nombre 4");

        eliminarNombre(cadenas, "Nombre 4");

        visualizarArrayList(cadenas);


    }

    public static void cargarArrayList() {
        System.out.println("Introduzca nombres que desea almacenar en la lista (* para salir):");
        Scanner sc = new Scanner(System.in);
        String cadena = "";
        while (!cadena.equals("*")) {
            cadena = sc.nextLine();
            if (!cadena.equals("*")) {
                cadenas.add(cadena);
                System.out.println("Nombre almacenado en la posición " + cadenas.indexOf(cadena));
            }
        }
    }

    private static void buscarNombre(ArrayList<String> array, String s) {
        System.out.println("Visualizar nombre");
        if (array.contains(s)){
            System.out.println("Encontrado " + s + " en la posición " + array.indexOf(s));
        } else {
            System.out.println("No se ha encontrado el nombre " + s);
        }
    }

    private static void visualizarArrayList(ArrayList<String> cadenas) {
        System.out.println("Visualizar listado");
        for (int i = 0; i < cadenas.size(); i++) {
            System.out.println("[" + i + "]" + cadenas.get(i));
        }
    }

    private static void eliminarNombre(ArrayList<String> cadenas, String s) {
        System.out.println("Eliminar nombre");
        cadenas.remove(s);
    }
}
