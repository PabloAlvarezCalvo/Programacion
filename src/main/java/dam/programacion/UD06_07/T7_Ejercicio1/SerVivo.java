package dam.programacion.UD06_07.T7_Ejercicio1;

public abstract class SerVivo {
    private String nombreCientifico;
    private String nombreComun;

    public SerVivo(String nombreCientifico, String nombreComun){
        this.nombreCientifico = nombreCientifico;
        this.nombreComun = nombreComun;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public abstract void alimentar();
}
