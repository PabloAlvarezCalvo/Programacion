package dam.programacion.Examenes.UD06_07.Ej02_Tienda.model.producto;

public class Producto {
    protected int id;
    protected String nombre;
    protected String ubicacion;
    protected double precio;

    public Producto(){
        this.id = 0;
        this.nombre = "Producto vacío";
        this.ubicacion = "Vigo";
        this.precio = 0d;
    }

    public Producto(int id, String nombre, String ubicacion, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
