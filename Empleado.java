
package clases;


public class Empleado {
    private int idEmpleado;
    private String nombre;
    private String apellidoPat;
    private String apellidoMat;
    private int edad;
    private double sueldo;
    private double horasTrabajadasxDia;

    public Empleado(int idEmpleado, String nombre, String apellidoPat, String apellidoMat, int edad, double sueldo, double horasTrabajadasxDia) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellidoPat = apellidoPat;
        this.apellidoMat = apellidoMat;
        this.edad = edad;
        this.sueldo = sueldo;
        this.horasTrabajadasxDia = horasTrabajadasxDia;
    }

    public Empleado() {
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public String getApellidoMat() {
        return apellidoMat;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getHorasTrabajadasxDia() {
        return horasTrabajadasxDia;
    }

    public void setHorasTrabajadasxDia(double horasTrabajadasxDia) {
        this.horasTrabajadasxDia = horasTrabajadasxDia;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidoPat=" + apellidoPat + ", apellidoMat=" + apellidoMat + ", edad=" + edad + ", sueldo=" + sueldo + ", horasTrabajadasxDia=" + horasTrabajadasxDia + '}';
    }
    
    
}
