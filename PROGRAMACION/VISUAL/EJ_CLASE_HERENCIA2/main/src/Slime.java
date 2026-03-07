public class Slime implements Enemigos_I {
    private int puntosVida; // Puntos de vida del slime
    private String color; // Color del slime

    public Slime(int puntosVida, String color) {
        this.puntosVida = puntosVida;   // Inicializa los puntos de vida del slime
        this.color = color; // Inicializa el color del slime
    }

    @Override
    public void atacar() {
        System.out.println("El slime de color " + color + " ataca con un golpe baboso!");
    }

    @Override
    public void huir() {
        System.out.println("El slime de color " + color + " huye rodando rápidamente!");
}
    public int getPuntosVida() {
        return puntosVida;
    }
    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
}
