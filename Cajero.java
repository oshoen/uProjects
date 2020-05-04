
package clases;


public class Cajero extends Empleado{
    private int idCaja;
    private int cantidadProcesosVentaGenerados;
    private double cantidadDineroenCaja;

    public Cajero(int idCaja, int cantidadProcesosVentaGenerados, double cantidadDineroenCaja) {
        this.idCaja = idCaja;
        this.cantidadProcesosVentaGenerados = cantidadProcesosVentaGenerados;
        this.cantidadDineroenCaja = cantidadDineroenCaja;
    }

    public Cajero() {
    }

    public int getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(int idCaja) {
        this.idCaja = idCaja;
    }

    public int getCantidadProcesosVentaGenerados() {
        return cantidadProcesosVentaGenerados;
    }

    public void setCantidadProcesosVentaGenerados(int cantidadProcesosVentaGenerados) {
        this.cantidadProcesosVentaGenerados = cantidadProcesosVentaGenerados;
    }

    public double getCantidadDineroenCaja() {
        return cantidadDineroenCaja;
    }

    public void setCantidadDineroenCaja(double cantidadDineroenCaja) {
        this.cantidadDineroenCaja = cantidadDineroenCaja;
    }

    @Override
    public String toString() {
        return "Cajero{" + "idCaja=" + idCaja + ", cantidadProcesosVentaGenerados=" + cantidadProcesosVentaGenerados + ", cantidadDineroenCaja=" + cantidadDineroenCaja + '}';
    }
    
    
}
