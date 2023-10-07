package TP2.EJ6;

public class Empleado {

    private String nombre;
    private int idEmpleado;
    private String turno;
    private double totalVentas;

    // Constructor
    public Empleado(String nombre, int idEmpleado, String turno) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.turno = turno;
        this.totalVentas = 0.0; // Inicializamos el total de ventas en 0
    }

    // Método para registrar una venta y actualizar el totalVentas
    public void registrarVenta(double montoVenta) {
        totalVentas += montoVenta;
    }

    // Método para obtener el total de ventas del empleado
    public double getTotalVentas() {
        return totalVentas;
    }

    // Otros métodos getter y setter para los atributos restantes
    public String getNombre() {
        return nombre;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getTurno() {
        return turno;
    }
}
