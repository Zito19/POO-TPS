package TP2.EJ14;

public class Hospedaje extends Proveedor {

    public Hospedaje(String nombre, double precioBase, int minClientes,int puntaje) {
        super(nombre, "Hospedaje", precioBase, minClientes,puntaje);
    }

    public double calcularPrecioExtra(int clientesPaq) {
        double preciofinal = 0;
        if (this.getMinClientes() > clientesPaq) {
            preciofinal = clientesPaq * getPrecioBase() / 2;
        }
        else preciofinal = clientesPaq * getPrecioBase();
        return preciofinal;
    }
}
/*

Si la cantidad de clientes máxima del paquete supera la cantidad mínima de clientes que acepta el proveedor (MaxPaq > MinProv),
este último hace una rebaja del 0.5% del valor total del servicio base por cada cliente que supere la cantidad mínima de clientes que acepte el proveedor.
Si la cantidad máxima del paquete es igual a la mínima del proveedor (MaxPaq = MinProv), el valor extra es $0.
Si la cantidad máxima del paquete es menor (MaxPaq < MinProv) a la mínima del proveedor, el valor extra es $0.*/
