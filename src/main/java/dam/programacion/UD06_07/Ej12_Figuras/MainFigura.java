package dam.programacion.UD06_07.Ej12_Figuras;

public class MainFigura {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[3];

        figuras[0] = new Cuadrado("Rojo", 22.5);
        figuras[1] = new Triangulo("Verde", 13, 4.78);
        figuras[2] = new Triangulo("Azul", 3.14, 23);


        for (Figura f : figuras){
            System.out.println(f.calcularArea());
        }
    }
}
