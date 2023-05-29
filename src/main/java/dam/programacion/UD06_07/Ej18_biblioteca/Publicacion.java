package dam.programacion.UD06_07.Ej18_biblioteca;

public abstract class Publicacion implements Prestable{
    protected String codigo;
    protected String titulo;
    protected int anhoPublicacion;

    public Publicacion(String codigo, String titulo, int anhoPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anhoPublicacion = anhoPublicacion;
    }

    public abstract int getAnhoPublicacion();
    public abstract String getCodigo();

    @Override
    public abstract void prestar();

    @Override
    public abstract void devolver();
}
