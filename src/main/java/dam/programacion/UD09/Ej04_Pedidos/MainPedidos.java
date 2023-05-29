package dam.programacion.UD09.Ej04_Pedidos;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainPedidos {
    public static void main(String[] args) {
        LinkedList<Pedido> pedidos = new LinkedList<>();
        //Clientes
        Cliente cliente1 = new Cliente("12345678A", "Calle Falsa 123");
        Cliente cliente2 = new Cliente("87654321Z", "Avenida ubícua");
        //Productos
        Producto producto1 = new Producto(1, "Producto 1", "El mejor producto.");
        Producto producto2 = new Producto(2, "Producto 2", "No es tan bueno pero está ok");
        Producto producto3 = new Producto(3, "Producto 3", "Pensabas que sería malo, pero es peor");


        //Pedido 1
        ArrayList<LineaPedido> lineasPedido1 = new ArrayList<>();
        lineasPedido1.add(new LineaPedido(3, producto3));
        lineasPedido1.add(new LineaPedido(1, producto1));
        pedidos.add(new Pedido(cliente1, lineasPedido1));

        //Pedido 2
        ArrayList<LineaPedido> lineasPedido2 = new ArrayList<>();
        lineasPedido2.add(new LineaPedido(1, producto1));
        lineasPedido2.add(new LineaPedido(2, producto2));
        pedidos.add(new Pedido(cliente2, lineasPedido2));

        //Pedido 3
        ArrayList<LineaPedido> lineasPedido3 = new ArrayList<>();
        lineasPedido3.add(new LineaPedido(6, producto1));
        lineasPedido3.add(new LineaPedido(4, producto2));
        lineasPedido3.add(new LineaPedido(2, producto3));
        pedidos.add(new Pedido(cliente2, lineasPedido3));

        System.out.println("Primer pedido:");
        System.out.println(pedidos.peek().toString());

        listarPedidos(pedidos);

        System.out.println("Último pedido:");
        System.out.println(pedidos.getLast().toString());

        System.out.println("Eliminar último pedido:");
        System.out.println(pedidos.removeLast().toString());

        listarPedidos(pedidos);
    }
    private static void listarPedidos(LinkedList<Pedido> pedidos) {
        System.out.println("Listado de pedidos:");
        for (Pedido p : pedidos) {
            System.out.println(p.toString());
        }
    }

}
