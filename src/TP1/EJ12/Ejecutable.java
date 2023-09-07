package TP1.EJ12;

import java.time.LocalDate;

public class Ejecutable {
    public static void main(String[] args) {
        //TAREA POR VENCER
        AdministradorDeTareas admin = AdministradorDeTareas.getInstance();
        admin.crearTarea("TAREA1","PRUEBA1",2,
                LocalDate.of(2023, 9, 7),
                LocalDate.of(2025, 9, 7));
        //TAREA VENCIDA
        admin.crearTarea("TAREA2","PRUEBA2",2,
                LocalDate.of(2023, 9, 7),
                LocalDate.of(2022, 9, 2));
        //TAREA POR VENCER
        admin.crearTarea("TAREA3","PRUEBA3",2,
                LocalDate.of(2023, 9, 7),
                LocalDate.of(2024, 9, 1));
        //TAREA POR VENCER
        admin.crearTarea("TAREA4","PRUEBA4",1,
                LocalDate.of(2023, 9, 7),
                LocalDate.of(2024, 9, 1));

        System.out.println("---MUESTRO TODAS LAS TAREAS");
        admin.mostrarTodas();
        System.out.println("---ORDENO Y MUESTRO SOLO LAS INCOMPLETAS Y POR VENCER");

        admin.tareasNoVencidas();
        admin.mostrarNoVencida();

        System.out.println("---REALIZO LA TAREA3");
        admin.buscarTareaPorTitulo("TAREA3");
        admin.realizarTareaPorTitulo("TAREA3");


        System.out.println("---MUESTRO SOLO LAS INCOMPLETAS Y POR VENCER");
        admin.mostrarNoVencida();
    }
}