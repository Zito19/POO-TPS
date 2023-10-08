package TP2.EJ6;

public class Gasoil extends Combustible {
    private static double totalVentas = 0;
    public Gasoil(double precioLitro) {
        super("Gasoil", precioLitro); // Ejemplo de precio por litro
    }



    public double getTotalVentas() {return totalVentas;}
    public void agregarTotalVentas(double totalVentas){this.totalVentas += totalVentas;}
    @Override
    public String getTipo() {
        return "Gasoil";
    }
}
