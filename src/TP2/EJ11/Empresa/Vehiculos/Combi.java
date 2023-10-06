package TP2.EJ11.Empresa.Vehiculos;

public class Combi extends Vehiculo {

    private double base = 4500;

    @Override
    public double calcularCostoAlquiler(int dias) {
        return base * dias;
    }
    public String obtenerDescripcion() {
        return "Combi";
    }
}