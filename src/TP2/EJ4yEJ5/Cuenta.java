package TP2.EJ4yEJ5;

public abstract class Cuenta {

    protected double saldo;
    private double limiteDescubierto;

    public Cuenta(double saldo){
        this.saldo = saldo;
    }
    public void depositar(double monto){
        this.saldo += monto;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo;
    }
    public abstract void compra(double monto);
    public abstract void retirar(double cantidad);
    public abstract void informacion();
}
