package dam.programacion.UD06_07.Ej07_Empleados;

import Ej07_Empleados.Clases.Directivo;
import Ej07_Empleados.Clases.Empleado;
import Ej07_Empleados.Clases.Oficial;
import Ej07_Empleados.Clases.Tecnico;

import java.time.LocalDate;

public class MainEmpleados {
    public static void main(String[] args) {
        /* Implementar en Java la siguiente jerarquía:
         * La clase Empleado contendrá la siguiente información: nombre, salario, fecha incorporación
         * De la clase Empleado heredarán la clase Directivo, descendiente de la clase Empleado,
         * contendrá, además de los atributos de su clase base, los atributos propios cargo y
         * departamento; y la clase Operario, con su atributo propio área y nave.
         * A su vez, las clases Oficial (atributo propio línea de fabricación)
         * y Técnico (atributo propio sección), serán descendientes de la clase Operario.
         * Todas las clases contendrán un método toString() para mostrar su información.
         * En el main, crear un array de 7 elementos, que contenga empleados de todos los tipos y,
         * posteriormente mostrar su información por pantalla.
         *
         */

        Empleado[] empleados = new Empleado[7];

        empleados[0] = new Empleado("Empleado1", 2000.0, LocalDate.now());
        empleados[1] = new Empleado("Empleado2", 2000.0, LocalDate.now());
        empleados[2] = new Empleado("Empleado3", 2000.0, LocalDate.now());
        empleados[3] = new Directivo("Directivo1", 2000.0, LocalDate.now(), "CEO", "Jefatura");
        empleados[4] = new Oficial("Oficial1", 2000.0, LocalDate.now(), "Ferraje", "Nave 1","Línea 4");
        empleados[5] = new Tecnico("Empleado1", 2000.0, LocalDate.now(), "Prensas", "Nave 2", "Seccion 3");
        empleados[6] = new Directivo("Directivo2", 2000.0, LocalDate.now(), "CTO", "Junta Operativa");

        for (int i = 0; i < empleados.length; i++){
            System.out.println(empleados[i].toString());
        }
    }
}
