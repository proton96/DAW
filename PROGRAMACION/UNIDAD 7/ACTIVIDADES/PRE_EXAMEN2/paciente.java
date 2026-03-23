
public class paciente {

    // CLAVE
    String codigo;
    String nombre;
    int edad;
    int habitacion;
    boolean dadoAlta;

    // CONSTRUCTOR
    public paciente(String codigo, String nombre, int edad, int habitacion, boolean dadoAlta) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.habitacion = habitacion;
        this.dadoAlta = dadoAlta;
    }

    // GETTER AND SETTERS

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(int habitacion) {
        this.habitacion = habitacion;
    }

    public boolean isDadoAlta() {
        return dadoAlta;
    }

    public void setDadoAlta(boolean dadoAlta) {
        this.dadoAlta = dadoAlta;
    }

    @Override
    public String toString() {
        return "paciente [codigo=" + codigo + ", nombre=" + nombre + ", edad=" + edad + ", habitacion=" + habitacion
                + ", dadoAlta=" + dadoAlta + "]";
    }

    



}
