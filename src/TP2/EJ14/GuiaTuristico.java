package TP2.EJ14;

public class GuiaTuristico extends Proveedor {
    public GuiaTuristico(String nombre, double precioBase,int puntaje) {
        super(nombre, "Guía Turístico", precioBase, 0,puntaje);
    }

    public double calcularPrecioExtra(int clientesMaximos) {
        if (clientesMaximos > 200) {
            return 90;
        }
        return 0;
    }
}
/*El guía turístico nunca agrega valor extra,
salvo que la cantidad de clientes sea mayor a 200,
 en ese caso solo aumenta $90 el servicio.*/