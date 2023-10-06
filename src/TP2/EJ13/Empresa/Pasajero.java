package TP2.EJ13.Empresa;

public class Pasajero extends Persona {
    private int numeroPasajero;

    public Pasajero(String nombre, String numeroTelefono, String direccion, int numeroPasajero) {
        super(nombre, numeroTelefono, direccion);
        this.numeroPasajero = numeroPasajero;
    }
    public int getNumeroPasajero() {
        return numeroPasajero;
    }
    public void setNumeroPasajero(int numeroPasajero){
        this.numeroPasajero = numeroPasajero;
    }
}
