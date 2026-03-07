
//Clase molde para Tienda

public class Producto {
    
    // CODIGO = CLAVE
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;
    private boolean disponible;

    //CONSTRUCTOR

    public Producto (String codigo,String nombre, double precio, int stock){

        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.disponible = true;
    }
    //CONSTRUCTO VACIO

    public Producto() {
        this.disponible = true;
    }

    //GENERAMOS LOS GETTERS Y SETTERS


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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // GENERAMOS EL TO STRING

    @Override
    public String toString(){
        return String.format("Producto: %s | Código: %s | Precio: %.2f€ | Stock: %d | Disponible: %s",
        nombre,codigo,precio,stock,disponible ? "Si" : "No");
    }


    

}
