package dam.programacion.UD09.Ej04_Pedidos;

public class LineaPedido {
    private int cantidad;
    private Producto producto;

    public LineaPedido(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "LineaPedido{" + "cantidad=" + cantidad + ", producto=" + producto + '}';
    }
}
