package dam.programacion.UD06_07.Ej11_Maquina;

public class MaquinaDomestica extends Maquina {
    private double potenciaConsumo;

    public MaquinaDomestica(String numSerie, String modelo, int horasFuncionamiento, double potenciaConsumo){
        super(numSerie, modelo, horasFuncionamiento);
        this.potenciaConsumo = potenciaConsumo;
    }

    public double getPotenciaConsumo() {
        return potenciaConsumo;
    }

    public void setPotenciaConsumo(double potenciaConsumo) {
        this.potenciaConsumo = potenciaConsumo;
    }

    @Override
    public void apagar() {
        System.out.println("Apagando máquina doméstica.");
    }

    @Override
    public void encender() {
        System.out.println("Apagando máquina doméstica.");
    }
}
