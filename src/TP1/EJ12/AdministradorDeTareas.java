package TP1.EJ12;


import TP1.Clases.ListaEnlazada;
import TP1.EJ5.Tarea;

import java.time.LocalDate;

public class AdministradorDeTareas {
    private Tarea3 tarea;
    private static AdministradorDeTareas instancia;
    private ListaEnlazada lista;
    private ListaEnlazada noVencidas;
    private AdministradorDeTareas() {
        lista = new ListaEnlazada();
        noVencidas = new ListaEnlazada();
    }

    public static AdministradorDeTareas getInstance() {
        if (instancia == null) {
            instancia = new AdministradorDeTareas();
        }
        return instancia;
    }

    public void crearTarea(String titulo, String descripcion, int prioridad, LocalDate recordatorio, LocalDate fechaLimite) {
        tarea = new Tarea3(titulo, descripcion, prioridad, recordatorio, fechaLimite);
        lista.agregar(tarea);
    }


    //METODOS.
    public void mostrarTareas(ListaEnlazada lista) {
        if (lista.longitud() == 0) {
            System.out.println("lista vacia");
        }
        for (int i = 0; i < lista.longitud(); i++) {
            Tarea3 tarea = (Tarea3) lista.recuperar(i + 1);
            tarea.tareaInfo();
        }
    }
    // MUESTRA TODAS LAS TAREAS
    public void mostrarTodas() {
        mostrarTareas(lista);
    }
    // MUESTRA SOLO LAS NO VENCIDAS
    public void mostrarNoVencida() {
        System.out.println("TAREAS INCOMPLETAS - NO VENCIDAS");
        mostrarTareas(noVencidas);
    }
    //BUSCA UNA TAREA POR TITULO
    public Tarea3 tareaPorTitulo(String titulo) {
        for (int i = 1; i <= noVencidas.longitud(); i++) {
            Tarea3 tarea = (Tarea3) noVencidas.recuperar(i);
            if (tarea.getTitulo().equals(titulo)) {

                 // tarea
                return tarea;
            }
        }
        return null;

    }
    public boolean buscarTareaPorTitulo(String titulo) {
        Tarea3 tarea = tareaPorTitulo(titulo);
        if (tarea == null) {
            System.out.println("TITULO NO ENCONTRADO");
            return true;
        }
        System.out.println("TITULO ENCONTRADO");
        tarea.tareaInfo();
        return false;
    }
    // MARCA COMO COMPLETA UNA TAREA.
    public boolean realizarTareaPorTitulo(String titulo) {
        for (int i = 1; i <= lista.longitud(); i++) {
            Tarea3 tarea = (Tarea3) lista.recuperar(i);
            if (tarea.getTitulo().equals(titulo)) {
                tarea.completarTarea();
                tareasNoVencidas();
                return true;
            }
        }
        return false;
    }

    //NO VENCIDAS , GENERA UNA LISTA CON LAS TAREAS NO VENCIDAS
    public void tareasNoVencidas() {
        noVencidas = new ListaEnlazada();
        for (int i = 0; i < lista.longitud(); i++) {
            Tarea3 tarea = (Tarea3) lista.recuperar(i + 1);
            if (!tarea.tareaVencida() && (tarea.getEstado() == Tarea.Estado.incompleta || tarea.getEstado() == Tarea.Estado.porVencer)) {
                noVencidas.agregar(tarea);
            }
        }
        ordenarTareasNoVencidas();
    }
    // ORDENA TODAS LAS TAREAS NO VENCIDAS
    private void ordenarTareasNoVencidas() {
        for (int i = 1; i <= noVencidas.longitud(); i++) {
            int pos = i;
            Tarea3 aux = (Tarea3) noVencidas.recuperar(i);

            while (pos > 1 && (aux.getPrioridad() < ((Tarea3) noVencidas.recuperar(pos - 1)).getPrioridad() ||
                    (aux.getPrioridad() == ((Tarea3) noVencidas.recuperar(pos - 1)).getPrioridad() &&
                            aux.getFechaLimite().compareTo(((Tarea3) noVencidas.recuperar(pos - 1)).getFechaLimite()) < 0))) {
                // Intercambiar aux con la tarea en la posición (pos - 1)
                noVencidas.reemplazar(pos, noVencidas.recuperar(pos - 1));
                pos--;
            }

            // Coloca a aux en su posición ordenada correcta
            noVencidas.reemplazar(pos, aux);
        }
    }
    //ej 13

    public Tarea3 tareaColaborador(String tarea) {
        Tarea3 realizada = tareaPorTitulo(tarea);
        if (realizada != null) {
            realizarTareaPorTitulo(tarea);
            realizada.fechaFinalizacion = LocalDate.now();
            return realizada;
        }
    return null;
    }
}