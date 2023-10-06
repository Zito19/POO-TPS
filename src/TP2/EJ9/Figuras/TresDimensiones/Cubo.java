package TP2.EJ9.Figuras.TresDimensiones;

public class Cubo extends TresDimensiones {
    private double arista;

    public Cubo(double arista) {
        this.arista = arista;
    }

    @Override
    public double getArea() {
        return 6 * arista * arista;
    }

    public double getVolumen() {
        return arista * arista * arista;
    }

    @Override
    public String getTipo() {
        return "Cubo";
    }
}