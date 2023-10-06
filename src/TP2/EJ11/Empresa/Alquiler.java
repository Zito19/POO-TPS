package TP2.EJ11.Empresa;

import TP2.EJ11.Cliente;
import TP2.EJ11.Empresa.Vehiculos.Vehiculo;

public class Alquiler {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private int dias;
    private String descripcionVehiculo;

    public Alquiler(Cliente cliente, Vehiculo vehiculo, int dias, String descripcionVehiculo) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.dias = dias;
        this.descripcionVehiculo = descripcionVehiculo;
    }

    public double getMonto() {
        return vehiculo.calcularCostoAlquiler(dias);
    }

    public String getDescripcionVehiculo() {
        return descripcionVehiculo;
    }
}
