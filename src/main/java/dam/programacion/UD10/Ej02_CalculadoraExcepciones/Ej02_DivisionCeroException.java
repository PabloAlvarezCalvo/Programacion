/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.programacion.UD10.Ej02_CalculadoraExcepciones;


/**
 *
 * @author nccasares
 */
public class Ej02_DivisionCeroException extends ArithmeticException{

    public Ej02_DivisionCeroException() {
    }

    public Ej02_DivisionCeroException(String s) {
        super(s);
        System.out.println("***SE HA PRODUCIDO UN ERROR AL INTENTAR DIVIDIR POR 0");
    }
    
}
