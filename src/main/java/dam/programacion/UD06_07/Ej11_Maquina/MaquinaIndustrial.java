package dam.programacion.UD06_07.Ej11_Maquina;

public class MaquinaIndustrial extends Maquina {

    public MaquinaIndustrial(String numSerie, String modelo, int horasFuncionamiento){
        super(numSerie, modelo, horasFuncionamiento);
    }
    @Override
    public void apagar() {
        System.out.println("Apagando máquina industrial.");
    }

    @Override
    public void encender() {
        System.out.println("Apagando máquina industrial.");
    }
}
