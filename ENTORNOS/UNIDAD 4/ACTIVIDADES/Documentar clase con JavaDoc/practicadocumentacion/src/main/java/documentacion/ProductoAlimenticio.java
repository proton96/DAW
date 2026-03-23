package documentacion;

/**
 * Clase contenedora con la información de cada producto alimenticio
 *
 * @author Jose Carlos Martin
 * @version 1.0
 */
public class ProductoAlimenticio {
 
    //Atributos

    /**
     * Nombre del producto alimenticio
     */
    private String nombre;
    
    /**
     * Tipo del producto alimenticio (ej: fruta, verdura, carne)
     */
    private String tipo;
    
    /**
     * Precio del producto alimenticio en euros
     */
    private double precio;
    
    /**
     * Indica si el producto requiere refrigeración
     */
    private boolean refrigerado;
 
    //Metodos publicos
    
    /**
     * Constructor con 4 parámetros
     * @param nombre nombre del producto
     * @param tipo tipo del producto
     * @param precio precio del producto
     * @param refrigerado si requiere refrigeración
     * @since 1.0
     */
    public ProductoAlimenticio(String nombre, String tipo, double precio, boolean refrigerado){
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.refrigerado = refrigerado;
    }

    /**
     * Método selector para el atributo nombre
     * @return nombre del producto alimenticio
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Método selector para el atributo tipo
     * @return tipo del producto alimenticio
     */
    public String getTipo() {
        return this.tipo;
    }
    
    /**
     * Método selector para el atributo precio
     * @return precio del producto alimenticio
     */
    public double getPrecio() {
        return this.precio;
    }

    /**
     * Método que indica si el producto necesita refrigeración
     * @return true si necesita refrigeración, false en caso contrario
     * @since 1.0
     */
    public boolean necesitaRefrigeracion() {
        return this.refrigerado;
    }
    
    /**
     * Comprueba si el producto es caro según un criterio de precio superior a 10€
     * @return true si es caro, false si es económico
     * @since 1.0
     */
    public boolean esCaro() {
        return this.precio > 10;
    }
    
}
