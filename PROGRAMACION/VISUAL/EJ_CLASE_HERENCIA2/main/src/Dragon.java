public class Dragon implements Enemigos_I{
    private int puntosVida; // Puntos de vida del dragón
    private String nombre; // Nombre del dragón

    public Dragon(int puntosVida, String nombre) {
        this.puntosVida = puntosVida;   // Inicializa los puntos de vida del dragón
        this.nombre = nombre;  // Inicializa el nombre del dragón
    }

    public Dragon(String string, int i, String string2) {
        //TODO Auto-generated constructor stub
    }

    @Override
    public void atacar() {
        System.out.println("El dragón de elemento " + nombre + " ataca con un poderoso aliento!");
    }

    @Override
    public void huir() {
        System.out.println("El dragón de elemento " + nombre + " vuela lejos rápidamente!");
    }
    public int getPuntosVida() {
        return puntosVida;
    }
    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



}

