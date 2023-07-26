package Clientes;

/**
 *
 * @author royel
 */
public class ClientesVIP extends ClientesFrecuentes {

    private String asesorAsignado;
    private int cantidadCredito;

    //ATRIBUTOS PROPIOS DE CLIENTES VIP 
    public ClientesVIP(int numeroMembresia, int promedioGastado, String productosFrecuentes, String productoDescuento, String asesorAsignado, int cantidadCredito, String nombre, String fechaNacimiento, String genero, String cedula, String correo, String telefono, String provincia, String ciudad, String Corregimiento) {
        super(numeroMembresia, promedioGastado, productosFrecuentes, productoDescuento, asesorAsignado, cantidadCredito, nombre, fechaNacimiento, genero, cedula, correo, telefono, provincia, ciudad, Corregimiento);
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
