package dam.programacion.Examenes.UD11.Ej03;

import Ej03.model.Libro;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio03 {
    private static final String FICHERO_PATH = "./src/Ej03/libros.txt";
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;

        do {
            opcion = menu();

            switch (opcion){
                case 1 -> addLibro();
                case 2 -> consultarLibro();
                case 3 -> listarLibros();
                case 4 -> eliminarLibros();
            }
        } while(opcion != 0);
    }

    private static int menu(){
        System.out.println("\n----------  Registro Libros ----------");
        System.out.println("0 -- Cerrar aplicación");
        System.out.println("1 -- Añadir libro");
        System.out.println("2 -- Consultar libro por título");
        System.out.println("3 -- Listar libros");
        System.out.println("4 -- Eliminar libro por titulo");
        System.out.println("-----------------------------------------");
        return Integer.parseInt(sc.nextLine());
    }

    private static void addLibro(){
        System.out.println("Introduzca el título del libro:");
        String titulo = sc.nextLine();
        System.out.println("Introduzca el autor del libro:");
        String autor = sc.nextLine();
        System.out.println("Introduzca la editorial del libro:");
        String editorial = sc.nextLine();
        System.out.println("Introduzca el número de páginas del libro:");
        int paginas = Integer.parseInt(sc.nextLine());

        Libro libro = new Libro(titulo, autor, editorial, paginas);

        ArrayList<Libro> libros = recuperarLibros();
        libros.add(libro);

        File file = new File(FICHERO_PATH);
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))
        ){
            for (Libro l : libros){
                oos.writeObject(l);
                oos.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void consultarLibro(){
        System.out.println("Introduzca el título del libro a consultar:");
        String titulo = sc.nextLine();

        for (Libro l : recuperarLibros()){
            if (titulo.equals(l.getTitulo())) {
                mostrarInfo(l);
            }
        }
    }

    private static void listarLibros(){
        System.out.println("Recuperando los libros registrados...");
        for (Libro l : recuperarLibros()){
            mostrarInfo(l);
        }
    }

    public static void eliminarLibros() {
        ArrayList<Libro> libros = recuperarLibros();

        System.out.println("Introduzca el título del libro a eliminar:");
        String titulo = sc.nextLine();

        libros.removeIf(l -> titulo.equals(l.getTitulo()));

        File file = new File(FICHERO_PATH);

        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))
        ){
            for (Libro l : libros){
                oos.writeObject(l);
                oos.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static ArrayList<Libro> recuperarLibros(){
        ArrayList<Libro> libros = new ArrayList<>();

        File file = new File(FICHERO_PATH);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try (
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))
        ){
            while(true){
                try {
                    Libro libro = (Libro) ois.readObject();
                    libros.add(libro);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        } catch (EOFException e) {
            //
        } catch(IOException e) {
            e.printStackTrace();
        }

        return libros;
    }

    private static void mostrarInfo(Libro l){
        System.out.println("--Información registrada--");
        System.out.println("Título: " + l.getTitulo());
        System.out.println("Autor: " + l.getAutor());
        System.out.println("Editorial: " + l.getEditorial());
        System.out.println("Número de páginas: " + l.getNumeroPaginas());
        System.out.println("-------------------------------");
    }
}
