package TP2.EJ11.Empresa.Vehiculos;

public abstract class Vehiculo {
    private String patente;

    public Vehiculo() {
        // Constructor por defecto
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public abstract double calcularCostoAlquiler(int dias);
    public abstract String obtenerDescripcion();
}