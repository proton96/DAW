package documentacion;


public class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;


    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }


    public Estudiante(String nombre) {
        this(nombre, 0, "");
    }


    public String getNombre() {
        return nombre;
    }


    public int getEdad() {
        return edad;
    }


    public String getCarrera() {
        return carrera;
    }


    public boolean esMayorEdad() {
        return edad >= 18;
    }


    public boolean estudiaCarrera(String nombreCarrera) {
        return carrera.equalsIgnoreCase(nombreCarrera);
    }
}
