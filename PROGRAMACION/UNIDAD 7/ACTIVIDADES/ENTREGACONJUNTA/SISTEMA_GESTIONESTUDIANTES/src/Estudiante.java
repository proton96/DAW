public class Estudiante {
    private String nombre;
    private int edad;
    private String ciudad;
    private double calificacion;

    // Constructor completo
    public Estudiante(String nombre, int edad, String ciudad, double calificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
        this.calificacion = calificacion;
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }
    public double getCalificacion() { return calificacion; }
    public void setCalificacion(double calificacion) { this.calificacion = calificacion; }

    // toString para mostrar info
    @Override
    public String toString() {
        return String.format("%s (Edad: %d, Ciudad: %s, Calificación: %.1f)",
            nombre, edad, ciudad, calificacion);
    }
}
