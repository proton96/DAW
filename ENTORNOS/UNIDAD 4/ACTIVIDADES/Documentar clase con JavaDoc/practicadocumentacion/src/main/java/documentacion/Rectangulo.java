package documentacion;


public class Rectangulo {
    private double longitud;
    private double anchura;


    public Rectangulo(double longitud, double anchura) {
        this.longitud = longitud;
        this.anchura = anchura;
    }


    public Rectangulo(double lado) {
        this(lado, lado);
    }


    public double getLongitud() {
        return longitud;
    }


    public double getAnchura() {
        return anchura;
    }


    public double calcularArea() {
        return longitud * anchura;
    }


    public double calcularPerimetro() {
        return 2 * (longitud + anchura);
    }


    public boolean esCuadrado() {
        return longitud == anchura;
    }
}
