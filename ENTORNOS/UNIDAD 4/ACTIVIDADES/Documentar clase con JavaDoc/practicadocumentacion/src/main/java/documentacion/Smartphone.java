package documentacion;


public class Smartphone {
    private String marca;
    private String modelo;
    private double precio;


    public Smartphone(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }


    public Smartphone(String marca) {
        this(marca, "", 0);
    }


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }


    public double getPrecio() {
        return precio;
    }


    public boolean esDeMarca(String nombreMarca) {
        return marca.equalsIgnoreCase(nombreMarca);
    }


    public boolean esCaro() {
        return precio > 500;
    }
}
