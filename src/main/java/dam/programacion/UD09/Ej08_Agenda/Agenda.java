package dam.programacion.UD09.Ej08_Agenda;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contacto> contactos = new ArrayList<>();
    private final int size;

    //La agenda se podrá crear de dos formas, indicándole el tamaño o con un tamaño por defecto (10)
    public Agenda(){
        size = 10;
    }
    public Agenda(int size){
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    /**
     * Añade un contacto a la agenda, si no se pueden meter más
     * a la agenda se indicará por pantalla. No se pueden meter contactos que existan, es decir,
     * no podemos duplicar nombres, aunque tengan distinto teléfono.
     */
    public void anhadirContacto(Contacto c){
        if (!agendaLlena()){
            if (existeContacto(buscaContacto(c.getNombre()))){
                System.out.println("Ya existe un contacto con ese nombre.");
            } else {
                contactos.add(c);
                System.out.println("Se ha añadido el contacto: " + c.toString() + ".");
            }
        } else {
            System.out.println("Agenda llena, no se pueden añadir más contactos.");
        }

    }
    //Indica si el contacto pasado existe o no.
    public boolean existeContacto(Contacto c) {
        boolean existe = false;
        for (Contacto contacto: contactos){
            if (contacto.getNombre().equals(c.getNombre())){
                existe = true;
            }
        }
        return existe;
    }
    //Lista toda la agenda
    public void listarContactos() {
        for (Contacto c : contactos){
            System.out.println(c.toString());
        }
    }

    //Busca un contacto por su nombre y muestra su teléfono.
    public Contacto buscaContacto(String nombre) {
        Contacto contacto = null;

        for (Contacto c: contactos){
            if (c.getNombre().equals(nombre)){
                contacto = c;
            }
        }

        return contacto;
    }
    //Elimina el contacto de la agenda, indica si se ha eliminado o no por pantalla
    public void eliminarContacto(Contacto c) {
        if (contactos.remove(c)) {
            System.out.println("Se ha eliminado el contacto.");
        } else {
            System.out.println("No se ha podido eliminar el contacto.");
        }
    }
    //Indica si la agenda está llena.
    public boolean agendaLlena() {
        return contactos.size() >= this.size;
    }

    //Indica cuántos contactos más podemos meter.
    public int huecosLibres() {
      return (size - contactos.size());
    }
}
