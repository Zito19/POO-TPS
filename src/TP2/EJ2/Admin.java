package TP2.EJ2;

import TP2.EJ2.proveedor.Excursion;
import TP2.EJ2.proveedor.Hospedaje;
import TP2.EJ2.proveedor.Proveedor;
import TP2.EJ2.proveedor.Transporte;

import java.util.ArrayList;

public class Admin {
    private ArrayList<Paquete> listaPaquetes = new ArrayList<Paquete>();
    private ArrayList<Cliente> listaClientes= new ArrayList<Cliente>();

    public void nuevoPaquete(String destino, Transporte transporte, Hospedaje hospedaje, Excursion excursion) {
        listaPaquetes.add(new Paquete(destino, transporte, hospedaje, excursion));
    }

    public void paquetes() {
        for (Paquete elemento : listaPaquetes) {
            elemento.informacion();
        }
    }

    public void compra(Cliente cliente, Paquete paquete) {
        Venta venta = new Venta(cliente, paquete);
        cliente.agregarVenta(venta);
    }
}