package dam.programacion.Examenes.UD11.Ej02;

import Ej02.excepciones.NegativeNumberException;
import Ej02.excepciones.NumberLenghtException;
import Ej02.excepciones.NumberOutOfRangeException;

import java.io.*;
import java.util.Scanner;

public class Ejercicio02 {
    private static final String FICHERO_PATH = "./src/Ej02/provincias.txt";
    private static String[] provincias = {"Pontevedra", "A Coruña", "Ourense", "Lugo"};

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int opcion;
        do {
            opcion = menu();

            switch (opcion){
                case 1 -> registrarCodigos();
                case 2 -> verCodigos();
            }
        } while (opcion != 0);
    }

    private static int menu(){
        System.out.println("\n---------------  Códigos postales  ---------------");
        System.out.println("0 -- Cerrar aplicación");
        System.out.println("1 -- Registrar código postal");
        System.out.println("2 -- Ver códigos postales");
        System.out.println("--------------------------------------------------");
        System.out.println("Seleccione una opción:");
        return Integer.parseInt(sc.nextLine());
    }

    private static void registrarCodigos() {
        String[] codigoPostal = new String[provincias.length];

        for (int i = 0; i < codigoPostal.length; i++){
            boolean valido = false;
            do {
            System.out.println("Por favor, introduzca el código postal asociado a " + provincias[i]);

            String codigo = sc.nextLine();
                try {
                    valido = comprobarCodigo(codigo);

                    if (valido){
                        codigoPostal[i] = codigo;
                    }
                } catch (NegativeNumberException | NumberLenghtException | NumberOutOfRangeException e) {
                    System.out.println(e.getMessage());
                }
            } while (!valido);
        }

        File file = new File(FICHERO_PATH);

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (
                DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))
        ){
            for (int i = 0; i < provincias.length; i++){
                dos.writeUTF(provincias[i]);
                dos.writeUTF(codigoPostal[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean comprobarCodigo(String codigo)
            throws NegativeNumberException, NumberOutOfRangeException, NumberLenghtException {
        if (Integer.parseInt(codigo) < 0){
            throw new NegativeNumberException("Error. Ha introducido un valor negativo");
        }

        int prefix = Integer.parseInt(codigo.substring(0, 2));
        if (prefix < 1 || prefix > 51){
            throw new NumberOutOfRangeException("Error. Las dos primeras cifras deben estar entre 01 y 51.");
        }

        if (codigo.length() != 5){
            throw new NumberLenghtException("Error. El código debe tener una longitud de 5 cifras.");
        }

        return true;
    }

    private static void verCodigos(){
        File file = new File(FICHERO_PATH);

        if (file.exists()) {
            try (
                    DataInputStream dis = new DataInputStream(new FileInputStream(file))
            ) {
                while (true) {
                    System.out.printf("Provincia: %s. Código asociado: %s.\n", dis.readUTF(), dis.readUTF());
                }

            } catch (EOFException e) {
                System.out.println("Se ha terminado de recuperar el archivo.");
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
