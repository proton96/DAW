public class Loro extends Animal {
    // Atributos:
    private String colorPlumas;
    private boolean habla;

    // Constructor completo:
    public Loro(String nombre, String especie, int edad, String colorPlumas, boolean habla) {
        super(nombre, especie, edad);
        this.colorPlumas = colorPlumas;
        this.habla = habla;
    }

    // Métodos sobrescritos:
    @Override
    public void hacerSonido() {
        System.out.println("¡Hola, hola!");
    }

    @Override
    public void alimentarse() {
        System.out.println("Come semillas y frutas.");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Color de plumas: " + colorPlumas);
        System.out.println("Habla: " + (habla ? "Sí" : "No"));
    }
}