package TP2.EJ2;

import TP2.EJ2.proveedor.Excursion;
import TP2.EJ2.proveedor.Hospedaje;
import TP2.EJ2.proveedor.Transporte;

public class main {
    public static void main(String[] args){

        Transporte transporte = new Transporte("4X4 AUTOMOVILES","AUTO","ROBERTO",5);
        Excursion excursion = new Excursion("CERRO OTTO","VISITA AL CERRO OTTO EN BARILOCHE","TRAVEL BRC",9);
        Hospedaje hospedaje = new Hospedaje("HOTEL BARILOCHE","HOTEL",5,"HOTEL BARILOCHE S.A",5);

        Admin admin = new Admin();
        admin.nuevoPaquete("Bariloche",transporte,hospedaje,excursion);
        admin.paquetes();


        Cliente cliente = new Cliente("Esteban","calle 12");

       //admin.compra(cliente,paquete);

    }
}
