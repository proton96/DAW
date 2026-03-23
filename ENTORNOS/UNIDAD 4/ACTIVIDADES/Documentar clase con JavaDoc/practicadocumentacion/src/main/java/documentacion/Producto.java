package documentacion;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidadDisponible;


    public Producto(String nombre, double precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }


    public Producto(String nombre) {
        this(nombre, 0, 0);
    }

    public String getNombre() {
        return nombre;
    }


    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public int getCantidadDisponible() {
        return cantidadDisponible;
    }


    public void incrementarStock(int cantidad) {
        cantidadDisponible += cantidad;
    }

    public void vender(int cantidad) {
        if (cantidad <= cantidadDisponible) {
            cantidadDisponible -= cantidad;
        } else {
            throw new IllegalArgumentException("Cantidad vendida excede la cantidad disponible");
        }
    }


    public boolean estaDisponible() {
        return cantidadDisponible > 0;
    }


    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidadDisponible=" + cantidadDisponible +
                '}';
    }
}
