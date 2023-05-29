package dam.programacion.UD06_07.Ej18_biblioteca;

public class MainBiblioteca {
    public static void main(String[] args) {
        Prestable[] publicaciones = new Publicacion[2];

        publicaciones[0] = new Libro("123", "El Principato", 2021);
        publicaciones[1] = new Revista("222", "Hola!", 2022, 264);

        publicaciones[0].prestar();

        for (Prestable p : publicaciones){
            System.out.println(p.toString());
        }
    }
}
