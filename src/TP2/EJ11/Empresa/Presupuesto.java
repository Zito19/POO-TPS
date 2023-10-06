package TP2.EJ11.Empresa;

import TP2.EJ11.Cliente;
import TP2.EJ11.Empresa.Vehiculos.Vehiculo;

public class Presupuesto {
    private Vehiculo vehiculo;
    private int dias;

    public Presupuesto(Vehiculo vehiculo, int dias) {
        this.vehiculo = vehiculo;
        this.dias = dias;
    }

    public double calcularMonto() {
        return vehiculo.calcularCostoAlquiler(dias);
    }

    public Alquiler generarAlquiler(Cliente cliente) {
        return new Alquiler(cliente, vehiculo, dias, vehiculo.obtenerDescripcion());
    }
}