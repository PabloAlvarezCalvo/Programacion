package dam.programacion.Examenes.UD06_07.Ej02_Tienda.model.producto.productoAlimentacion;

import Ej02_Tienda.model.producto.Producto;

public class ProductoAlimentacion extends Producto {
    protected String categoria;
    protected boolean contieneGluten;

    public ProductoAlimentacion(){
        super();
        this.contieneGluten = false;
    }

    public ProductoAlimentacion(int id, String nombre, String ubicacion,
                                double precio, String categoria, boolean contieneGluten) {
        super(id, nombre, ubicacion, precio);
        this.categoria = categoria;
        this.contieneGluten = contieneGluten;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isContieneGluten() {
        return this.contieneGluten;
    }

    public void setContieneGluten(boolean contieneGluten) {
        this.contieneGluten = contieneGluten;
    }

    @Override
    public String toString() {
        return "ProductoAlimentacion{" +
                "nombre='" + this.nombre + '\'' +
                ", categoria='" + this.categoria + '\'' +
                ", contieneGluten=" + this.contieneGluten +
                ", precio=" + this.precio +
                '}';
    }
}
