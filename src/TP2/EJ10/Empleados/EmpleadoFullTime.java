package TP2.EJ10.Empleados;

public class EmpleadoFullTime extends Empleado {
    private double sueldoMensual;

    public EmpleadoFullTime(String nombre, String apellido, String telefono, String cuit, double sueldoMensual) {
        super(nombre, apellido, telefono, cuit);
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularSueldo() {
        return sueldoMensual;
    }

    @Override
    public double calcularBonoCumpleanos() {
        if(getCumpleaños()){return super.calcularBonoCumpleanos() + 1000;}
        else{return 0;
        }

    }
    @Override
    public String getTipo(){return "FULL-TIME";}
}