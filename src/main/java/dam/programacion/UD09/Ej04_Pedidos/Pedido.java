package dam.programacion.UD09.Ej04_Pedidos;

import java.util.ArrayList;

public class Pedido {
    private Cliente cliente;
    private ArrayList<LineaPedido> lineas;

    public Pedido(Cliente cliente, ArrayList<LineaPedido> lineas) {
        this.cliente = cliente;
        this.lineas = lineas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<LineaPedido> getLineas() {
        return lineas;
    }

    public void setLineas(ArrayList<LineaPedido> lineas) {
        this.lineas = lineas;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente=" + cliente +
                ", lineas=" + lineas +
                '}';
    }
}
