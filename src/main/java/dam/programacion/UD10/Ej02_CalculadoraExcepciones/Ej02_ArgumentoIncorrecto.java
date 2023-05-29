/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.programacion.UD10.Ej02_CalculadoraExcepciones;

import java.util.InputMismatchException;

/**
 *
 * @author nccasares
 */
public class Ej02_ArgumentoIncorrecto extends InputMismatchException{

    public Ej02_ArgumentoIncorrecto() {
    }

    public Ej02_ArgumentoIncorrecto(String s) {
        super(s);
        System.out.println("***SE HA INTRODUCIDO UN FORMATO DE DATO INCORRECTO");
    }
    
}
