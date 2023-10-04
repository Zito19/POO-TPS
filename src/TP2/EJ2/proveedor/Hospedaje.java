package TP2.EJ2.proveedor;

public class Hospedaje extends Proveedor {

    private String nombre;
    private String tipo;
    private int estrellas;

    public Hospedaje(String nombre,String tipo,int estrellas,String proveedor,int calificacion){
        super(proveedor,calificacion);
        this.nombre = nombre;
        this.tipo = tipo;
        this.estrellas  = estrellas;
    }

    public String getNombre(){return nombre;}
    public String getTipo(){return tipo;}
    public int getEstrellas(){return estrellas;}


    public void informacion(){
        System.out.println("HOSPEDAJE: \nEmpresa: " + nombre + " | " + tipo + " | Estrellas: "+ estrellas);
    }

}
