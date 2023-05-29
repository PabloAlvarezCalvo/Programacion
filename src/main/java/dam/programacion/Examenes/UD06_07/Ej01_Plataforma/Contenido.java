package dam.programacion.Examenes.UD06_07.Ej01_Plataforma;

public interface Contenido {
    static final int DURACION_MAXIMA_UNIDAD = 400;

    void reproducir();
    void parar();
    void reanudar();
}
