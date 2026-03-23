package documentacion;


public class Avion {
    private String modelo;
    private String fabricante;
    private int capacidadPasajeros;


    public Avion(String modelo, String fabricante, int capacidadPasajeros) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.capacidadPasajeros = capacidadPasajeros;
    }


    public Avion(String modelo) {
        this(modelo, "", 0);
    }


    public String getModelo() {
        return modelo;
    }


    public String getFabricante() {
        return fabricante;
    }


    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }


    public boolean esDeFabricante(String nombreFabricante) {
        return fabricante.equalsIgnoreCase(nombreFabricante);
    }


    public boolean esGrande() {
        return capacidadPasajeros > 200;
    }
}
