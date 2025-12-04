import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Perro extends Animal {

    // Atributos:
    private String raza;
    private boolean entrenado;

    // Constructor completo con parámetros.
    public Perro(String nombre, String especie, int edad, String raza, boolean entrenado) {
        super(nombre, especie, edad);
        this.raza = raza;
        this.entrenado = entrenado;
    }

    // Constructor por defecto.
    public Perro() {
        super("Desconocido", "Desconocida", 0);
        this.raza = "Desconocida";
        this.entrenado = false;
    }
    // Métodos sobrescritos:

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: ¡Guau, guau!");
    }

    @Override
    public void alimentarse() {
        System.out.println("El perro está comiendo pienso.");
    }

    @Override
    // incluye raza y si está entrenado.
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Raza: " + raza);
        System.out.println("Entrenado: " + (entrenado ? "Sí" : "No"));
    }

    // Métodos propios:
    public void moverCola(int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.println("El perro mueve la cola.");
        }
    }

    public static Perro crearPerroPorConsola() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del perro: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la especie del perro: ");
        String especie = scanner.nextLine();
        System.out.print("Ingrese la edad del perro: ");
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese la raza del perro: ");
        String raza = scanner.nextLine();
        System.out.print("¿El perro está entrenado? (true/false): ");
        boolean entrenado = Boolean.parseBoolean(scanner.nextLine());
       
         Perro perro = new Perro(nombre, especie, edad, raza, entrenado);
        return perro;
        

    }

}
