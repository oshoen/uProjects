
package clases;


public class Producto {
    private int idProducto;
    private String nombre;
    private String marca;
    private String tipo;
    private double precioBruto;
    private double precioNeto;

    public Producto(int idProducto, String nombre, String marca, String tipo, double precioBruto, double precioNeto) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.precioBruto = precioBruto;
        this.precioNeto = precioNeto;
    }

    public Producto() {
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioBruto() {
        return precioBruto;
    }

    public void setPrecioBruto(double precioBruto) {
        this.precioBruto = precioBruto;
    }

    public double getPrecioNeto() {
        return precioNeto;
    }

    public void setPrecioNeto(double precioNeto) {
        this.precioNeto = precioNeto;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", marca=" + marca + ", tipo=" + tipo + ", precioBruto=" + precioBruto + ", precioNeto=" + precioNeto + '}';
    }
    
    
}
