package TP2.EJ2.proveedor;

public class Excursion extends Proveedor {

        private String nombre;
        private String descripcion;

        public Excursion(String nombre,String descripcion,String proveedor,int calificacion){
        super(proveedor,calificacion);
        this.descripcion = descripcion;
        this.nombre = nombre;
        }

        public String getNombre(){return nombre;}
        public String getDescripcion(){return descripcion;}

        public void informacion(){
                System.out.println("EXCURSION:\n"+"Empresa: " + nombre + " | Descripcion: " + descripcion);
        }
}
