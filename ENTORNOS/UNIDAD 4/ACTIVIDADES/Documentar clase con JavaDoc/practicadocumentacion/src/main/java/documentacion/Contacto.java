package documentacion;


public class Contacto {
    private String nombre;
    private String telefono;
    private String correo;


    public Contacto(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }


    public Contacto(String nombre) {
        this(nombre, "", "");
    }


    public String getNombre() {
        return nombre;
    }


    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }


    public void setCorreo(String correo) {
        this.correo = correo;
    }


    public boolean tieneTelefono() {
        return !telefono.isEmpty();
    }


    public boolean tieneCorreo() {
        return !correo.isEmpty();
    }
}
