package dam.programacion.UD06_07.Ej18_biblioteca;

public class Revista extends Publicacion{
    private int numero;

    public Revista(String codigo, String titulo, int anhoPublicacion, int numero) {
        super(codigo, titulo, anhoPublicacion);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Codigo: " + super.codigo + ", Titulo: " + super.titulo
                +", Año de publicación: " + super.anhoPublicacion + ", Numero: "
                + numero;
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

    }

    @Override
    public void devolver() {

    }
}
