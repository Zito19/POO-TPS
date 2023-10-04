package TP2.EJ2;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String direccion;
    private ArrayList<Venta> ventas = new ArrayList<>();

    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void agregarVenta(Venta venta) {
        ventas.add(venta);
    }

}