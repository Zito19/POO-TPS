package TP2.EJ14;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de SunBeach
        SunBeach sunBeach = new SunBeach();

        // Crear proveedores
        Proveedor Transporte = new Transporte("Camioneta 4x4", 12000, 2, 20,2);
            Proveedor Hospedaje = new Hospedaje("Gran Hotel Bariloche", 1000,20,5);
        Proveedor Guia= new GuiaTuristico("Guía Juan", 500,9);

        // Agregar proveedores a SunBeach
        sunBeach.agregarProveedor(Transporte);
        sunBeach.agregarProveedor(Hospedaje);
        sunBeach.agregarProveedor(Guia);

        // Crear paquetes
        Paquete paquete1 = new Paquete("Bariloche");
        paquete1.agregarProveedor(Transporte);
        paquete1.agregarProveedor(Hospedaje);
        paquete1.agregarProveedor(Guia);

        Paquete paquete2 = new Paquete("Rosario");
        paquete2.agregarProveedor(Transporte);
        paquete2.agregarProveedor(Hospedaje);
        paquete2.agregarProveedor(Guia);
        sunBeach.agregarPaquete(paquete1);
        sunBeach.agregarPaquete(paquete2);

        // Crear clientes
        Cliente cliente1 = new Cliente("Juan", "0112938342", "juan@gmail.com");
        Cliente cliente2 = new Cliente("lucia", "23244723712", "lucia@gmail.com");

        // Realizar ventas
        System.out.println("--------------Realizar ventas------------------");
        paquete1.realizarVenta(cliente1);
        paquete1.realizarVenta(cliente2);
        paquete2.realizarVenta(cliente2);

        System.out.println("--Imprimir informe de ventas--");
        // Imprimir informe de ventas
        paquete1.imprimirVentasPorDestino();
        paquete2.imprimirVentasPorDestino();
        //
        //
        sunBeach.obtenerDestinoFavorito();
        System.out.println("--Generar informe de información de proveedores--");
        // Generar informe de información de proveedores
        sunBeach.obtenerInformacionProveedores();
        System.out.println("---INFORMACION DEL PAQUETE---");
        paquete1.infoPaquete();
        paquete2.infoPaquete();
    }
}
