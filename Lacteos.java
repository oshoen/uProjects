
package clases;

import java.util.Date;


public class Lacteos extends Producto{
    private String modelo;
    private Date fechaProduccion;
    private Date fechaVencimiento;
    private String tipoEmpaquetaje;

    public Lacteos(String modelo, Date fechaProduccion, Date fechaVencimiento, String tipoEmpaquetaje) {
        this.modelo = modelo;
        this.fechaProduccion = fechaProduccion;
        this.fechaVencimiento = fechaVencimiento;
        this.tipoEmpaquetaje = tipoEmpaquetaje;
    }

    public Lacteos() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getFechaProduccion() {
        return fechaProduccion;
    }

    public void setFechaProduccion(Date fechaProduccion) {
        this.fechaProduccion = fechaProduccion;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getTipoEmpaquetaje() {
        return tipoEmpaquetaje;
    }

    public void setTipoEmpaquetaje(String tipoEmpaquetaje) {
        this.tipoEmpaquetaje = tipoEmpaquetaje;
    }

    @Override
    public String toString() {
        return "Lacteos{" + "modelo=" + modelo + ", fechaProduccion=" + fechaProduccion + ", fechaVencimiento=" + fechaVencimiento + ", tipoEmpaquetaje=" + tipoEmpaquetaje + '}';
    }
    
    
}
