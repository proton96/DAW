package documentacion;


public class Banco {
    private String nombre;
    private String direccion;
    private double capital;


    public Banco(String nombre, String direccion, double capital) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.capital = capital;
    }


    public Banco(String nombre) {
        this(nombre, "", 0);
    }


    public String getNombre() {
        return nombre;
    }


    public String getDireccion() {
        return direccion;
    }


    public double getCapital() {
        return capital;
    }


    public boolean tieneSuficienteCapital(double monto) {
        return capital >= monto;
    }


    public void actualizarCapital(double monto) {
        capital -= monto;
    }
}
