package TP2.EJ11.Empresa.Vehiculos;

public class Auto extends Vehiculo {
    private double base = 3000;
    private int cantidadAsientos;
    private boolean esVIP;
    private double asientoDia = 300;
    private double asientoVip = 500;

    public Auto(int cantidadAsientos, boolean esVIP) {
        this.cantidadAsientos = cantidadAsientos;
        this.esVIP = esVIP;
    }

    @Override
    public double calcularCostoAlquiler(int dias) {
        double costoBase = base * dias;
        double costoAsientos;
        if(esVIP){
            costoAsientos = asientoVip * cantidadAsientos * dias;;
        }
        else{costoAsientos = asientoDia * cantidadAsientos * dias;}

        return costoBase + costoAsientos;
    }
    @Override
    public String obtenerDescripcion() {
        return "Auto de pasajeros | "+ esVIP + " vip | con " + cantidadAsientos+ " asientos";
    }
}
