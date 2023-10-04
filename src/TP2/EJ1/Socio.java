package TP2.EJ1;

import java.time.LocalDate;

public class Socio {
    private String nombre;
    private String email;
    private String direccion;
    private LocalDate inscripcion;
    private LocalDate vencimiento;
    private String suscripcion;

    public Socio(String miembresia, String nombre, String email, String direccion) {
        if(!(miembresia.equals("basica") || miembresia.equals("intermedia") || miembresia.equals("destacada"))){
            this.suscripcion = "basica";
        }
        else{this.suscripcion = miembresia;
        }
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
        this.inscripcion = LocalDate.now();
        this.vencimiento = inscripcion.plusMonths(1);
    }

    public String getSuscrpicion() {
        return suscripcion;
    }
    public String getEmail(){
        return email;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getNombre(){
        return nombre;
    }
    public LocalDate getInscripcion(){
        return inscripcion;
    }
    public LocalDate getVencimiento(){
        return vencimiento;
    }
}