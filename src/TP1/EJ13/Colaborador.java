package TP1.EJ13;

import TP1.Clases.ListaEnlazada;
import TP1.EJ12.AdministradorDeTareas;
import TP1.EJ12.Tarea3;

public class Colaborador {
    private String nombre;
    private ListaEnlazada tareasRealizadas;
    private AdministradorDeTareas admin;

    public Colaborador(String nombre) {
        this.nombre = nombre;
        tareasRealizadas = new ListaEnlazada();
        admin = AdministradorDeTareas.getInstance();
    }

    public String getNombre() {
        return nombre;
    }

    public void realizarTarea(String tarea) {
        Tarea3 realiazada = admin.tareaColaborador(tarea);
        if(realiazada != null) {
        tareasRealizadas.agregar(realiazada);}

    }

    public void getTareasRalizadas() {
        if(tareasRealizadas.longitud() >0){
        System.out.println("-TAREAS REALIZADAS POR : " + nombre);
        admin.mostrarTareas(tareasRealizadas);
        }
    }

}
