package dam.programacion.UD12.MariaDB;

import java.sql.SQLException;
import java.sql.Statement;

public class MariaDB {
    private static final String DB_NAME = "db_libros";
    public static void crearTableLibros(Statement sentencia) {
        try
        {
            sentencia.execute("CREATE DATABASE IF NOT EXISTS " + DB_NAME + ";");
            sentencia.execute("USE "+ DB_NAME +";");

            sentencia.execute("CREATE TABLE IF NOT EXISTS libros"
                    + "(idLibro INT(5) unsigned zerofill not null auto_increment,"
                    + "titulo VARCHAR(30) not null,"
                    + "precio float not null,"
                    + "autor varchar(9) not null,"
                    + "Primary Key (idLibro),"
                    + "Foreign Key (autor) REFERENCES autores (dni) ON DELETE CASCADE)"
                    + "ENGINE INNODB;");
        } catch(SQLException e) {
            System.out.println(e);
        }
    }

    public static void crearTableAutores(Statement sentencia) {
        try
        {
            sentencia.execute("CREATE DATABASE IF NOT EXISTS " + DB_NAME + ";");
            sentencia.execute("USE "+ DB_NAME +";");

            sentencia.execute("CREATE TABLE IF NOT EXISTS autores"
                    + "(dni VARCHAR(9) not null,"
                    + "nombre VARCHAR(30) not null,"
                    + "nacionalidad VARCHAR(30) not null,"
                    + "Primary Key (dni))"
                    + "ENGINE INNODB;");
        } catch(SQLException e) {
            System.out.println(e);
        }
    }
}