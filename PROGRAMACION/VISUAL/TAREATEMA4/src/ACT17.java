import java.util.Random;
import java.util.Scanner;

public class ACT17 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        // Número entre 1 y 10
        int numeroSecreto = random.nextInt(10) + 1; 
        int intento;
        
        System.out.println("Adivina el número entre 1 y 10.");
        
        do {
            System.out.print("Introduce tu intento: ");
            intento = scanner.nextInt();
            
            if (intento < numeroSecreto) {
                System.out.println("Demasiado bajo. Intenta otra vez.");
            } else if (intento > numeroSecreto) {
                System.out.println("Demasiado alto. Intenta otra vez.");
            }
        } while (intento != numeroSecreto);
        
        System.out.println("¡Felicidades! Has adivinado el número: " + numeroSecreto);
    }
}
