package dam.programacion.UD02.Persona;

public class MainPersona {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "", 'H', 23, 1.85, 74);
        persona.generaDNI();

        System.out.println(persona.toString());
        switch (persona.calcularIMC()){
            case -1:
                System.out.println("Subpeso.");
                break;

            case 0:
                System.out.println("Peso normal.");
                break;

            case 1:
                System.out.println("Sobrepeso.");
                break;
        }
    }
}
