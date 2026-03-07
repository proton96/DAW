import java.util.Random;

public class ACT19 {
    public static void main(String[] args) {
        Random random = new Random();
        int suma = 0;
        int cantidad = 10;

        System.out.println("Números aleatorios generados:");
        for (int i = 0; i < cantidad; i++) {
            int numero = random.nextInt(100) + 1;
            System.out.print(numero + " ");
            suma += numero;
        }

        double media = (double) suma / cantidad;
        System.out.println("\nLa media es: " + media);
    }
}
