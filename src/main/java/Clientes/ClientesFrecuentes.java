package Clientes;

/**
 *
 * @author royel
 */

public class ClientesFrecuentes extends ClientesSuperClase {

    private int numeroMembresia;
    private int promedioGastado;
    private String productosFrecuentes;
    private String productoDescuento;
    private String asesorAsignado;
    private int cantidadCredito;

    
    //7 ATRIBUTOS 

    public ClientesFrecuentes(int numeroMembresia, int promedioGastado, String productosFrecuentes, String productoDescuento, String asesorAsignado, int cantidadCredito, String nombre, String fechaNacimiento, String genero, String cedula, String correo, String telefono, String provincia, String ciudad, String Corregimiento) {
        super(nombre, fechaNacimiento, genero, cedula, correo, telefono, provincia, ciudad, Corregimiento);
        this.numeroMembresia = numeroMembresia;
        this.promedioGastado = promedioGastado;
        this.productosFrecuentes = productosFrecuentes;
        this.productoDescuento = productoDescuento;
        this.asesorAsignado = asesorAsignado;
        this.cantidadCredito = cantidadCredito;
    }

    public int getNumeroMembresia() {
        return numeroMembresia;
    }

    public void setNumeroMembresia(int numeroMembresia) {
        this.numeroMembresia = numeroMembresia;
    }

    public int getPromedioGastado() {
        return promedioGastado;
    }

    public void setPromedioGastado(int promedioGastado) {
        this.promedioGastado = promedioGastado;
    }

    public String getProductosFrecuentes() {
        return productosFrecuentes;
    }

    public void setProductosFrecuentes(String productosFrecuentes) {
        this.productosFrecuentes = productosFrecuentes;
    }

    public String getProductoDescuento() {
        return productoDescuento;
    }

    public void setProductoDescuento(String productoDescuento) {
        this.productoDescuento = productoDescuento;
    }

    public String getAsesorAsignado() {
        return asesorAsignado;
    }

    public void setAsesorAsignado(String asesorAsignado) {
        this.asesorAsignado = asesorAsignado;
    }

    public int getCantidadCredito() {
        return cantidadCredito;
    }

    public void setCantidadCredito(int cantidadCredito) {
        this.cantidadCredito = cantidadCredito;
    }
    
}
