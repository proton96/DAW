public class Mago extends Personaje {

    private String tipoHechizo;     // Nuevo atributo específico de Mago

    public Mago(String nombre, int nivel , String tipoHechizo) {
        super(nombre, nivel);   // Llama al constructor de la clase base Personaje
        this.tipoHechizo = "Bola de Fuego";  // Inicializa el atributo específico
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " lanza un hechizo mágico!");
    }

    @Override
    public void usarHabilidad() {
        System.out.println(nombre + " usa su habilidad especial: Bola de Fuego!");
    }

}
