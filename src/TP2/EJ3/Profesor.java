package TP2.EJ3;

public class Profesor extends Persona{
    private double salarioPorDia = 10;
    private double asistencias = 0;

    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public double calcularSalario() {
        return salarioPorDia * asistencias;
    }

    public String informacion() {
        return getNombre() + " " + getApellido() + ", Salario Total: $" + calcularSalario();
    }
    public void setAsistencias(int asistencias){
        this.asistencias = asistencias;
    }
}
//falta como calcular las asistencias.
