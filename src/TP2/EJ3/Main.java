package TP2.EJ3;

public class Main {
    public static void main(String[] args) {
       Academia academia = new Academia();

       Profesor profesor = new Profesor("Roberto", "Lopez");
        Profesor profesor2 = new Profesor("Carlos", "Tevez");

        academia.agregarProfesor(profesor);
        academia.agregarProfesor(profesor2);
        academia.listaProfesores();

        System.out.println();
        Alumno alumno = new Alumno("luis","suarez");
        Alumno alumno2 = new Alumno("miguel","santos");
        Alumno alumno3 = new Alumno("miguel","ramirez");

        academia.agregarAlumno(alumno);
        academia.agregarAlumno(alumno2);
        academia.agregarAlumno(alumno3);
        academia.listaAlumnos();

        System.out.println();
        Diagrama diagrama = new Diagrama("JUEVES","18 A 19","INTERMEDIO","TANGO",profesor,"512");
        Diagrama diagrama2 = new Diagrama("VIERNES","12 A 15","BASICO","BACHATA",profesor2,"009");

        diagrama.informacion();
        diagrama2.informacion();

        academia.agregarDiagrama(diagrama);
        academia.agregarDiagrama(diagrama2);

        diagrama.agregarAlumno(alumno);
        diagrama2.agregarAlumno(alumno2);
        diagrama2.agregarAlumno(alumno3);

        diagrama.marcarAsistencia(alumno,10);
        diagrama.marcarAsistencia(alumno3,10);
        diagrama.asistenciaPorAlumno();

        academia.calcularSalario(profesor);
        academia.calcularSalario(profesor2);
    }
}