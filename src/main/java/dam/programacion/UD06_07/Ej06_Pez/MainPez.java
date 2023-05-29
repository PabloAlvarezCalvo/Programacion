package dam.programacion.UD06_07.Ej06_Pez;

public class MainPez {
    public static void main(String[] args) {
        /*
         * Realiza una clase pez la cual tendrá un miembro nombre de tipo String el cual podrá ser heredado por sus
         * subclases. Realiza un método getNombre y otro setNombre.
         *
         * Utiliza el objeto this en estos métodos.
         *
         * Realiza un programa que haga un testeo en profundidad de las características de esta clase
         *
         */

        Pez pez = new Pez("Pez");
        System.out.println("Creado pez: " + pez.getNombre() + ".");
        Pez subPez = new SubPez("Pescadilla");
        System.out.println("Creado subpez: " + subPez.getNombre() + ".");
        subPez.setNombre("Congrio");
        System.out.println("Renombrado subPez: " + subPez.getNombre() + ".");
    }
}
