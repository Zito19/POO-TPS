package TP2.EJ9.Figuras.DosDimenciones;

import TP2.EJ9.Figuras.Figura;

class DosDimensiones extends Figura {
    @Override
    public String getTipo() {
        return null;
    }

    @Override
    public double getArea() {
        return 0; // Implementación por defecto, se sobrescribirá en las subclases 2D
    }
}
