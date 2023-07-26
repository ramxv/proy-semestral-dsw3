package Clientes;

/**
 *
 * @author royel
 */

public class ClientesSuperClase {

    private String nombre;
    private String fechaNacimiento;
    private String genero;
    private String cedula;
    private String correo;
    private String telefono;
    private String provincia;
    private String ciudad;
    private String Corregimiento;

    public ClientesSuperClase(String nombre, String fechaNacimiento, String genero, String cedula, String correo, String telefono, String provincia, String ciudad, String Corregimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.Corregimiento = Corregimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCorregimiento() {
        return Corregimiento;
    }

    public void setCorregimiento(String Corregimiento) {
        this.Corregimiento = Corregimiento;
    }
    
}
