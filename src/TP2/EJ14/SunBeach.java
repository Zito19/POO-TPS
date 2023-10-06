package TP2.EJ14;

import java.util.ArrayList;
import java.util.List;

public class SunBeach {
    private List<Proveedor> proveedores;
    private List<Paquete> paquetes;
    private List<Venta> ventas;

    public SunBeach() {
        proveedores = new ArrayList<>();
        paquetes = new ArrayList<>();
        ventas = new ArrayList<>();
    }

    public void agregarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
    }

    public void agregarPaquete(Paquete paquete) {
        paquetes.add(paquete);
    }

    public void realizarVenta(Cliente cliente, Paquete paquete) {
        Venta venta = new Venta(cliente, paquete);
        ventas.add(venta);
    }

    public List<Venta> obtenerVentasPorDestino(String destino) {
        List<Venta> ventasPorDestino = new ArrayList<>();
        for (Venta venta : ventas) {
            if (venta.getPaquete().getDestino().equals(destino)) {
                ventasPorDestino.add(venta);
            }
        }
        return ventasPorDestino;
    }


    public void obtenerDestinoFavorito() {
        int max = -1;
        String destinomax = null;
        for (Paquete paquete : paquetes) {
            if (max < paquete.getClientes()) {
                max = paquete.getClientes();
                destinomax = paquete.getDestino();
            }
        }
        System.out.println("Destino Favorito: " + destinomax);
    }

    public String obtenerInformacionProveedores() {
        StringBuilder info = new StringBuilder("Información de Proveedores:\n");
        for (Proveedor proveedor : proveedores) {
            info.append("Nombre: ").append(proveedor.getNombre()).append("\n");
            info.append("Tipo: ").append(proveedor.getTipo()).append("\n");
            info.append("Precio Base: $").append(proveedor.getPrecioBase()).append("\n");
            info.append("--------------\n");
        }
        return info.toString();
    }
}