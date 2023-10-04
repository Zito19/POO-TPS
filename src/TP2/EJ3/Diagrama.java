package TP2.EJ3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Diagrama {
    private int id;
    private String dia;
    private String horario;
    private String nivel;
    private String disciplina;
    public Profesor profesor;
    private String salon;
    private Map<Alumno, Integer> asistencias = new HashMap<>();

    public Diagrama(String dia, String horario, String nivel, String disciplina, Profesor profesor,String salon) {
        this.dia = dia;
        this.horario = horario;
        this.nivel = nivel;
        this.disciplina = disciplina;
        this.profesor = profesor;
        this.salon = salon;
    }
    protected void setId(int id){
        this.id = id;
    }
    protected int getId(){
        return id;
    }

    public void agregarAlumno(Alumno alumno) { // Cambio aquí
        asistencias.put(alumno, 0);
    }

    public void marcarAsistencia(Alumno alumno, int nuevas) {
        int actuales = 0;
        for (Map.Entry<Alumno,Integer> elemento: asistencias.entrySet()){
            Alumno aux= elemento.getKey();
            if(aux.getCredencial().equals(alumno.getCredencial())){
                actuales += elemento.getValue();
                elemento.setValue(actuales + nuevas);
            }
        }
        if(actuales == 0){
            System.out.println("ALUMNO NO ENCONTRADO !");
        }
    }

    public void asistenciaPorAlumno() {
        for (Map.Entry<Alumno, Integer> elemento : asistencias.entrySet()) {
            int asistencia = elemento.getValue();
            Alumno alumno = elemento.getKey();
            System.out.println("Alumno: " + alumno.informacion() + " | ASISTENCIAS TOTALES :" + asistencia);
        }
    }

    public int totalAsistencia() {
        int total = 0;
        for (Map.Entry<Alumno, Integer> elemento : asistencias.entrySet()) {
            total += elemento.getValue();
        }
        return total;
    }
    public void informacion() {
        StringBuilder informacion = new StringBuilder();
        informacion.append("Día: ").append(dia).append("\n");
        informacion.append("Horario: ").append(horario).append("\n");
        informacion.append("Nivel: ").append(nivel).append("\n");
        informacion.append("Disciplina: ").append(disciplina).append("\n");
        informacion.append("Profesor: ").append(profesor.getNombre()).append(" ").append(profesor.getApellido()).append("\n");
        informacion.append("Salón: ").append(salon).append("\n");
        System.out.println(informacion.toString());
    }
}