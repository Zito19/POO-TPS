package TP1.EJ13;

import TP1.EJ12.AdministradorDeTareas;

import java.time.LocalDate;

public class Ejecutable {
    public static void main(String[] args){
        Colaborador colaborador = new Colaborador("esteban");
        Colaborador colaborador2 = new Colaborador("felipe");
        AdministradorDeTareas admin = AdministradorDeTareas.getInstance();
        //TAREA POR VENCER

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


        admin.tareasNoVencidas();
        admin.mostrarNoVencida();

        colaborador.realizarTarea("TAREA3");
        colaborador2.realizarTarea("TAREA3");
        colaborador2.realizarTarea("TAREA4");

        colaborador.getTareasRalizadas();
        colaborador2.getTareasRalizadas();

        admin.tareasNoVencidas();
        admin.mostrarNoVencida();
    /*Ejercicio 13
Seguimos extendiendo el ToDoList, se agregan nuevas funcionalidades.
 Ahora las tareas pueden resolverlas varias personas, por lo cual una lista de tareas puede tener varios colaboradores y una tarea,
 cuando se marca finalizada, será realizada por un colaborador. Cuando la tarea se marca finalizada debería registrar la fecha de finalización.
  Se debe poder obtener un listado de las tareas realizadas por un colaborador.
     */
    }
}