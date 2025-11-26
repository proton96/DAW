public class Tienda {
    // Atributos
    private String producto;
    private double precio;
    private double iva;
    private double descuento;

    //atributos estaticos
    private static int numeroDeProductos = 0;
    private static double descuentoGlobal = 0;

    // Constructor
    public Tienda(String producto, double precio, double iva, double descuento) {
        this.producto = producto;
        this.precio = precio;
        this.iva = iva;
        this.descuento = descuento;
        numeroDeProductos++;
        }

    // Constructor con el nombre del producto solo
    public Tienda(String producto) { 
        this(producto, 100.0, 0.21, 0.0); // Valores por defecto
    }

    //Metodo para calcular el precio final aplicando IVA y descuento
    public double calcularPrecioFinal() {
        double precioConIva = precio + (precio * iva);
        double precioConDescuento = precioConIva - (precioConIva * (descuento + descuentoGlobal));
        return precioConDescuento;

    }

    //Metodo para mostrar la informacion del producto
    public String mostrarInformacion() {
        return "Producto: " + producto + "\nPrecio: " + precio + "\nIVA: " + iva + "\nDescuento: " + descuento + "\nPrecio Final: " + calcularPrecioFinal();
    }

   
}

