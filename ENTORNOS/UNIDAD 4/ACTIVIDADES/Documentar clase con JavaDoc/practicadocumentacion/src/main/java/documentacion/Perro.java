package documentacion;


public class Perro {
    private String nombre;
    private int edad;
    private String raza;


    public Perro(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }


    public Perro(String nombre) {
        this(nombre, 0, "");
    }


    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }


    public String getRaza() {
        return raza;
    }

    public boolean esMayorEdad() {
        return edad >= 7;
    }


    public boolean esDeRaza(String nombreRaza) {
        return raza.equalsIgnoreCase(nombreRaza);
    }
}
