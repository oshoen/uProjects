
package clases;


public class Limpieza extends Producto{
    private String modelo;
    private String funcion;
    private String tipoEmpaquetaje;
    private double cantidadContenido;

    public Limpieza(String modelo, String funcion, String tipoEmpaquetaje, double cantidadContenido) {
        this.modelo = modelo;
        this.funcion = funcion;
        this.tipoEmpaquetaje = tipoEmpaquetaje;
        this.cantidadContenido = cantidadContenido;
    }

    public Limpieza() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String getTipoEmpaquetaje() {
        return tipoEmpaquetaje;
    }

    public void setTipoEmpaquetaje(String tipoEmpaquetaje) {
        this.tipoEmpaquetaje = tipoEmpaquetaje;
    }

    public double getCantidadContenido() {
        return cantidadContenido;
    }

    public void setCantidadContenido(double cantidadContenido) {
        this.cantidadContenido = cantidadContenido;
    }

    @Override
    public String toString() {
        return "Limpieza{" + "modelo=" + modelo + ", funcion=" + funcion + ", tipoEmpaquetaje=" + tipoEmpaquetaje + ", cantidadContenido=" + cantidadContenido + '}';
    }
    
    
}
