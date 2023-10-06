package TP2.EJ11.Empresa.Vehiculos;

public class Flete extends Vehiculo {
    private double pesoAutorizadoTotal;
    private double base = 3000;
    private double costoDia = 600;

    public Flete(double pesoAutorizadoTotal) {
        this.pesoAutorizadoTotal = pesoAutorizadoTotal;
    }

    @Override
    public double calcularCostoAlquiler(int dias) {

        return base * dias + 600 * pesoAutorizadoTotal * dias;
    }

    public void setPesoAutorizadoTotal(double peso){
        this.pesoAutorizadoTotal = peso;
    }
    public double getPesoAutorizadoTotal(){return pesoAutorizadoTotal;}

    public String obtenerDescripcion() {
        return "Camioneta de flete con PAT de " + pesoAutorizadoTotal;
    }
}
