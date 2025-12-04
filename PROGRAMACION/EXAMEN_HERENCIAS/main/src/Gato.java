import java.lang.reflect.Constructor;

import java.util.Scanner;



public class Gato extends Animal {
    // Atributos y escaner:
    private boolean tieneCola;
    private int vidasRestantes;
    private static Scanner scanner = new Scanner(System.in);

    // Constructor completo.
    public Gato(String nombre, String especie, int edad, int vidasRestantes, boolean tieneCola) {
        super(nombre, especie, edad);
        this.tieneCola = tieneCola;
        this.vidasRestantes = vidasRestantes;
    }

    // Constructor por defecto (vidas = 7).
    public Gato() {
        super("Desconocido", "Desconocida", 0);
        this.tieneCola = true;
        this.vidasRestantes = 7;
    }

    // Métodos sobrescritos:
    @Override
    public void hacerSonido() {
        System.out.println("miau miau");
    }

    @Override
    public void alimentarse() {
        System.out.println("El gato come pescado.");
    }

    @Override
    // cola y vidas restantes.
   public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Tiene cola: " + (tieneCola ? "Sí" : "No"));
        System.out.println("Vidas restantes: " + vidasRestantes);
   }


    //Métodos propios:
    public void saltar(int veces){
        for (int i = 0; i < veces; i++) {
            System.out.println("El gato salta.");
        }
    }

    public static Gato crearGatoPorConsola() {
        System.out.print("Ingrese el nombre del gato: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la especie del gato: ");
        String especie = scanner.nextLine();
        System.out.print("Ingrese la edad del gato: ");
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese las vidas restantes del gato: ");
        int vidasRestantes = Integer.parseInt(scanner.nextLine());
        System.out.print("¿El gato tiene cola? (true/false): ");
        boolean tieneCola = Boolean.parseBoolean(scanner.nextLine());
        Gato gato = new Gato(nombre, especie, edad, vidasRestantes, tieneCola);
        return gato;
    
      
    }

   
}
