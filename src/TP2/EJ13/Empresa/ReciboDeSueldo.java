package TP2.EJ13.Empresa;

public class ReciboDeSueldo {
    private int mes;
    private Double sueldo;

    public ReciboDeSueldo(int mes,double sueldo){
        this.mes = mes;
        this.sueldo = sueldo;
    }
    public int getMes(){return mes;
    }
    public double getSueldo(){return sueldo;
    }
}
