package TP2.EJ9.Figuras.DosDimenciones;

public class Rectangulo extends DosDimensiones {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return base * altura;
    }

    @Override
    public String getTipo() {
        return "Rectángulo";
    }
}