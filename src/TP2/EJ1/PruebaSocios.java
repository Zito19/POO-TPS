package TP2.EJ1;

public class PruebaSocios {
    public static void main(String[] args){
    //agregar socio

        AdminSocios admin = new AdminSocios();

        admin.newSocio("basica","beto","beitto@gmail.com", "calle 712");
        admin.newSocio("intermedia","esteban","beto@gmail.com", "calle 212");
        admin.newSocio("destacada","carlos","carlos@gmail.com", "calle 1112");
        admin.newSocio("a","roberto","roberto@gmail.com", "calle 1232");
        admin.listaSocios();

        System.out.println("NUEVOS SOCIOS DEL MES");
        admin.nuevosSocios();
        admin.actividades();

        System.out.println("LISTADO POR SUSCRIPCION");
        admin.listaSociosPorSubscripcion();
    }
}
