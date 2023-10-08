package TP2.EJ6;

import TP2.EJ6.Combustible;

public class Cliente {
    private String nombre;

    private double totalCompras;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.totalCompras = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTotalCompras(){
        return totalCompras;}

    public void agregarCompra(double monto) {
        this.totalCompras += monto;
    }
}