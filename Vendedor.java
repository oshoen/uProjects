
package clases;


public class Vendedor extends Empleado{
    private String sector;
    private String tipoProductos;
    private int cantidadProductosVendidos;
    private Producto listaProductosaCargo[];

    public Vendedor(String sector, String tipoProductos, int cantidadProductosVendidos, Producto[] listaProductosaCargo) {
        this.sector = sector;
        this.tipoProductos = tipoProductos;
        this.cantidadProductosVendidos = cantidadProductosVendidos;
        this.listaProductosaCargo = listaProductosaCargo;
    }

    public Vendedor() {
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getTipoProductos() {
        return tipoProductos;
    }

    public void setTipoProductos(String tipoProductos) {
        this.tipoProductos = tipoProductos;
    }

    public int getCantidadProductosVendidos() {
        return cantidadProductosVendidos;
    }

    public void setCantidadProductosVendidos(int cantidadProductosVendidos) {
        this.cantidadProductosVendidos = cantidadProductosVendidos;
    }

    public Producto[] getListaProductosaCargo() {
        return listaProductosaCargo;
    }

    public void setListaProductosaCargo(Producto[] listaProductosaCargo) {
        this.listaProductosaCargo = listaProductosaCargo;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "sector=" + sector + ", tipoProductos=" + tipoProductos + ", cantidadProductosVendidos=" + cantidadProductosVendidos + ", listaProductosaCargo=" + listaProductosaCargo + '}';
    }
    
    
}
