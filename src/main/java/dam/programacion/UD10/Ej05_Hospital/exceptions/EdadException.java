package dam.programacion.UD10.Ej05_Hospital.exceptions;

import java.util.InputMismatchException;

public class EdadException extends InputMismatchException {
    public EdadException(String m) {
        super(m);
    }
}
