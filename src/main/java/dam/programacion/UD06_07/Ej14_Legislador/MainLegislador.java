package dam.programacion.UD06_07.Ej14_Legislador;

public class MainLegislador {
    public static void main(String[] args) {
        Legislador senador1 = new Senador(
                                "12345678A",
                                "Paco",
                                "Centóllez",
                                48,
                                "A Coruña");

        Legislador diputado1 = new Diputado(
                "87654321Z",
                "Susana",
                "Trípole",
                28,
                "Soria");

        System.out.println(senador1.nombre + " trabaja en: " + senador1.getCamaraEnQueTrabaja());
        System.out.println(diputado1.nombre + " trabaja en: " + diputado1.getCamaraEnQueTrabaja());
    }
}
