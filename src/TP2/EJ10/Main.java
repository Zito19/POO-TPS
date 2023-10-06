package TP2.EJ10;

import TP2.EJ10.Empleados.*;

public class Main {
    public static void main(String[] args) {
        Empleado empleadoFullTime = new EmpleadoFullTime("Juan", "Perez", "0112343523", "534", 100000);
        Empleado empleadoComision = new EmpleadoComision("Maria", "Gomez", "011423848328", "314", 50000, 0.05);
        Empleado empleadoBase = new EmpleadoBase("Carlos", "Lopez", "232393933828", "555", 70000, 0.04, 2000);
        Empleado empleadoPorHora = new EmpleadoPorHora("Esteban","Ramirez","23241342312","354",41,500);
        Empleado empleadoPasante = new EmpleadoPasante("Pedro", "Garcia", "2323343224", "222");

        empleadoFullTime.setCumpleaños(true);
        empleadoPasante.setCumpleaños(true);


        Empleado[] empleados = {
                empleadoFullTime,
                empleadoComision,
                empleadoBase,
                empleadoPorHora,
                empleadoPasante
        };

        for (Empleado empleado : empleados) {
            System.out.println("Empleado: " + empleado.getTipo());
            System.out.println("Nombre: " + empleado.getNombreCompleto());
            System.out.println("Sueldo: " + empleado.calcularSueldo());
            System.out.println("Bono de Cumpleaños: " + empleado.calcularBonoCumpleanos());
            System.out.println();
        }

        //FALTA CUMPLEAÑOS. REVISAR
    }
}
