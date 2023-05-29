package dam.programacion.UD09.Ej14_AlmacenBebidas.model;

import java.util.HashMap;
import java.util.Iterator;

public class Almacen {
    private HashMap<Integer, Producto> productos;
    private final int CAPACIDAD;
    private int idSiguiente = 0;

    public Almacen(){
        productos = new HashMap<>();
        this.CAPACIDAD = 20;
    }

    public Almacen(int CAPACIDAD){
        productos = new HashMap<>();
        this.CAPACIDAD = CAPACIDAD;
    }

    public void agregarProducto(Producto p){
        if (!existeProducto(p) && idSiguiente < CAPACIDAD) {
            productos.put(idSiguiente, p);
            idSiguiente++;
        } else {
            System.out.println("El producto ya existe o el almacén está lleno.");
        }
    }

    public boolean existeProducto(Producto p){
        return productos.containsKey(p.getIdentificador());
    }

    public void listarProductos(){
        Iterator<Producto> iterator = productos.values().iterator();
        while (iterator.hasNext()){
            Producto p = iterator.next();
            System.out.println(p);
        }
    }

    public void eliminarProducto(int id){
        productos.values().removeIf(p -> p.getIdentificador() == id);
    }

}
