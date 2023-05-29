package dam.programacion.UD06_07.Ej18_biblioteca;

public class Libro extends Publicacion{
    private boolean prestado = false;

    public Libro(String codigo, String titulo, int anhoPublicacion) {
        super(codigo, titulo, anhoPublicacion);
    }

    @Override
    public int getAnhoPublicacion() {
        return super.anhoPublicacion;
    }

    @Override
    public String getCodigo() {
        return super.codigo;
    }


    @Override
    public void prestar() {
        this.prestado = true;
    }

    @Override
    public void devolver() {
        this.prestado = false;
    }

    @Override
    public String toString() {
        return "Codigo: " + super.codigo + ", Titulo: " + super.titulo
                +", Año de publicación: " + super.anhoPublicacion + ", Prestado: "
                + ((prestado)?"Prestado":"Disponible");
    }
}
