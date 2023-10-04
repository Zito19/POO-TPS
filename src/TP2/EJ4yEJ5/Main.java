package TP2.EJ4yEJ5;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("luis suarez", 12000, 5000, 100000);

       //for (int i = 0; i < 4; i++) {
       //     cliente.compraDebito(1500);
        //}
        System.out.println("-------------------------");
        cliente.inversion(2000);
        cliente.compraDebito(17000);

        System.out.println("-------------------------");
        for (int i = 0; i < 4; i++) {
            cliente.compraCredito(1200);
        }
        cliente.retirarCredito(120);
        System.out.println("-------------------------");
        cliente.informacion();

    }
}