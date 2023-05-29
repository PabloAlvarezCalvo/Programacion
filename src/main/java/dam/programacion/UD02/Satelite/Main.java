package dam.programacion.UD02.Satelite;

public class Main {
    public static void main(String[] args) {
        Satelite satelite = new Satelite(0, 20, 20);
        System.out.println("Está el satélite en órbita? " + satelite.enOrbita());

        System.out.println("Establecemos órbita geoestacionaria.");
        satelite.variarAltura(35786);
        System.out.println("Está el satélite en órbita? " + satelite.enOrbita());

        System.out.println(satelite.toString());

    }
}
