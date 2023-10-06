package TP2.EJ9.Figuras.TresDimensiones;

import TP2.EJ9.Figuras.Figura;

public class TresDimensiones extends Figura {
    // Método adicional para obtener el volumen
    public double getVolumen() {
        return 0; // Implementación por defecto, se sobrescribirá en las subclases 3D
    }
    @Override
    public String getTipo() {
        return null;
    }

    @Override
    public double getArea() {
        return 0;
    }
}