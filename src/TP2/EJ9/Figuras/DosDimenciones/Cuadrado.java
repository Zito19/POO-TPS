package TP2.EJ9.Figuras.DosDimenciones;

public class Cuadrado extends DosDimensiones{
    private double lado;
    public Cuadrado(Double lado) {
        this.lado = lado;
    }
    @Override
    public String getTipo() {return "Cuadrado";}

    @Override
    public double getArea() {
        return lado * lado;
    }
}
