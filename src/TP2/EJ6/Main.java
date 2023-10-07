package TP2.EJ6;

public class MainEstacionDeServicio {
    public static void main(String[] args) {
        // Crear una estación de servicio
        EstacionDeServicio estacion = new EstacionDeServicio();

        // Crear surtidores para cada tipo de combustible
        Surtidor surtidorNafta = new Surtidor(TipoCombustible.NAFTA);
        Surtidor surtidorGasoil = new Surtidor(TipoCombustible.GASOIL);
        Surtidor surtidorKerosene = new Surtidor(TipoCombustible.KEROSENE);

        // Agregar surtidores a la estación
        estacion.agregarSurtidor(surtidorNafta);
        estacion.agregarSurtidor(surtidorGasoil);
        estacion.agregarSurtidor(surtidorKerosene);

        // Crear clientes y empleados
        Cliente cliente1 = new Cliente("Cliente 1", "ABC123");
        Cliente cliente2 = new Cliente("Cliente 2", "XYZ789");
        Empleado empleado1 = new Empleado("Empleado 1");

        // Realizar ventas
        estacion.registrarVenta();
        estacion.registrarVenta();
        estacion.registrarVenta();

        // Generar informes
        estacion.generarProporcionVentasPorTipoCombustible();
        estacion.listarSurtidoresPorMontoVentas();
        estacion.listarSurtidoresPorCantidadLitrosExpendidos();
        estacion.listarEmpleadosPorMontoVentas();
        estacion.listarTop10ClientesPorMontoCompras();
    }
}
