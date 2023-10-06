package TP2.EJ10.Empleados;

public class EmpleadoComision extends Empleado implements EmpleadoPorComision {
    private double montoVentas;
    private double porcentajeComision;

    public EmpleadoComision(String nombre, String apellido, String telefono, String cuit, double montoVentas, double porcentajeComision) {
        super(nombre, apellido, telefono, cuit);
        this.montoVentas = montoVentas;
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public double getMontoVentas() {
        return montoVentas;
    }

    @Override
    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    @Override
    public double calcularSueldo() {
        return (montoVentas * porcentajeComision) + super.calcularBonoCumpleanos();
    }
    @Override
    public String getTipo(){return "COMISION";}
}
