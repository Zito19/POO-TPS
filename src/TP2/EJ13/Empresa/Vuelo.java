package TP2.EJ13.Empresa;

import TP2.EJ13.Empresa.Pasajero;
import TP2.EJ13.Empresa.Persona;
import TP2.EJ13.Empresa.Ticket;
import TP2.EJ13.Empresa.Tripulante;

import java.util.*;

public class Vuelo {
    private Map<Ticket, Persona> vuelo;
    private List<Ticket> tickets;

    public Vuelo() {
        this.vuelo = new HashMap<>();
        this.tickets = new ArrayList<>();
    }

    public void agregarPersona(Persona persona) {
        Ticket ticket;
        if (persona instanceof Pasajero) {
            ticket = new Ticket(generarNumeroTicket());
        }
        else if (persona instanceof Tripulante) {
            ticket = new Ticket(-1);
        }
        else {
            throw new IllegalArgumentException("Tipo de persona no válido");
        }

        persona.asignarTicket(ticket);
        tickets.add(ticket);
        vuelo.put(ticket, persona);
    }
    public void informacionDelVuelo() {
        System.out.println("Información de Vuelo:");

        for (Map.Entry<Ticket, Persona> entry : vuelo.entrySet()) {
            Ticket ticket = entry.getKey();
            Persona persona = entry.getValue();

            System.out.println("Ticket: " + ticket.getNumeroTicket());
            System.out.println("Persona: " + persona.getNombre());
            System.out.println("Tipo de Persona: " + (persona instanceof Pasajero ? "Pasajero" : "Tripulante"));

            if (persona instanceof Tripulante) {
                String cargo = ((Tripulante) persona).getCargo();
                System.out.println("Cargo: "+ cargo);
            }
            System.out.println();
        }
    }

    private static Random random = new Random();

    private static int generarNumeroTicket() {
        // genera un ticket random de 5 cifras
        int numero = random.nextInt(90000) + 10000;
        return numero;
    }
}
