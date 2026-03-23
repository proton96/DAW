package documentacion;

public class Vuelo {
    private String origen;
    private String destino;
    private String aerolinea;
    private int duracionHoras;

    public Vuelo(String origen, String destino, String aerolinea, int duracionHoras) {
        this.origen = origen;
        this.destino = destino;
        this.aerolinea = aerolinea;
        this.duracionHoras = duracionHoras;
    }

    public Vuelo(String origen, String destino) {
        this(origen, destino, "", 0);
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public boolean esInternacional() {
        return !origen.equals(destino);
    }


    public int calcularDuracionMinutos() {
        return duracionHoras * 60;
    }

    public boolean esOperadoPor(String nombreAerolinea) {
        return aerolinea.equals(nombreAerolinea);
    }
}
