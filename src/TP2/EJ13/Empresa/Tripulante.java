package TP2.EJ13.Empresa;

import TP2.EJ13.Empresa.Persona;
import TP2.EJ13.Empresa.ReciboDeSueldo;

import java.util.ArrayList;

public class Tripulante extends Persona {
    private String cargo;

    private ArrayList<ReciboDeSueldo> sueldos;
    public Tripulante(String nombre, String numeroTelefono, String direccion, String cargo) {
        super(nombre, numeroTelefono, direccion);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void CargarSueldo(int mes , double cantidad){
        ReciboDeSueldo nuevoSueldo = new ReciboDeSueldo(mes, cantidad);
    }

    public void infoSueldo() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Cargo: " + cargo);

        System.out.println("Lista de Sueldos:");
        for (ReciboDeSueldo sueldo : sueldos) {
            System.out.println("Mes: " + sueldo.getMes() + ", Cantidad: " + sueldo.getSueldo());
        }
    }
}