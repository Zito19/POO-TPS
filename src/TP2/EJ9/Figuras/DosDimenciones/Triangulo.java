package TP2.EJ9.Figuras.DosDimenciones;

public class Triangulo extends DosDimensiones{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return (base * altura) / 2;
    }

    @Override
    public String getTipo() {
        return "Triangulo";
    }
}
