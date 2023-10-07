package TP2.EJ6;

import TP2.EJ6.Combustible;

public class Cliente {
    private String numeroPatente;
    private Combustible tipoCombustible;

    // Constructor
    public Cliente(String numeroPatente, Combustible tipocombustible) {
        this.numeroPatente = numeroPatente;
        this.tipoCombustible = tipoCombustible;
    }
    public String getNumeroPatente() {return numeroPatente;
    }
}