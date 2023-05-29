package dam.programacion.UD06_07.Ej10_SerVivo;

public abstract class SerVivo {
    private String nombreComun;
    private String nombreCientifico;

    public SerVivo(){

    }

    public SerVivo(String nombreCientifico, String nombreComun){
        this.nombreCientifico = nombreCientifico;
        this.nombreComun = nombreComun;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    @Override
    public String toString() {
        return "SerVivo{" +
                "nombreComun='" + nombreComun + '\'' +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }

    public abstract void alimentar();
    public abstract void reproducir();
}
