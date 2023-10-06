package TP2.EJ10.Empleados;

public abstract class Empleado {
    private String nombre;
    private String apellido;
    private String telefono;
    private String cuit;

    private boolean cumpleaños = false;

    public Empleado(String nombre, String apellido, String telefono, String cuit) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.cuit = cuit;
    }

    // Método abstracto para calcular el sueldo
    public abstract double calcularSueldo();
    public abstract String getTipo();

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public double calcularBonoCumpleanos() {
        if(getTipo().equals("PASANTE")){
            System.out.println("Este mes es su cumpleaños!");
            return 0;
        }
        else if(getCumpleaños()){
            System.out.println("Este mes es su cumpleaños!");
            return 2000;}
        else{
            System.out.println("Este mes NO es su cumpleaños!");
            return 0;
        }// Bono adicional para empleados asalariados// Bono base de cumpleaños
    }
    public void setCumpleaños(boolean cumpleaños) {
        this.cumpleaños = cumpleaños;
    }
    public boolean getCumpleaños(){
        return cumpleaños;
    }

}