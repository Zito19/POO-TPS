package TP2.EJ2;

import TP2.EJ2.proveedor.Excursion;
import TP2.EJ2.proveedor.Hospedaje;
import TP2.EJ2.proveedor.Proveedor;
import TP2.EJ2.proveedor.Transporte;

import java.util.ArrayList;

class Paquete {
    private String destino;
    private Transporte transporte;
    private Hospedaje hospedaje;
    private ArrayList<Excursion> excursiones = new ArrayList<Excursion>();

    public Paquete(String destino, Transporte transporte, Hospedaje hospedaje,Excursion excursion) {
        this.destino = destino;
        this.transporte = transporte;
        this.hospedaje = hospedaje;
        this.excursiones.add(excursion);
    }

    public void agregarExcursion(Excursion excursion) {
        excursiones.add(excursion);
    }
    public String getDestino(){return destino;}
    public void informacion(){
            System.out.println("PAQUETE DESTINO " +getDestino()+"\n");
            transporte.informacion();
            hospedaje.informacion();
        for (Excursion elemento: excursiones) {
            elemento.informacion();
        }
    }
}
