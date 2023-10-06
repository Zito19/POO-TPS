package TP2.EJ13;

import TP2.EJ13.Empresa.Pasajero;
import TP2.EJ13.Empresa.Tripulante;
import TP2.EJ13.Empresa.Vuelo;

public class Main {
    public static void main(String[] args) {
        Vuelo vuelo = new Vuelo();

        //creo tripulantes y pasajeros
        Pasajero pasajero1 = new Pasajero("Juan", "232354123413", "231", 1);
        Pasajero pasajero2 = new Pasajero("Maria", "0112939294", "112", 2);
        Tripulante tripulante1 = new Tripulante("Pedro", "011383819", "23", "piloto");
        Tripulante tripulante2 = new Tripulante("Lorena", "011383819", "23", "azafata");

       //agrego personas al vuelo
        vuelo.agregarPersona(pasajero1);
        vuelo.agregarPersona(tripulante1);
        vuelo.agregarPersona(pasajero2);
        vuelo.agregarPersona(tripulante2);

        // informacion del vuelo
        vuelo.informacionDelVuelo();
    }
}
