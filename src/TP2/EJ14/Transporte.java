package TP2.EJ14;

class Transporte extends Proveedor {
    private double cateringPrice;

    public Transporte(String nombre, double precioBase, int minClientes, double cateringPrice,int puntaje) {
        super(nombre, "Transporte", precioBase, minClientes,puntaje);
        this.cateringPrice = cateringPrice;
    }

    public double calcularPrecioExtra(int clientesPaq) {
        int clientesExtra = clientesPaq - getMinClientes();
        if (clientesExtra > 0) {
            double precioExtraCatering = clientesExtra * (getPrecioBase() * 0.003);
            return precioExtraCatering;
        }
        return 0;
    }
}
/*El de transporte lo calcula así:
Por cada cliente, se agrega un precio extra de
0.3% del precio base por los servicios de catering durante el viaje.*/