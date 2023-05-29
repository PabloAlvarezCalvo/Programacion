package dam.programacion.UD09.Ej03_ArrayListNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainNumeros {
    private ArrayList<Integer> listaEnteros = new ArrayList<>();
    public static void main(String[] args) {
        /* Crear un programa que lea la entrada de teclado para elegir entre una serie de opciones de funcionamiento
         * con las que operar sobre una lista de enteros de la siguiente forma:
         * (1) Agregar, (2) Buscar, (3) Modificar elemento, (4) Eliminar elemento
         * (5) Insertar elemento, (6) Mostrar elementos, (7) Orden ascendente
         * (8) Orden descendente, (9) Salir
         */
        MainNumeros mainNumeros = new MainNumeros();
        mainNumeros.leerOpcion();
    }

    public void leerOpcion() {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nLista de Enteros");
            System.out.print("[1] Agregar");
            System.out.print(", [2] Buscar");
            System.out.println(", [3] Modificar elemento");
            System.out.print("[4] Eliminar elemento");
            System.out.print(", [5] Insertar elemento");
            System.out.println(", [6] Mostrar elementos");
            System.out.print("[7] Orden ascendente");
            System.out.print(", [8] Orden descendente");
            System.out.println(", [9] Salir\n");
            System.out.println("Ingrese opcion (1-9): ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1 -> ingresarValor();
                case 2 -> buscarValor();
                case 3 -> modificarValor();
                case 4 -> eliminarValor();
                case 5 -> insertarValor();
                case 6 -> mostrarLista();
                case 7 -> ordenarAscendente();
                case 8 -> ordenarDescendente();
            }
        } while (opcion != 9);
    }

    private void ingresarValor() {
        System.out.println("Introduzca el número a añadir:");
        Scanner sc = new Scanner(System.in);
        listaEnteros.add(sc.nextInt());
    }

    private void buscarValor() {
        System.out.println("Introduzca el número a buscar:");
        Scanner sc = new Scanner(System.in);
        int index = listaEnteros.indexOf(sc.nextInt());
        if (index != -1) {
            System.out.println("El número introducido se encuentra en la posición: " + index);
        } else {
            System.out.println("No se ha encontrado el número introducido.");
        }
    }

    private void modificarValor() {
        System.out.println("Introduzca el número a modificar:");
        int n = new Scanner(System.in).nextInt();
        if (listaEnteros.contains(n)){
            System.out.println("Introduzca el nuevo valor:");
            listaEnteros.set(listaEnteros.indexOf(n), new Scanner(System.in).nextInt());
        } else {
            System.out.println("No se ha encontrado el número " + n + ".");
        }
    }

    private void eliminarValor() {
        System.out.println("Introduzca el número a eliminar:");
        Scanner sc = new Scanner(System.in);
        listaEnteros.remove((Integer) sc.nextInt());
    }

    private void insertarValor() {
        System.out.println("Introduzca el número a insertar:");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Introduzca la posición de inserción (tamaño ArrayList: " + listaEnteros.size() +"):");
        int index = new Scanner(System.in).nextInt();
        listaEnteros.add(index, n);
    }

    public void mostrarLista() {
        if (!listaEnteros.isEmpty()) {
            System.out.println("Elementos de la lista:");
            for (int i = 0; i < listaEnteros.size(); i++) {
                System.out.println(listaEnteros.get(i));
            }
        } else {
            System.out.println("No existen valores en la lista");
        }
    }

    public void ordenarAscendente() {
        Collections.sort(listaEnteros);
        mostrarLista();
    }

    public void ordenarDescendente() {
        Comparator<Integer> comparador = Collections.reverseOrder();
        Collections.sort(listaEnteros, comparador);
        mostrarLista();
    }

}
