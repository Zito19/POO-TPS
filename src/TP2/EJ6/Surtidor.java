package TP2.EJ6;

import TP2.EJ6.Combustible;

import java.util.List;

public class Surtidor {
    private int numero;
    private Combustible tipoCombustible;
    private double cantidadLitrosVendidos;
    private double montoTotalVentas;

    public Surtidor(int numero, Combustible tipoCombustible) {
        this.numero = numero;
        this.tipoCombustible = tipoCombustible;
        this.cantidadLitrosVendidos = 0;
        this.montoTotalVentas = 0;
    }

    public int getNumero() {
        return numero;
    }

    public Combustible getTipoCombustible() {
        return tipoCombustible;
    }
    public void agregarCombustible() {
        return tipoCombustible;
    }

    public double getCantidadLitrosVendidos() {
        return cantidadLitrosVendidos;
    }

    public double getMontoTotalVentas() {
        return montoTotalVentas;
    }
}