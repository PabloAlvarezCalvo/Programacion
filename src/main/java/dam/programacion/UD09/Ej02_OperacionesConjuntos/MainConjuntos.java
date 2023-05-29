package dam.programacion.UD09.Ej02_OperacionesConjuntos;

import java.util.TreeSet;

public class MainConjuntos {
    public static void main(String[] args) {
        /**
         * Crear dos conjuntos ordenados de String y realizar lo siguiente:
         * Inserciones, borrados y obtención de un subconjunto.
         * Crear un nuevo conjunto que contenga la unión de los 2 conjuntos iniciales.
         * Crear otro conjunto que contenga la diferencia de los dos conjuntos iniciales
         * (eliminar los elementos de c2 en c1).
         */

        TreeSet<String> set1 = crearTreeSet(0, 10);
        TreeSet<String> set2 = crearTreeSet(5, 15);

        System.out.println("---Set 1---");
        System.out.println("Suconjunto parcial de set1:");
        System.out.println(subConjunto(set1, "Elemento 005"));
        borrarElemento(set1, "Elemento 008");

        System.out.println("---Set 2---");
        System.out.println("Suconjunto parcial de set2:");
        System.out.println(subConjunto(set2, "Elemento 011"));
        borrarElemento(set2, "Elemento 020");


        TreeSet<String> set3 = unionConjuntos(set1, set2);
        System.out.println("Conjunto set1 u set2:");
        System.out.println(set3);

        TreeSet<String> set4 = diferenciaConjuntos(set1, set2);
        System.out.println("Conjunto set1 - (set1 ^ set2):");
        System.out.println(set4);

    }

    public static TreeSet<String> crearTreeSet(int inicio, int fin){
        TreeSet<String> set = new TreeSet<>();
        for (int i = inicio; i < fin; i++){
            set.add(String.format("Elemento %03d", i));
        }
        return set;
    }

    public static void borrarElemento(TreeSet<String> set, String elemento){
        boolean contenido = set.contains(elemento);
        System.out.println("Contiene " + elemento + "?: " + contenido);
        if (contenido){
            System.out.println("Eleminando " + elemento + "...");
            set.remove(elemento);
        }

        System.out.println(set);
    }

    public static TreeSet<String> subConjunto(TreeSet<String> set, String elemento){
        return (TreeSet<String>) set.headSet(elemento);
    }

    public static TreeSet<String> unionConjuntos(TreeSet<String> s1, TreeSet<String> s2){
        TreeSet<String> setUnion = new TreeSet<>(s1);
        setUnion.addAll(s2);
        return setUnion;
    }

    public static TreeSet<String> diferenciaConjuntos(TreeSet<String> s1, TreeSet<String> s2){
        TreeSet<String> setUnion = new TreeSet<>();
        setUnion.addAll(s1);
        setUnion.removeAll(s2);
        return setUnion;
    }
}
