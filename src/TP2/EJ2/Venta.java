package TP2.EJ2;

public class Venta {
    private Cliente cliente;
    private Paquete paquete;

    public Venta(Cliente cliente, Paquete paquete) {
        this.cliente = cliente;
        this.paquete = paquete;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Paquete getPaquete() {
        return paquete;
    }
}