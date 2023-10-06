package TP2.EJ11.Empresa.Vehiculos;

public class Camion extends Vehiculo {
    @Override
    public double calcularCostoAlquiler(int dias) {
        return (dias > 30) ? 75000 : 100000;
    }

    @Override
    public String obtenerDescripcion() {
        return "Camión de carga";
    }
}