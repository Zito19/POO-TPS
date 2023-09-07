package TP1.EJ12;
import TP1.EJ10.Tarea2;
import TP1.EJ5.Tarea;

import java.time.LocalDate;

public class Tarea3 {

    private String titulo;
    protected String descripcion;
    protected int prioridad;
    protected LocalDate fechaLimite;
    protected LocalDate fechaCompletada;
    private LocalDate fechaRecordatorio;
    protected LocalDate fechaFinalizacion;
    protected Tarea.Estado estado;

    public enum Estado {
        incompleta, completa, vencida, porVencer;

        @Override
        public String toString() {
            return switch (this) {
                case incompleta -> "Incompleta";
                case completa -> "Completa";
                case vencida -> "Vencida";
                case porVencer -> "Por vencer";
                default -> throw new IllegalArgumentException();
            };
        } // FIN TO STRING
    } // FIN ENUM ESTADO


    //CONSTRUCTOR
    public Tarea3(String titulo, String descripcion, int prioridad, LocalDate fechaRecordatorio, LocalDate fechalimite) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaRecordatorio = fechaRecordatorio;
        this.fechaLimite = fechalimite;
        this.fechaFinalizacion = null;
        //SI NO HAY FECHA LIMITE, LA TAREA ESTA INCOMPLETA
        if (fechaLimite == null) {
            this.estado = Tarea.Estado.incompleta;
            return;
        }

        // SI LA FECHA LIMITE YA PASO, LA TAREA ESTA VENCIDA
        if (fechaLimite.isBefore(LocalDate.now())) {
            this.estado = Tarea.Estado.vencida;
        }

        // SINO LA FECHA LIMITE TODAVIA NO PASO Y LA TAREA ESTA INCOMPLETA.
        else {
            this.estado = Tarea.Estado.incompleta;
        }
    }

    //SETTER Y GETTERS.
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public Tarea.Estado getEstado() {
        return this.estado;
    }
    public void setEstado(String estadoStr) {
        // Convierte la cadena a minúsculas
        String estadoLowerCase = estadoStr.toLowerCase();

        switch (estadoLowerCase) {
            case "completa":
                this.estado = Tarea.Estado.completa;
                break;
            case "vencida":
                this.estado = Tarea.Estado.vencida;
                break;
            case "porvencer":
                this.estado = Tarea.Estado.porVencer;
                break;
            case "incompleta":
                this.estado = Tarea.Estado.incompleta;
                break;
            default:
                throw new IllegalArgumentException("Estado no válido: " + estadoStr);
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    // FUNCIONES
    public void completarTarea() {
        if (this.estado == Tarea.Estado.completa) {
            return;
        }
        this.fechaCompletada = LocalDate.now();
        if (this.fechaLimite.isBefore(LocalDate.now())) {
            this.estado = Tarea.Estado.vencida;
            return;
        }
        this.estado = Tarea.Estado.completa;
    }

    public void tareaInfo() {
        if (this.fechaFinalizacion != null) {
            System.out.println("Fecha de finalizacion : " + this.fechaFinalizacion);
        }
        System.out.println("Tarea: " + getDescripcion() +
                "\n Titulo: " + getTitulo() +
                "\n Estado: " + getEstado() +
                ".\n Prioridad: " + getPrioridad() +
                ".\n Vencida: " + tareaVencida() +
                ".\n Fecha de vencimiento: " + (this.fechaLimite == null ? " Sin definir " : this.fechaLimite + "\n")
        );
    }

    public void mostrarTarea() {
        System.out.println("Tarea: " + getEstado() + "| Descripcion: " + getDescripcion() + "\n");
    }

    public boolean tareaVencida() {
        return this.estado == Tarea.Estado.vencida;
    }

    public boolean tareaCompleta() {
        return this.estado == Tarea.Estado.completa;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public boolean recordatorioActivo() {
        if (fechaRecordatorio.equals(LocalDate.now())) {
            return true;
        }
        return fechaRecordatorio.isBefore(LocalDate.now());
    }

    public void actualizarTareas() {
        if (this.estado == Tarea.Estado.completa || this.estado == Tarea.Estado.vencida) {
            return;
        }
        if (this.estado == Tarea.Estado.incompleta || this.estado == Tarea.Estado.porVencer) {
            if (recordatorioActivo()) {
                this.estado = Tarea.Estado.porVencer;
                this.prioridad = 1;
            }
        }
    }
//ejercicio 13

}