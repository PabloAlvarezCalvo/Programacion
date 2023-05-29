package dam.programacion.UD06_07.Ej13_Sorteo;

public class MainSorteo {
    public static void main(String[] args) {
        Sorteo d4 = new Dado(4);
        d4.lanzar();

        Sorteo d6 = new Dado(6);
        d6.lanzar();

        Sorteo d8 = new Dado(8);
        d8.lanzar();

        Sorteo d10 = new Dado(10);
        d10.lanzar();

        Sorteo d12 = new Dado(12);
        d12.lanzar();

        Sorteo d20 = new Dado(20);
        d20.lanzar();

        Sorteo d100 = new Dado(100);
        d100.lanzar();

        Sorteo moneda = new Moneda();
        moneda.lanzar();
    }
}
