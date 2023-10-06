package TP2.EJ14;

public class Proveedor {
    private String nombre;
    private String tipo;
    private int puntaje;
    private double precioBase;
    private int minClientes;

    public Proveedor(String nombre, String tipo, double precioBase, int minClientes,int puntaje) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precioBase = precioBase;
        this.minClientes = minClientes;
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }
    public int getPuntaje() {return puntaje;}
    public double getPrecioBase() {
        return precioBase;
    }

    public int getMinClientes() {
        return minClientes;
    }

    public double calcularPrecioExtra(int clientesMaximos) {
        return 0; // las demas clases deberan sobreescribirlo.
    }
    public void informarcionProveedor() {
        System.out.println("Datos del Proveedor:");
        System.out.println("Puntaje: "+puntaje);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Precio Base: " + precioBase);
        System.out.println("Mínimo de Clientes: " + minClientes);
    }
}