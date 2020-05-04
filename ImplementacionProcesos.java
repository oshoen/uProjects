
package clases;


public class ImplementacionProcesos implements Procesos{

    @Override
    public void vender() {
        System.out.println("Se vende un producto");
    }

    @Override
    public void comprar() {
        System.out.println("Se compra la mercaderia");
    }

    @Override
    public void recogerMercaderia() {
        System.out.println("Se recoge la mercaderia y se guarda");
    }

    @Override
    public void registrarProducto() {
        System.out.println("Se registran producto y se ordenan");
    }
    
}
