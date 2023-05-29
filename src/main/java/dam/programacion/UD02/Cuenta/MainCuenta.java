package dam.programacion.UD02.Cuenta;

public class MainCuenta {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Maria", 0);
        Cuenta c2 = new Cuenta("Pepe", 500);

        c1.ingresar(300);
        c2.ingresar(200);

        c1.retirar(450);
        c2.retirar(450);

        System.out.println(c1.getTitular() + " tiene: " + c1.getCantidad());
        System.out.println(c2.getTitular() + " tiene: " + c2.getCantidad());
    }
}
