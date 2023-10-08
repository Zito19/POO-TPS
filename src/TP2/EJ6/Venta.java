package TP2.EJ6;

public class Venta {
    private Cliente cliente;
    private Surtidor surtidor;
    private double litros;
    private double montoTotal;

    public Venta(Cliente cliente,Playero playero ,Surtidor surtidor,Combustible combustible,double litros, double montoTotal) {
        this.cliente = cliente;
        this.surtidor = surtidor;
        this.litros = litros;
        this.montoTotal = montoTotal;
        combustible.agregarTotalVentas(montoTotal);
        cliente.agregarCompra(montoTotal);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Surtidor getSurtidor() {
        return surtidor;
    }

    public double getLitros() {
        return litros;
    }

    public double getMontoTotal() {
        return montoTotal;
    }
}