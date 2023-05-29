package dam.programacion.Examenes.UD06_07.Ej01_Plataforma;

public class MainContenidoInterfaces {
    public static void main(String[] args) {
        Contenido[] contenidos = new Contenido[2];
        contenidos[0] = new Serie("The Last of us", 4);
        contenidos[1] = new Pelicula("El Padrino", 196);

        contenidos[0].reproducir();
        contenidos[0].parar();
        System.out.println(contenidos[0].toString());
        contenidos[0].reanudar();

        contenidos[1].reproducir();
        contenidos[1].parar();
        contenidos[1].reanudar();
        System.out.println(contenidos[1].toString());
    }
}
