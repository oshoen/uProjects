
package clases;


public class Tienda {
    private String nombre;
    private int idTienda;
    private String direccion;
    private Empleado empleados[];
    private Producto productos[];

    public Tienda(String nombre, int idTienda, String direccion, Empleado[] empleados, Producto[] productos) {
        this.nombre = nombre;
        this.idTienda = idTienda;
        this.direccion = direccion;
        this.empleados = empleados;
        this.productos = productos;
    }

    public Tienda() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(int idTienda) {
        this.idTienda = idTienda;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Tienda{" + "nombre=" + nombre + ", idTienda=" + idTienda + ", direccion=" + direccion + ", empleados=" + empleados + ", productos=" + productos + '}';
    }
    
    
}
