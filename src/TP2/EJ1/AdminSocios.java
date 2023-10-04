package TP2.EJ1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.time.Month;

public class AdminSocios {
    private ArrayList<Socio> lista = new ArrayList<Socio>();

    public void newSocio(String miembresia,String nombre, String email, String direccion){
        Socio socio = new Socio(miembresia,nombre,email,direccion);
        lista.add(socio);
    }
    public void listaSocios(){
        for (Socio socio : lista) {
            socioInfo(socio);
        }
    }

    public void socioInfo(Socio socio){
        System.out.println(
                "Nombre: " + socio.getNombre() + ". Miembresia: "+ socio.getSuscrpicion() +"\n" +
                        "Email: " + socio.getEmail() + "\n" +
                        "Direccion: " + socio.getDireccion() + "\n" +
                        "Fehca incripcion: " + socio.getInscripcion() + " | Vencimiento: " + socio.getVencimiento());
    }

    public void nuevosSocios(){
        LocalDate fecha = LocalDate.now();
        Month mes = fecha.getMonth();
        Month mes2;
        System.out.println("Nuevos Socios Mes " + mes);
        for (Socio socio : lista) {
            mes2 = socio.getInscripcion().getMonth();
            if (mes.equals(mes2)) {
            socioInfo(socio);
            }
        }
    }
    public void actividades(){
        System.out.println("\nActividades por suscripcion:"+"\n"+"BASICA: "+"\n\n"+"INTERMEDIA:"+"\n\n"+"DESTACADA:"+"\n\n");
    }


    public void listaSociosPorSubscripcion(){
        System.out.println("BASICA");
        for (Socio socio : lista) {
            if (socio.getSuscrpicion().equals("basica")) {
                socioInfo(socio);
            }
        }
        System.out.println("INTERMEDIA");
        for (Socio socio : lista) {
            if (socio.getSuscrpicion().equals("intermedia")) {
                socioInfo(socio);
            }
        }
        System.out.println("DESTACADA");
        for (Socio socio : lista) {
            if (socio.getSuscrpicion().equals("destacada")) {
                socioInfo(socio);
            }
        }
    }
}
