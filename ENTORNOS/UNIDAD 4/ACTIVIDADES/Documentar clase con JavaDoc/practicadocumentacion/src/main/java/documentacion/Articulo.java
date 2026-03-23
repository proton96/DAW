package documentacion;


public class Articulo {
    private String nombre;
    private String descripcion;
    private double precio;


    public Articulo(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }


    public Articulo(String nombre) {
        this(nombre, "", 0);
    }


    public String getNombre() {
        return nombre;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }


    public boolean esCaro() {
        return precio > 100;
    }
}
