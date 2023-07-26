package Clientes;

public class Compras {

   String producto;
   double precio;
   int numeroDeCompra;

    public Compras() {
    }

    public void setNumeroDeCompra(int numeroDeCompra) {
        this.numeroDeCompra = numeroDeCompra;
    }

    public int getNumeroDeCompra() {
        return numeroDeCompra;
    }
    
    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
