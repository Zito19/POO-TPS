package TP2.EJ3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Academia {
    private Map<Integer, Profesor> profesorId = new HashMap<>();
    private int proximoIdProfesor = 1;

    private Map<Integer, Alumno> alumnoId = new HashMap<>();
    private int proximoIdAlumno = 1;

    private Map<Integer, Diagrama> diagramaId = new HashMap<>();
    private int proximoIdDiagrama = 1;


    // PROFESOR
    public void agregarProfesor(Profesor profesor) {
        int id = generarIdProfesor();
        profesor.setId(id);
        profesorId.put(id, profesor);
    }

    private int generarIdProfesor() {
        return proximoIdProfesor++;
    }

    public Profesor obtenerProfesorId(int id) {
        return profesorId.get(id);
    }
    public void listaProfesores(){
        for (Map.Entry<Integer, Profesor> elemento : profesorId.entrySet()) {
            int id = elemento.getKey(); // asigno el id del hasmap
            Profesor profesor = elemento.getValue();//asigno el profesor
            System.out.println("ID: " + id);
            System.out.println(profesor.informacion()); //imprimo
        }
    }

    //ALUMNO
    public void agregarAlumno(Alumno alumno) {
        int id = generarIdAlumno();
        alumno.setId(id);
        alumnoId.put(id, alumno);
    }
    private int generarIdAlumno() {
        return proximoIdAlumno++;
    }
    public Alumno obtenerAlumnoId(int id) {
        return alumnoId.get(id);
    }
    public void listaAlumnos(){
        for (Map.Entry<Integer, Alumno> elemento : alumnoId.entrySet()) {
            int id = elemento.getKey(); // asigno el id del hasmap
            Alumno alumno = elemento.getValue();//asigno el profesor
            System.out.println("ID: " + id);
            System.out.println(alumno.informacion()); //imprimo
        }
    }

    //DIAGRAMA
    public void agregarDiagrama(Diagrama diagrama) {
        int id = generarIdProfesor();
        diagrama.setId(id);
        diagramaId.put(id, diagrama);
    }

    private int generarIdDiagrama() {
        return proximoIdAlumno++;
    }

    public Diagrama obtenerDiagramaId(int id) {
        return diagramaId.get(id);
    }
    public void listaDiagramas(){
        for (Map.Entry<Integer, Diagrama> elemento : diagramaId.entrySet()) {
            int id = elemento.getKey(); // asigno el id del hasmap
            Diagrama diagrama = elemento.getValue();//asigno el profesor
            System.out.println("ID: " + id);
            diagrama.informacion(); //imprimo
        }
    }
    public void calcularSalario(Profesor profesor){
        int asistencias = 0;
        for (Map.Entry<Integer, Diagrama> elemento : diagramaId.entrySet()) {
            int id = elemento.getKey();
            Diagrama diagrama = elemento.getValue();
            if(diagrama.profesor == profesor){
                asistencias = diagrama.totalAsistencia();
            }
        }
        profesor.setAsistencias(asistencias);
        System.out.println("Salario profesor "+profesor.nombre+ " $"+ profesor.calcularSalario());

    }
}
