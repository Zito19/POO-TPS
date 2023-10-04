package TP2.EJ3;

import java.util.ArrayList;
import java.util.List;

public class Alumno extends Persona{
    private String credencial;
    private List<Diagrama> clasesInscritas;

    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);
        this.credencial = generarCredencial();
        this.clasesInscritas = new ArrayList<>();
    }// constructor del alumno.

    private String generarCredencial() {
        String credencial = getNombre().substring(0, 2) + getApellido().substring(0, 2);
        credencial = credencial.toUpperCase(); // Convertir a mayúsculas
        credencial += hashCode(); // Agregar un valor único
        return credencial;
    } // genera la credencial del alumno. devuelve string

    public void inscribirseEnDiagramacion(Diagrama diagramacion) {
        clasesInscritas.add(diagramacion);
    }

    public String informacion() {
        return getNombre() + " " + getApellido() + ", Credencial: " + credencial;
    }

    public String getCredencial(){
        return credencial;
    }
/*Cuando una persona se presenta por primera vez la secretaria toma sus datos personales y de contacto
y lo inscribe a una determina diagramación y le entrega una credencial personal que deberá traer al momento
de asistir a clases.*/
}
