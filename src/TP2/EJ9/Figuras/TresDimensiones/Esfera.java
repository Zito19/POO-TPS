package TP2.EJ9.Figuras.TresDimensiones;

public class Esfera extends TresDimensiones {
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radio * radio;
    }

    public double getVolumen() {
        return (4.0 / 3.0) * Math.PI * radio * radio * radio;
    }

    @Override
    public String getTipo() {
        return "Esfera";
    }
}
