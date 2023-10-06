package TP2.EJ9;

import TP2.EJ9.Figuras.DosDimenciones.Circulo;
import TP2.EJ9.Figuras.DosDimenciones.Rectangulo;
import TP2.EJ9.Figuras.Figura;
import TP2.EJ9.Figuras.TresDimensiones.*;

public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[]{
                new Circulo(5),
                new Rectangulo(3, 4),
                new Esfera(2),
                new Paralelepipedo(3, 4, 5),
                new Tetraedro(4), // Tetraedro con arista 4
                new Cubo(3) // Cubo con arista 3
        };

        for (Figura figura : figuras) {
            System.out.println("Tipo de Figura: " + figura.getTipo());
            System.out.println("Área: " + figura.getArea());

            if (figura instanceof TresDimensiones) {
                TresDimensiones figura3D = (TresDimensiones) figura;
                System.out.println("Volumen: " + figura3D.getVolumen());
            }

            System.out.println();
        }
    }
}
