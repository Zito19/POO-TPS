package TP2.EJ6;

public abstract class Combustible {
    private String nombre;
    private double precioLitro;

    private static double totalVentas = 0;
    public Combustible(String nombre, double precioLitro) {
        this.nombre = nombre;
        this.precioLitro = precioLitro;
    }

    public String getNombre() {
        return nombre;
    }
    public double getTotalVentas() {return totalVentas;}
    public void agregarTotalVentas(double totalVentas){this.totalVentas += totalVentas;}

    public double getPrecioLitro() {
        return precioLitro;
    }

    public abstract String getTipo(); // Método abstracto para obtener el tipo de combustible
}
