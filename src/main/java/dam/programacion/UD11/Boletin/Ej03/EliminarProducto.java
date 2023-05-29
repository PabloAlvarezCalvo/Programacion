package dam.programacion.UD11.Boletin.Ej03;

import utils.Utils;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EliminarProducto {
    /*
     * Desarrolla un programa que lea datos de 2 arrays, uno con nombres de productos y el otro
     * con sus precios. Almacenar dicho contenido en un fichero, donde cada línea constará de
     * nombre de producto y precio.
     */
    private static final String RUTA_FICHERO = Utils.BOLETIN_PATH + "/Ej03/productos.txt";
    public static void main(String[] args) {
        String[] productos = new String[]{"Producto 1", "Producto 2", "Producto 3"};
        double[] precios = new double[]{35d, 0.5d, 25,50d};

        File file = new File(RUTA_FICHERO);

        try (
                DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))
        ){
            System.out.println("Grabando a archivo...");
            for (int i = 0; i < productos.length; i++){
                dos.writeUTF(productos[i] + ": " + precios[i] + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Recuperar datos
        leerDatos(file);
        // Borrar producto
        borrarDatos(file);
    }

    private static void leerDatos(File file){
        //Recuperar datos
        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))
        ){
            System.out.println("Leyendo de archivo...");
            while(dis.available() != 0) {
                String linea = dis.readUTF();
                System.out.println("Producto: " + linea.split(":")[0] + ", precio: " + linea.split(":")[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void borrarDatos(File file) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre del producto a borrar.");
        String productName = sc.nextLine();

        ArrayList<String> lineas = new ArrayList<>();

        try {
            DataInputStream dis = new DataInputStream(new FileInputStream(file));

            while (dis.available() != 0){
                lineas.add(dis.readUTF());
            }

            DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
            for (String s : lineas){
                if (!s.split(":")[0].trim().equals(productName.trim())){
                    dos.writeUTF(s);
                }
            }

            dis.close();
            dos.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
