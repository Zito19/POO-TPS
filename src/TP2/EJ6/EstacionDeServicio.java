package TP2.EJ6;

import java.util.ArrayList;
import java.util.List;

public class EstacionDeServicio {
    private List<Surtidor> surtidores;
    private List<Playero> empleados;
    private List<Cliente> clientes;

    public EstacionDeServicio() {
        surtidores = new ArrayList<>();
        empleados = new ArrayList<>();
        clientes = new ArrayList<>();
    }

    public void agregarSurtidor(Surtidor surtidor) {
        surtidores.add(surtidor);
    }

    public void agregarEmpleado(Playero playero) {
        empleados.add(playero);
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

}