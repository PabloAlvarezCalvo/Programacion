package dam.programacion.UD11.Boletin.Ej02;

import utils.Utils;

import java.io.*;

public class ArrayProductos {
    /*
     * Desarrolla un programa que lea datos de 2 arrays, uno con nombres de productos y el otro con sus precios.
     * Almacenar dicho contenido en un fichero, donde cada línea constará de nombre de producto y precio.
     */
    private static final String RUTA_FICHERO = Utils.BOLETIN_PATH + "/Ej02/productos.txt";

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


        //Recuperar datos
        leerDatos(file);
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
}
