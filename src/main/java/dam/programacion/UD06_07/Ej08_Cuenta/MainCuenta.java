package dam.programacion.UD06_07.Ej08_Cuenta;

public class MainCuenta {
    public static void main(String[] args) {
        /*
         * Crea una clase Cuenta que tendrá los siguientes atributos:
         * titular
         * cantidad (puede tener decimales).
         *
         * El titular será obligatorio y la cantidad opcional.
         * Crea dos constructores que cumpla lo anterior.
         *
         * Crea sus métodos get, set y toString.
         *
         * Tendrá dos métodos especiales:
         *
         * ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad
         * introducida es negativa, no se hará nada.
         * retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad
         * actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.
         *
         */

        System.out.println("Creada cuenta con 200€.");
        Cuenta cuenta1 = new Cuenta("Pablo", 200);
        System.out.println(cuenta1.toString());
        System.out.println("Intentando retirar 300€.");
        System.out.println("Saldo restante: " + cuenta1.retirar(300) + "€.");
        System.out.println("Ingresando 500€.");
        cuenta1.ingresar(500);
        System.out.println(cuenta1.toString());
        System.out.println("Saldo restante: " + cuenta1.retirar(200) + "€.");
    }
}
