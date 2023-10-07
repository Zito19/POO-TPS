import TP2.EJ6.Cliente;
import TP2.EJ6.Empleado;
import TP2.EJ6.TipoCombustible;

public class Venta {
    private Cliente cliente;
    private TipoCombustible tipoCombustible;
    private double totalVenta;
    private Empleado playero;

    public Venta(Cliente cliente, TipoCombustible tipoCombustible, double totalVenta, Empleado playero) {
        this.cliente = cliente;
        this.tipoCombustible = tipoCombustible;
        this.totalVenta = totalVenta;
        this.playero = playero;
        this.playero.registrarVenta(totalVenta);
    }

    public String getNumeroPatente(){
        return cliente.getNumeroPatente();
    }

    public double getTotalVenta(){
        return totalVenta;
    }

    public String getEmpleado(){
        return playero.getNombre();
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }
}