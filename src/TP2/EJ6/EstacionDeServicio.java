package TP2.EJ6;

import TP2.EJ6.Empleado;
import TP2.EJ6.Surtidor;
import TP2.EJ6.Venta;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class EstacionDeServicio {
    private ArrayList<Empleado> empleados;
    private ArrayList<Surtidor> surtidores;
    private ArrayList<Venta> ventas;

    // Constructor
    public EstacionDeServicio() {
        empleados = new ArrayList<>();
        surtidores = new ArrayList<>();
        ventas = new ArrayList<>();
    }

    // empleados, expendidores y ventas
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void agregarSurtidor(Surtidor surtidor) {
        surtidores.add(surtidor);
    }

    public void registrarVenta(Venta venta) {
        ventas.add(venta);
    }

    // Método para imprimir información por pantalla


}


