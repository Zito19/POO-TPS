package TP2.EJ14;

import java.util.ArrayList;
import java.util.List;

class Paquete {
        private String destino;
        private List<Proveedor> proveedores;
        private int clientes;
        private List<Venta> ventas;

        public Paquete(String destino) {
                this.destino = destino;
                this.proveedores = new ArrayList<>();
                this.clientes = 0;
                this.ventas = new ArrayList<>();
        }

        public String getDestino() {
                return destino;
        }
        public int getClientes() {
                return clientes;
        }

        public void agregarProveedor(Proveedor proveedor) {
                proveedores.add(proveedor);
        }

        public void agregarClientes(){
                this.clientes +=1;
        }
        public void agregarClientes(int clientes){
                this.clientes += clientes;
        }

        public double calcularPrecioTotal() {
                double precioTotal = 0;
                for (Proveedor proveedor : proveedores) {
                        precioTotal += proveedor.getPrecioBase();
                        precioTotal += proveedor.calcularPrecioExtra(clientes);
                }
                return precioTotal;
        }

        public void realizarVenta(Cliente cliente) {
                Venta venta = new Venta(cliente, this);
                ventas.add(venta);
                this.clientes += 1;
        }

        public void imprimirVentasPorDestino() {
                System.out.println("Ventas por " + destino + ":");
                for (Venta venta : ventas) {
                        System.out.println("Cliente: " + venta.getCliente().getNombre());
                        System.out.println("Precio del paquete: $" + calcularPrecioTotal());
                        System.out.println("--------------");
                }
        }
        public void infoPaquete(){
                System.out.println("Paquete "+destino+" cantidad de clientes: "+ clientes);
                for (Proveedor proveedor : proveedores) {
                        System.out.println("--------------");
                        proveedor.informarcionProveedor();
                }
        }
}