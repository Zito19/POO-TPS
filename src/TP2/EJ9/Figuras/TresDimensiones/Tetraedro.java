package TP2.EJ9.Figuras.TresDimensiones;
/*Área del tetraedro: (regular): arista^2 * raíz(3)
Volumen del tetraedro: (regular): arista^3 * raíz(2)/12*/
public class Tetraedro extends TresDimensiones {
    private double arista;

    public Tetraedro(double arista) {
        this.arista = arista;
    }

    @Override
    public double getArea() {
        return arista * arista * Math.sqrt(3);
    }

    public double getVolumen() {
        return (arista * arista * arista * Math.sqrt(2)) / 12;
    }

    @Override
    public String getTipo() {
        return "Tetraedro";
    }
}
