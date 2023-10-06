package TP2.EJ11;

import TP2.EJ11.Empresa.Alquiler;
import TP2.EJ11.Empresa.Presupuesto;
import TP2.EJ11.Empresa.RentaAutomoviles;
import TP2.EJ11.Empresa.Vehiculos.*;
        public class Main {
            public static void main(String[] args) {
                // Crear instancias de vehículos
                Vehiculo auto = new Auto(2, false);
                Vehiculo autoVip = new Auto(5, true);
                Vehiculo combi = new Combi();
                Vehiculo flete = new Flete(200);
                Vehiculo camion = new Camion();

                // registrar vehículos en el sistema
                RentaAutomoviles rentaAutomoviles = new RentaAutomoviles();

                rentaAutomoviles.registrarVehiculo(auto);
                rentaAutomoviles.registrarVehiculo(autoVip);
                rentaAutomoviles.registrarVehiculo(combi);
                rentaAutomoviles.registrarVehiculo(flete);
                rentaAutomoviles.registrarVehiculo(camion);

                // creo clientes
                Cliente cliente1 = new Cliente("Juan");
                Cliente cliente2 = new Cliente("Roberto");

                // genero un presupuesto
                Presupuesto presupuesto1 = new Presupuesto(auto, 5);
                Presupuesto presupuesto2 = new Presupuesto(camion, 31);

                Presupuesto presupuesto3 = new Presupuesto(flete,2);
                Presupuesto presupuesto4 = new Presupuesto(autoVip,3);
                Presupuesto presupuesto5 = new Presupuesto(combi,5);

                // calcular monto de los presupuestos
                double montoPresupuesto1 = presupuesto1.calcularMonto();
                double montoPresupuesto2 = presupuesto2.calcularMonto();
                double montoPresupuesto3 = presupuesto3.calcularMonto();
                double montoPresupuesto4 = presupuesto4.calcularMonto();
                double montoPresupuesto5 = presupuesto5.calcularMonto();

                // genero alquileres a partir de presupuestos
                Alquiler alquiler1 = presupuesto1.generarAlquiler(cliente1);
                Alquiler alquiler2 = presupuesto2.generarAlquiler(cliente1);
                Alquiler alquiler3 = presupuesto3.generarAlquiler(cliente1);
                Alquiler alquiler4 = presupuesto4.generarAlquiler(cliente1);
                Alquiler alquiler5 = presupuesto5.generarAlquiler(cliente1);

                // Agrego alquileeres a los clientes
                cliente1.agregarAlquiler(alquiler1);
                cliente1.agregarAlquiler(alquiler2);

                cliente2.agregarAlquiler(alquiler3);
                cliente2.agregarAlquiler(alquiler4);
                cliente2.agregarAlquiler(alquiler5);

                System.out.println();
                // Muestro clientes
                cliente1.mostrarInformacionAlquileres();
                cliente2.mostrarInformacionAlquileres();
            }
        }