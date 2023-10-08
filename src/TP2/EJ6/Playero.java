package TP2.EJ6;

public class Playero {
    private String nombre;
    private double montoTotalVentas;

    public Playero(String nombre) {
        this.nombre = nombre;
        this.montoTotalVentas = 0;
    }

    public void agregarMontoTotalVentas(double monto){
        this.montoTotalVentas += monto;
    }
    public double getMontoTotalVentas(){
        return montoTotalVentas;
    }
    public String getNombre() {
        return nombre;
    }
}