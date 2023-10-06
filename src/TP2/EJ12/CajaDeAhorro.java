package TP2.EJ12;


import TP2.EJ4yEJ5.Cuenta;

public class CajaDeAhorro extends Cuenta {

    public CajaDeAhorro(double saldo) {
        super(saldo);
    }

    @Override
    public void compra(double monto) {
        if (monto <= getSaldo()) {
            setSaldo(getSaldo() - monto);
            System.out.println("Compra realizada por el monto de $"+monto);
        } else {
            System.out.println("Fondos insuficientes para realizar la compra.");
        }
    }

    @Override
    public void retirar(double cantidad) {
        if (cantidad <= getSaldo()) {
            setSaldo(getSaldo() - cantidad);
            System.out.println("Compra realizada por el monto de $"+cantidad);
        } else {
            System.out.println("Fondos insuficientes para realizar el retiro.");
        }
    }

    @Override
    public void informacion() {
        System.out.println("Tipo de cuenta: Caja de Ahorro");
        System.out.println("Saldo actual: $" + getSaldo());
    }
}
