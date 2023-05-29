package dam.programacion.UD10.Ej04;

import java.util.InputMismatchException;

public class Ej04_ArgumentoIncorrecto extends InputMismatchException {

    public Ej04_ArgumentoIncorrecto(String s) {
        super(s);
        //System.out.println("***SE HA INTRODUCIDO UN FORMATO DE DATO INCORRECTO");
    }
}
