package TP2.EJ6;

public class Nafta extends Combustible {
    private static double totalVentas = 0;
    public Nafta(double precioLitro) {
        super("Nafta", 2.5); // Ejemplo de precio por litro
    }
    public double getTotalVentas() {return totalVentas;}
    public void agregarTotalVentas(double totalVentas){this.totalVentas += totalVentas;}
    @Override
    public String getTipo() {
        return "Nafta";
    }
}