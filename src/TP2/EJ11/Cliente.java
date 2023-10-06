package TP2.EJ11;

import TP2.EJ11.Empresa.Alquiler;

import java.util.ArrayList;
import java.util.List;


public class Cliente {

    private String nombre;
    private List<Alquiler> alquileres;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.alquileres = new ArrayList<>();
    }

    public void agregarAlquiler(Alquiler alquiler) {
        alquileres.add(alquiler);
    }

    public double calcularMontoTotalAlquileres() {
        System.out.println("-CLIENTE NOMBRE: "+nombre);
        double montoTotal = 0.0;
        for (Alquiler alquiler : alquileres) {
            montoTotal += alquiler.getMonto();
        }
        return montoTotal;
    }

    public void mostrarInformacionAlquileres() {
        System.out.println("Monto total de alquileres para " + nombre + ": $" + calcularMontoTotalAlquileres());
        System.out.println("Detalles de los alquileres:");

        for (Alquiler alquiler : alquileres) {
            System.out.println("Descripción del vehículo: " + alquiler.getDescripcionVehiculo());
            System.out.println("Monto del alquiler: $" + alquiler.getMonto());
            System.out.println("-----------------------------");
        }
    }

    public String getNombre() {
        return nombre;
    }
}
