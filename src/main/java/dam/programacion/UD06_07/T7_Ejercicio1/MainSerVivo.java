package dam.programacion.UD06_07.T7_Ejercicio1;

public class MainSerVivo {
    public static void main(String[] args) {
        Vegetal aloe = new Vegetal("Aloe", "Aloe", 200);
        SerVivo castor = new Animal("Yoqse", "Castor", 200, 5.6);

        aloe.alimentar();
        castor.alimentar();
    }
}
