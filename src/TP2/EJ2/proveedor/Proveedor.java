package TP2.EJ2.proveedor;

public class Proveedor {
        private String nombre;
        private int calificacion;

        public Proveedor(String nombre,int calificacion) {
            this.nombre = nombre;
            this.calificacion = calificacion;
        }

    public String getNombre() {
        return nombre;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void proveedorInfo() {
        System.out.println("INFORMACION DEL PROVEEDOR:" + "\n" + "Nombre: " + nombre + "\n"
                + "Calificacion :" + calificacion + "\n");
    }
}