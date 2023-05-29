package dam.programacion.UD09.Ej08_Agenda;

import java.util.Scanner;

public class MainAgenda {
    public static void main(String[] args) {
        /**
         * Se va a implementar una agenda telefónica de contactos.
         * Un contacto está definido por un nombre y un teléfono (No es necesario de validar). Un contacto es igual a otro cuando sus nombres son iguales.
         * Una agenda de contactos está formada por un conjunto de contactos
         *
         * La agenda se podrá crear de dos formas, indicándole el tamaño o con un tamaño por defecto (10)
         * Métodos:
         *     • anhadirContacto(Contacto c): Añade un contacto a la agenda, si no se pueden meter más a la agenda se indicará por pantalla. No se pueden meter contactos que existan, es decir, no podemos duplicar nombres, aunque tengan distinto teléfono.
         *     • existeContacto(Conctacto c): indica si el contacto pasado existe o no.
         *     • listarContactos(): Lista toda la agenda
         *     • buscaContacto(String nombre): busca un contacto por su nombre y muestra su teléfono.
         *     • eliminarContacto(Contacto c): elimina el contacto de la agenda, indica si se ha eliminado o no por pantalla
         *     • agendaLlena(): indica si la agenda está llena.
         *     • huecosLibres(): indica cuántos contactos más podemos meter.
         * Crea un menú con opciones por consola para probar todas estas funcionalidades.
         */

        Agenda agenda = crearAgenda();

        int menu;
        do {
            printMenu();

             try {
                 menu = new Scanner(System.in).nextInt();
             } catch (Exception e) {
                 System.err.println(e.getMessage());
                 menu = 0;
             }

            switch (menu) {
                case 1 -> anhadirContacto(agenda);
                case 2 -> listarContactos(agenda);
                case 3 -> buscarContacto(agenda);
                case 4 -> eliminarContacto(agenda);
                case 5 -> comprobarEspacio(agenda);
                case -1 -> System.out.println("Saliendo de la aplicación.");
                default -> System.out.println("Seleccionada operación desconocida.");
            }

        } while (menu  != -1);

    }

    public static Agenda crearAgenda(){
        Agenda agenda;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a generar una agenda.");
        System.out.println("Especifique tamaño, o escriba 0 para tamaño por defecto.");

        int size = sc.nextInt();
        if (size != 0){
            agenda = new Agenda(size);
        } else {
            agenda = new Agenda();
        }

        return agenda;
    }

    private static void printMenu() {
        System.out.println("==========Seleccione una opción==========");
        System.out.println("[1] Añadir contacto [2] Listar contacto");
        System.out.println("[3] Buscar contacto [4] Eliminar contacto");
        System.out.println("[5] Comprobar espacio");
        System.out.println("[-1] Salir");
        System.out.println("=========================================");
    }

    public static void anhadirContacto(Agenda agenda){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Añadir contacto. Introduzca nombre:");
        String nombre = sc1.nextLine();
        System.out.println("Introduzca teléfono:");
        int telefono = sc1.nextInt();
        agenda.anhadirContacto(new Contacto(nombre, telefono));
    }

    public static void listarContactos(Agenda agenda){
        System.out.println("Listar contactos");
        agenda.listarContactos();
    }

    public static void buscarContacto(Agenda agenda) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Buscar contacto. Introduzca el nombre:");
        Contacto contacto = agenda.buscaContacto(sc1.nextLine());
        if (contacto != null) {
            System.out.println("Su teléfono es: " + contacto.getTelefono());
        } else {
            System.out.println("No se ha encontrado un contacto con ese nombre.");
        }
    }

    public static void eliminarContacto(Agenda agenda) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Introduzca el nombre del contacto a eliminar:");
        Contacto c = agenda.buscaContacto(sc1.nextLine());
        agenda.eliminarContacto(c);
    }

    public static void comprobarEspacio(Agenda agenda) {
        System.out.println("Comprobar espacio restante:");
        System.out.printf("Tamaño máximo %d. Espacio disponible: %d.\n",
                agenda.getSize(),
                agenda.huecosLibres()
        );
    }
}
