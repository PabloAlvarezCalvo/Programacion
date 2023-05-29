package dam.programacion.UD10.Ej05_Hospital.exceptions;

import java.util.InputMismatchException;

public class DNIException extends InputMismatchException {
    public DNIException(String m) {
        super(m);
    }
}
