package TP2.EJ13.Empresa;

public class Persona {
    private String nombre;
    private String numeroTelefono;
    private String direccion;
    private Ticket ticket;

    public Persona(String nombre, String numeroTelefono, String direccion) {
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void asignarTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Ticket getTicket() {
        return ticket;
    }

}
