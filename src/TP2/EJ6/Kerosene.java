package TP2.EJ6;

public class Kerosene extends Combustible {

    private static double totalVentas = 0;
    public Kerosene(double precioLitro) {
        super("Kerosene", precioLitro); // Ejemplo de precio por litro
    }

    public double getTotalVentas() {return totalVentas;}
    public void agregarTotalVentas(double totalVentas){this.totalVentas += totalVentas;}
    @Override
    public String getTipo() {
        return "Kerosene";
    }
}