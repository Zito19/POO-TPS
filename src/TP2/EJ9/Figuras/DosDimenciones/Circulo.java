package TP2.EJ9.Figuras.DosDimenciones;

public class Circulo extends DosDimensiones {
    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public String getTipo() {
        return "Circulo";
    }

    @Override
    public double getArea() {
        return Math.PI * radio * radio;
    }
}

/*Dos dimensiones
Área del círculo: Pi * radio ^ 2
Área del rectángulo: base * altura
Área del cuadrado: lado * lado
Área del triángulo: base * altura / 2*/