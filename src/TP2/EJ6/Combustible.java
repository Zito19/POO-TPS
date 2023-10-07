package TP2.EJ6;

public enum TipoCombustible {
    NAFTA("Nafta"),
    GASOIL("Gasoil"),
    KEROSENE("Kerosene");

    private final String nombre;

    TipoCombustible(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

public class Combustible {
    private TipoCombustible tipo;
    private double precio;

    public Combustible(TipoCombustible tipo, double precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    public TipoCombustible getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }
}