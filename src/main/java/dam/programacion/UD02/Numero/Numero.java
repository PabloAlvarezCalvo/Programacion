package dam.programacion.UD02.Numero;

public class Numero {
    private int numero;

    public Numero(){
        this.numero = 0;
    }

    public Numero(int n) {
        this.numero = n;
    }

    public void sumar(int n) {
        this.numero += n;
    }

    public void restar(int n) {
        this.numero -= n;
    }

    public int getValor() {
        return this.numero;
    }

    public int getDoble () {
        return this.numero * 2;
    }

    public int getTriple() {
        return this.numero * 3;
    }

    public void setNumero(int n) {
        this.numero = n;
    }
}
