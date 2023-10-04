package TP2.EJ4yEJ5;

public class Debito extends Cuenta{
    private double limiteDescubierto;
    private double montoInversion;
    private int diasInversion;
    private boolean inversionActiva;

    public Debito(double saldoInicial, double limiteDescubierto) {
        super(saldoInicial);
        this.limiteDescubierto = limiteDescubierto;
        this.montoInversion = 0;
        this.diasInversion = 0;
        this.inversionActiva = false;
    }
    @Override
    public void compra(double monto) {
        if (saldo + limiteDescubierto >= monto) {
            saldo -= monto;
            System.out.println("Compra realizada por un monto de " + monto);
            System.out.println("Nuevo Saldo Disponible: " + saldo);
        }
        else if(saldo + limiteDescubierto + montoInversion >= monto && inversionActiva){
            cancelarInversion();
            saldo -= monto;
            System.out.println("Compra realizada por un monto de " + monto);
            System.out.println("Nuevo Saldo Disponible: " + saldo);
        }
        else {
            System.out.println("No tienes suficiente saldo y límite de giro en descubierto para esta compra.");
        }
    }

    public void inversion(double monto) {
        if (saldo < monto) {
            System.out.println("NO HAY SALDO SUFIENCENTE PARA INVERTIR");
        }
        else {
            if (!inversionActiva) {
                montoInversion = monto;
                diasInversion = 0;
                this.inversionActiva = true;
                System.out.println("Inversión realizada por un monto de $" + monto);
                System.out.println("Nuevo Monto invertido: $" + montoInversion);
                saldo -= monto;
            } else {
                System.out.println("Ya tiene una inversion activa");
            }
        }
    }
    public void cancelarInversion() {
        if (inversionActiva) {
            if (diasInversion <= 30) {// Nuevo interés del 5%
                montoInversion = montoInversion * 0.05;
                this.saldo += montoInversion;
                System.out.println("Se devuelven $" + montoInversion + " invertidos con un interés del 5%.");
            } else {
                montoInversion += montoInversion * 0.4;
                this.saldo += montoInversion;
                System.out.println("Se devuelven $" + montoInversion + " invertidos con un interes del 40%.");
            }
            montoInversion = 0;
            inversionActiva = false;
            diasInversion = 0;
        } else {
            System.out.println("NO HAY INVERSION QUE CANCELAR");
        }
    }
    @Override
    public void retirar(double cantidad) {
        if (saldo + limiteDescubierto >= cantidad) {
            saldo -= cantidad;
            System.out.println("Nuevo Saldo Disponible: " + saldo);
        } else {
            System.out.println("No tienes suficiente saldo y límite de giro en descubierto para esta operación.");
        }
    }
    @Override
    public void informacion() {
        System.out.println("Saldo Disponible: $" + saldo);
        System.out.println("Límite de giro en descubierto: $" + limiteDescubierto);
        System.out.println("Monto invertido: $" + montoInversion);
    }
    public void setDiasInversion(int dias){
        this.diasInversion = dias;
    }
}

