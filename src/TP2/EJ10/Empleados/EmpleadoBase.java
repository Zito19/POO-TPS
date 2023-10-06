package TP2.EJ10.Empleados;

public class EmpleadoBase extends EmpleadoComision {
    private double salarioBase;

    public EmpleadoBase(String nombre, String apellido, String telefono, String cuit, double montoVentas, double porcentajeComision, double salarioBase) {
        super(nombre, apellido, telefono, cuit, montoVentas, porcentajeComision);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSueldo() {
        return super.calcularSueldo() + salarioBase;
    }
    @Override
    public String getTipo(){return "BASE";}
}
