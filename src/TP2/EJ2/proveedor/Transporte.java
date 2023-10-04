package TP2.EJ2.proveedor;

public class Transporte extends Proveedor {

    private String nombre;
    private String tipo;

    public Transporte(String nombre,String tipo,String proveedor,int calificacion){
        super(proveedor,calificacion);
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public String getNombre(){return nombre;}
    public String getTipo() {return tipo;}

    public void informacion(){
        System.out.println("TRANSPORTE:\nEmpresa: " + nombre + " | Tipo de transporte: " + tipo);
    }
}
