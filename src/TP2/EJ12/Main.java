package TP2.EJ12;

public class Main {

    public static void main(String[] args) {

        CajaDeAhorro cajaDeAhorro = new CajaDeAhorro(5000);

        cajaDeAhorro.informacion(); // muestro informacion de la cuenta
        System.out.println("-------------------------");

        cajaDeAhorro.depositar(500);
        cajaDeAhorro.compra(3500);
        cajaDeAhorro.retirar(1500);

        cajaDeAhorro.informacion();
        System.out.println("-------------------------");

        cajaDeAhorro.compra(6000);
        cajaDeAhorro.retirar(8000);
        System.out.println("-------------------------");
        cajaDeAhorro.informacion();
    }
}
