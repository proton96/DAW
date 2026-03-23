package documentacion;


public class Fruta {
    private String nombre;
    private String color;
    private double peso;
    private boolean fresca;


    public Fruta(String nombre, String color, double peso) {
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
        this.fresca = true;
    }


    public Fruta(String nombre) {
        this(nombre, "", 0);
    }


    public String getNombre() {
        return nombre;
    }


    public String getColor() {
        return color;
    }

    public double getPeso() {
        return peso;
    }


    public boolean esDeColor(String nombreColor) {
        return color.equalsIgnoreCase(nombreColor);
    }


    public boolean esPesada() {
        return peso > 0.5;
    }


    public boolean estaFresca() {
        return fresca;
    }


    public void setFresca(boolean fresca) {
        this.fresca = fresca;
    }
}
