package dam.programacion.UD09.Ej06_SintesisChar;

import java.util.*;

public class MainPila {
    /**
     * Programa que lea la entrada de teclado hasta recibir un enter como finalización.
     * Cada caracter será almacenado independientemente en una colección que permita recuperar el contenido en orden
     * inverso al que fue introducido.
     * Recibido el enter, recorre la colección mostrando el contenido almacenado.
     * Los caracteres deben leerse por separado y no se debe usar String.
     */
    Stack<Character> pilaCaracteres = new Stack<>();

    public static void main(String[] args) {
        MainPila ejercicio = new MainPila();
        ejercicio.rellenarPila();
        ejercicio.mostrarPila();


    }

    public void rellenarPila(){
        System.out.println("Introduzca caracteres, enter para finalizar:");
        Scanner sc = new Scanner(System.in);
        String s;
        while((s = sc.nextLine()) != ""){
            pilaCaracteres.push(s.charAt(0));
        }
    }
    /* En la resolución de la profesora recorre con un for, pero el pop
     * ya disminuye el tamaño de la pila
     */
    private void mostrarPila() {
        int i = 1;
        while (pilaCaracteres.size() > 0) {
            System.out.println("Cadena " + i++ + ": " + pilaCaracteres.pop());
        }
    }
}
