
package TP2.EJ11.Empresa;

import TP2.EJ11.Empresa.Vehiculos.Vehiculo;

import java.util.*;

public class RentaAutomoviles {
    private Map<String, Vehiculo> vehiculos;


    public RentaAutomoviles() {
        vehiculos = new HashMap<>();
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        String patente = generarPatenteUnica();
        vehiculo.setPatente(patente);
        vehiculos.put(patente, vehiculo);
        System.out.println("Vehiculo registrado: Patente " + patente +" "+ vehiculo.obtenerDescripcion());
    }
    private String generarPatenteUnica() {
        Random random = new Random();
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder patente = new StringBuilder();

        while (true) {
            patente.setLength(0);
            for (int i = 0; i < 3; i++) {
                char letra = letras.charAt(random.nextInt(letras.length()));
                patente.append(letra);
            }
            for (int i = 0; i < 3; i++) {
                int numero = random.nextInt(10);
                patente.append(numero);
            }
            String patenteGenerada = patente.toString();
            if (!vehiculos.containsKey(patenteGenerada)) {
                return patenteGenerada;
            }
        }
    }
}