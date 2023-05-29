package dam.programacion.UD02.miNumero;

public class MiNumero {
    private int numero;

    public MiNumero(int n) {
        this.numero = n;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDoble() {
        return this.numero * 2;
    }

    public int getTriple() {
        return this.numero * 3;
    }

    public int getCuadruple() {
        return this.numero * 4;
    }


}
