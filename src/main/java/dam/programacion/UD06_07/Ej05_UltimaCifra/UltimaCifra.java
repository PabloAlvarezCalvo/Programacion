package dam.programacion.UD06_07.Ej05_UltimaCifra;

public class UltimaCifra {
    private int numero;

    public UltimaCifra(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return this.numero;
    }

    public int getUltimaCifra(){
        return numero % 10;
    }
}
