package TP2.EJ3;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected int id;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido, String direccion) {
        this(nombre, apellido);
        this.telefono = direccion;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    protected void setId(int id){
        this.id = id;
    }
    protected int getId(){
        return id;
    }
}
