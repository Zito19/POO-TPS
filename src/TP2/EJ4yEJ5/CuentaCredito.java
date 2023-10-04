package TP2.EJ4yEJ5;

public class CuentaCredito extends Cuenta {
    private double limiteGasto;
    private double saldoDeudor;
    private  double  recargo = 0.05;
    private int comprasRealizadas;

    public CuentaCredito(double limiteGasto) {
        super(0);
        this.limiteGasto = limiteGasto;
        this.saldoDeudor = 0;
        this.comprasRealizadas = 0;
    }
    public double getSaldo() {
        return super.getSaldo();
    }
    public void realizarPago(double pago) {
        if (pago > 0 && saldoDeudor > 0) {
            saldoDeudor -= pago;
            saldo += pago;
            System.out.println("Pago realizado: " + pago);
        }
    }
    @Override
    public void compra(double monto) {
        if (limiteGasto  >= monto  * (1 + recargo)) {
            double totalCompra = monto * (1 + recargo);
            saldoDeudor += totalCompra;
            saldo += totalCompra;
            limiteGasto -= monto;
            comprasRealizadas++;
            System.out.println("Compra realizada por un monto de $" + totalCompra);
        } else {
            System.out.println("No tienes suficiente crédito para esta compra.");
        }
    }
    @Override
    public void retirar(double monto) {
        if(this.limiteGasto == 0 || limiteGasto < monto){
            System.out.println("No es posible retirar esa cantidad.");
        }
        else{
            saldo += monto;
            limiteGasto -= monto;
            System.out.println("Retiro realizado por un monto de $"+monto);
        }
    }
    @Override
    public void informacion() {
        System.out.println("CUENTA CREDITO : $" + saldo);
        System.out.println("Límite de gasto: $" + limiteGasto);
        System.out.println("Saldo deudor: $" + saldoDeudor);
        System.out.println("Compras realizadas: " + comprasRealizadas);
    }
}
