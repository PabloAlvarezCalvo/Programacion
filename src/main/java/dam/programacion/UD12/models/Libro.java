package dam.programacion.UD12.models;

public class Libro {
    private int idLibro;
    private String titulo;
    private float precio;
    private String autor;

    public Libro() {
    }

    public Libro(int idLibro, String titulo, float precio, String autor) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.precio = precio;
        this.autor = autor;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
