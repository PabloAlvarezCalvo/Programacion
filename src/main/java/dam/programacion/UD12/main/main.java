package dam.programacion.UD12.main;

import dam.programacion.UD12.MariaDB.MariaDB;

import java.sql.*;
import java.util.Scanner;

public class main {
    public static final String DB_URL = "jdbc:mariadb://localhost";
    public static final String DB_PORT = "3306"; //TODO dependiendo del PC es 3306 o 3307
    public static final String DB_USER = "root";
    public static final String DB_PWD = "abc123.";

    public static final String DB_CONNECTION = DB_URL + ":" + DB_PORT + "/?user=" + DB_USER + "&password=" + DB_PWD;
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Statement sentencia = null;
        Connection conexion = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        try {
            conexion = DriverManager.getConnection(DB_CONNECTION);
        } catch (SQLException e) {
            System.out.println("No hay ningún driver que reconozca la URL especificada");
        } catch (Exception e) {
            System.out.println("Se ha producido algún otro error");
        }

        try {
            sentencia = conexion.createStatement();
        } catch (SQLException e) {
            System.out.println("Error");
        }

        MariaDB.crearTableAutores(sentencia);
        MariaDB.crearTableLibros(sentencia);


        int opcion;
        do {
            opcion = menu(sentencia);
        } while (opcion != 5);
    }

    private static int menu(Statement sentencia){
        System.out.println("""
                Elija una opción:
                1 -- Inserción de filas.
                2 -- Borrado de filas.
                3 -- Consultas.
                4 -- Modificaciones.
                5 -- Salir.
                """);

        int opcion = Integer.parseInt(sc.nextLine());
        switch (opcion) {
            case 1 -> menuInsertar(sentencia);
            case 2 -> menuBorrar(sentencia);
            case 3 -> menuConsultas(sentencia);
            case 4 -> menuModificar(sentencia);
            default -> {/* Salir */}
        }

        return opcion;
    }

    private static void menuInsertar(Statement sentencia){
        System.out.println("1 -- Inserción de nuevo autor.");
        System.out.println("2 -- Inserción de nuevo libro."); // Para la inserción de un Libro es necesario que ya exista el autor
        System.out.println("3 -- Salir.");
        int opcion = Integer.parseInt(sc.nextLine());

        switch (opcion){
            case 1 -> insertarAutor(sentencia);
            case 2 -> insertarLibro(sentencia);
            default -> {}
        }
    }

    private static void menuBorrar(Statement sentencia){
        System.out.println("1 -- Borrado de libro."); // Cuando borramos el Libro el Autor sigue existiendo
        System.out.println("2 -- Borrado de autor."); // Cuando borramos el Autor desaparecen los Libros de ese Autor
        System.out.println("3 -- Salir.");
        int opcion = Integer.parseInt(sc.nextLine());

        switch (opcion){
            case 1 -> eliminarLibro(sentencia);
            case 2 -> eliminarAutor(sentencia);
            default -> {}
        }
    }

    private static void menuConsultas(Statement sentencia){
        System.out.println("1 -- Consultar datos de un libro por título"); // Consultar datos de un libro por título
        System.out.println("2 -- Consultar libros por autor"); // Introduciendo el nombre de un Autor nos visualice los datos de todos sus Libros
        System.out.println("3 -- Listar todos los libros"); // Listar todos los libros de la base de datos
        System.out.println("4 -- Listar todos los autores con sus libros"); // Listar todos los autores con sus libros
        System.out.println("5 -- Salir.");
        int opcion = Integer.parseInt(sc.nextLine());

        switch (opcion){
            case 1 -> listarLibrosPorTitulo(sentencia);
            case 2 -> listarLibrosPorAutor(sentencia);
            case 3 -> listarLibros(sentencia);
            case 4 -> listarAutoresConLibros(sentencia);
            default -> {}
        }
    }

    private static void menuModificar(Statement sentencia){
        System.out.println("1 -- Modificar libro por título."); // Modificar libro por título
        System.out.println("2 -- Modificar autor por DNI."); //Modificar autor por DNI
        System.out.println("3 -- Salir.");
        int opcion = Integer.parseInt(sc.nextLine());

        switch (opcion){
            case 1 -> modificarLibro(sentencia);
            case 2 -> modificarAutor(sentencia);
            default -> {}
        }
    }

    private static void insertarLibro(Statement sentencia) {
        System.out.println("Título del libro:");
        String titulo = sc.nextLine();
        System.out.println("Precio del libro:");
        float precio = Float.parseFloat(sc.nextLine());
        System.out.println("DNI del autor del libro:");
        String dni = sc.nextLine();

        try {
            sentencia.executeUpdate("INSERT INTO LIBROS (titulo, precio, autor) VALUES('" + titulo + "'," + precio + ",'" + dni + "');");
        } catch (SQLException e) {
            System.err.println("Se ha producido un error al insertar");
        }
    }

    private static void insertarAutor(Statement sentencia) {
        System.out.println("DNI del autor:");
        String dni = sc.nextLine();
        System.out.println("Nombre del autor");
        String nombre = sc.nextLine();
        System.out.println("Nacionalidad del autor:");
        String nacionalidad = sc.nextLine();

        try {
            sentencia.executeUpdate("INSERT INTO autores (dni, nombre, nacionalidad) VALUES('" + dni + "', '" + nombre + "', '" + nacionalidad + "');");
        } catch (SQLException e) {
            System.err.println("Se ha producido un error al insertar");
        }
    }

    public static void listarLibros(Statement sentencia) {
        int cont = 0;

        try {
            ResultSet result = sentencia.executeQuery("SELECT * FROM libros;");

            while (result.next()) {
                cont++;
                System.out.println("Libro " + cont + ": ");

                System.out.println("ID: " + result.getInt("idLibro"));
                System.out.println("Título: " + result.getString("titulo"));
                System.out.println("Precio: " + result.getFloat("precio"));
                System.out.println("Autor: " + result.getString("autor"));
                System.out.println("-----------------------------------------\n");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void listarLibrosPorTitulo(Statement sentencia) {
        int cont = 0;

        try {
            System.out.println("Introduzca el título del libro:");
            String titulo = sc.nextLine();
            ResultSet result = sentencia.executeQuery("SELECT * FROM libros WHERE titulo ='" + titulo + "';");

            while (result.next()) {
                cont++;
                System.out.println("Libro " + cont + ": ");

                System.out.println("ID: " + result.getInt("idLibro"));
                System.out.println("Título: " + result.getString("titulo"));
                System.out.println("Precio: " + result.getFloat("precio"));
                System.out.println("Autor: " + result.getString("autor"));
                System.out.println("-----------------------------------------\n");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void listarLibrosPorAutor(Statement sentencia) {
        int cont = 0;

        try {
            System.out.println("Introduzca el DNI del autor para listar sus libros:");
            String dni = sc.nextLine();

            ResultSet result = sentencia.executeQuery("SELECT * FROM libros WHERE autor ='" + dni + "';");

            while (result.next()) {
                cont++;
                System.out.println("Autor " + cont + ": ");

                System.out.println("DNI: " + result.getString("dni"));
                System.out.println("Nombre: " + result.getString("nombre"));
                System.out.println("Nacionalidad: " + result.getString("nacionalidad"));
                System.out.println("-----------------------------------------\n");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void listarAutoresConLibros(Statement sentencia) {
        int cont = 0;

        try {
            ResultSet result = sentencia.executeQuery("SELECT a.dni, a.nombre, a.nacionalidad, l.idLibro, l.titulo, l.precio FROM autores a LEFT JOIN libros l ON a.dni = l.autor");

            while (result.next()) {
                cont++;
                System.out.println("Autor: " + result.getString("nombre")
                        + ", dni: " + result.getString("dni") + ", nacionalidad: "
                        + result.getString("nacionalidad") + ".");

                System.out.print(result.getInt("idLibro") + ", ");
                System.out.print(result.getString("titulo") + ", ");
                System.out.println(result.getFloat("precio") + "€.");
                System.out.println("-----------------------------------------\n");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void modificarLibro(Statement sentencia) {

        System.out.println("Nombre del libro a modificar");
        ResultSet res = buscarLibro(sentencia);
        if (res != null) {
            System.out.println("Introduzca nuevo nombre del libro:");
            String titulo = sc.nextLine();
            System.out.println("Introduzca nuevo precio del libro:");
            float precio = sc.nextFloat();
            sc = new Scanner(System.in);
            System.out.println("Introduzca el dni del autor del libro:");
            String dni = sc.nextLine();

            try {
                sentencia.executeUpdate("UPDATE libros SET titulo='" + titulo + "', precio='" + precio + "', autor='" + dni +"' WHERE idLibro = '" + res.getInt("idLibro") + "';");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El producto no se encuentra en la base de datos");
        }
    }

    public static void modificarAutor(Statement sentencia) {

        System.out.println("DNI del autor a modificar");

        ResultSet res = buscarAutor(sentencia);
        if (res != null) {
            System.out.println("Introduzca un nuevo nombre para el autor:");
            String nombre = sc.nextLine();
            System.out.println("Introduzca una nueva nacionalidad para el autor:");
            String nacionalidad = sc.nextLine();

            try {
                sentencia.executeUpdate("UPDATE autores SET nombre='" + nombre + "', nacionalidad='" + nacionalidad +"' WHERE dni = '" + res.getString("dni") + "';");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El autor no se encuentra en la base de datos");
        }
    }

    public static void eliminarLibro(Statement sentencia) {
        System.out.println("Introduzca el título del libro a eliminar:");
        ResultSet res = buscarLibro(sentencia);
        if (res != null) {
            try {
                sentencia.execute("DELETE from libros where idLibro='"+ res.getInt("idLibro") +"';");
                System.out.println("Se ha eliminado el libro con éxito.");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El libro no se encuentra en la base de datos");
        }

    }

    public static void eliminarAutor(Statement sentencia) {
        System.out.println("introduzca el dni del autor a eliminar:");
        ResultSet res = buscarAutor(sentencia);
        if (res != null) {
            try {
                sentencia.execute("DELETE from autores where dni='"+ res.getString("dni") +"';");
                System.out.println("Se ha eliminado el autor con éxito.");
            } catch (SQLException e) {
                System.out.println("No se ha podido eliminar el autor. Asegúrese de haber eliminado todos sus libros.");
            }
        } else {
            System.out.println("El autor no se encuentra en la base de datos");
        }

    }

    public static ResultSet buscarLibro(Statement sentencia) {
        String tituloLibro;

        try {
            tituloLibro = sc.nextLine();

            ResultSet result = sentencia.executeQuery("SELECT * FROM libros WHERE titulo = '" + tituloLibro + "';");

            if (result.next()) {
                System.out.println("Los datos del libro buscado son: ");

                System.out.println(" ID libro: " + result.getInt("idLibro"));
                System.out.println(" Titulo: " + result.getString("titulo"));
                System.out.println(" Precio: " + result.getFloat("precio"));
                System.out.println(" Autor: " + result.getString("autor"));
                System.out.println("-----------------------------------------");

                return result;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;
    }

    public static ResultSet buscarAutor(Statement sentencia) {
        String dni;

        try {
            dni = sc.nextLine();

            ResultSet result = sentencia.executeQuery("SELECT * FROM autores WHERE dni = '" + dni + "';");

            if (result.next()) {
                System.out.println("Los datos del autor buscado son: ");

                System.out.println(" DNI: " + result.getString("dni"));
                System.out.println(" Nombre: " + result.getString("nombre"));
                System.out.println(" Nacionalidad: " + result.getString("nacionalidad"));
                System.out.println("-----------------------------------------");

                return result;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;
    }
}
