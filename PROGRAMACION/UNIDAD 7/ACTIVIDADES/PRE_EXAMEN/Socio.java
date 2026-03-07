

// Clase molde para Gimnasio

public class Socio {
    
    private String nombre;
    // DNI = CLAVE
    private String dni;
    private int edad;
    private String fechaInscripcion;
    private boolean activo;


    //CONSTRUCTOR


    public Socio (String nombre,String dni,int edad,String fechaInscripcion){

        this.nombre =nombre;
        this.dni = dni;
        this.edad = edad;
        this.fechaInscripcion = fechaInscripcion;
        this.activo = true;
    }

    // CREAMOS CONSTRUCTOR VACIO

    public Socio(){
        this.activo = true;
    }


    // GENERAMOS LOS GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }


    // Ahora hacemos el metodo toString
    @Override
    public String toString(){
        return String.format("Socio : %s | DNI: %s | Edad: %d | Fecha: %s | Activo: %s", nombre,dni,edad,fechaInscripcion,activo ? "Si" : "No");

    }
    

}
