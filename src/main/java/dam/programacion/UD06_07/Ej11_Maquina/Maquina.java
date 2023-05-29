package dam.programacion.UD06_07.Ej11_Maquina;

public abstract class Maquina {
    private String numSerie;
    private String modelo;
    private int horasFuncionamiento;

    public Maquina(String numSerie, String modelo, int horasFuncionamiento) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.horasFuncionamiento = horasFuncionamiento;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getHorasFuncionamiento() {
        return horasFuncionamiento;
    }

    public void setHorasFuncionamiento(int horasFuncionamiento) {
        this.horasFuncionamiento = horasFuncionamiento;
    }

    public abstract void apagar();
    public abstract void encender();
}
