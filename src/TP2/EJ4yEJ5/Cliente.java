package TP2.EJ4yEJ5;

public class Cliente {
    private String nombre;
    private String cvu;
    private CuentaCredito credito;
    private Debito debito;

    public Cliente(String nombre,double saldoDebito,double limitedescubierto,double limiteCredito){
        this.nombre = nombre;
        this.cvu = generarCvu();
        debito = new Debito(saldoDebito,limitedescubierto);
        credito = new CuentaCredito(limiteCredito);
    }

    private String generarCvu() {
        String cvu = getNombre().substring(0, 2);
        cvu = cvu.toUpperCase(); // Convertir a mayúsculas
        cvu += hashCode(); // Agregar un valor único
        return cvu;
    }

    public String getNombre(){return nombre;}

    public void informacion(){
        System.out.println("Cuenta de "+nombre + " cvu "+cvu);
        debito.informacion();
        System.out.println("-----------------------------------");
        credito.informacion();
    }

    //DEBITO
    public void compraDebito(double monto){
        debito.compra(monto);
    }
    public void retirarDebito(double monto){
        debito.retirar(monto);
    }
    public void saldo(){
        System.out.println("Saldo actual: $"+debito.getSaldo());
    }
    public void inversion(double monto){
        debito.inversion(monto);
    }
    public void cancelarInversion(){
        debito.cancelarInversion();
    }
    //CREDITO
    public void compraCredito(double monto){
        credito.compra(monto);
    }
    public void retirarCredito(double monto){
        credito.retirar(monto);
    }
}
