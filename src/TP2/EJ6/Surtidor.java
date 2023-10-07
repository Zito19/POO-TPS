package TP2.EJ6;

import TP2.EJ6.Combustible;

public class Surtidor {
    private TipoCombustible tipoCombustible;
    private double totalVentas;

    // Constructor
    public Surtidor(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
        this.totalVentas = 0;
    }

    // Métodos para cambiar el estado de disponibilidad

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public void registrarVenta(double montoVenta) {
        totalVentas += montoVenta;
    }

    public Combustible getCombustible() {
    }
}