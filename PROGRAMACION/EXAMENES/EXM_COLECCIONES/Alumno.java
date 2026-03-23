public class Alumno {
    
    //Añadimos nuestras variables.

    private String nombre;
    private String dni;
    private String fechaMatricula;
    private String curso;
    private boolean activo;

    // Generamos el constructor.
    public Alumno(String nombre, String dni, String fechaMatricula, String curso, boolean activo) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaMatricula = fechaMatricula;
        this.curso = curso;
        this.activo = activo;
    }


    //Generamos los Getters y Setters
    
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

    public String getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(String fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }


    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", dni=" + dni + ", fechaMatricula=" + fechaMatricula + ", curso=" + curso
                + ", activo=" + activo + "]";
    }

    
    
     



}
