public class Guerrero extends Personaje {
    private String arma;

    public Guerrero(String nombre, int nivel, String arma) {
        super(nombre, nivel);   // Llama al constructor de la clase base Personaje
        this.arma = arma;
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " ataca con su " + arma + " al nivel " + nivel);
    }

    @Override
    public void usarHabilidad() {
        System.out.println(nombre + " usa una habilidad especial con su " + arma);
    }

}
