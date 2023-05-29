package dam.programacion.UD09.Ej00_Supuesto1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        comprobarHashSet();
        comprobarLinkedHashSet();
        comprobarTreeSet();

    }

    public static void comprobarHashSet(){
        long tiempoInicio = System.currentTimeMillis();
        HashSet<String> hashSet1 = new HashSet<>();
        for (int i = 0; i < 1000000; i++){
            hashSet1.add("Elemento " + i);
        }
        boolean bar = hashSet1.contains("Elemento 2");
        hashSet1.remove("Elemento3");

        long tiempoPasado = System.currentTimeMillis();
        System.out.printf("Con HashSet se tardan: %d millis.\n", (tiempoPasado - tiempoInicio));
    }

    public static void comprobarLinkedHashSet(){
        long tiempoInicio = System.currentTimeMillis();
        LinkedHashSet<String> linkedSet1 = new LinkedHashSet<>();
        for (int i = 0; i < 1000000; i++) {
            linkedSet1.add("Elemento " + i);
        }
        boolean bar = linkedSet1.contains("Elemento 2");
        linkedSet1.remove("Elemento 3");

        long tiempoPasado = System.currentTimeMillis();
        System.out.printf("Con LinkedHashSet se tardan: %d millis.\n", (tiempoPasado - tiempoInicio));
    }

    public static void comprobarTreeSet(){
        long tiempoInicio = System.currentTimeMillis();
        TreeSet<String> treeSet1 = new TreeSet<>();
        for (int i = 0; i < 1000000; i++) {
            treeSet1.add("Elemento " + i);
        }
        boolean bar = treeSet1.contains("Elemento 2");
        treeSet1.remove("Elemento 3");

        long tiempoPasado = System.currentTimeMillis();
        System.out.printf("Con TreeSet se tardan: %d millis.\n", (tiempoPasado - tiempoInicio));
    }
}