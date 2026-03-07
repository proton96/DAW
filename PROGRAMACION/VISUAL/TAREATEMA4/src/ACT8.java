import java.util.Random;
import java.util.Scanner;

public class ACT8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSecreto = random.nextInt(100) + 1;  // Genera número aleatorio de 1 a 100
        int intento = 0;
        int contadorIntentos = 0;
        
        System.out.println("¡Bienvenido al juego de adivinanza!");
        System.out.println("He pensado en un número entre 1 y 100. ¿Puedes adivinarlo?");
        
        while (true) {
            System.out.print("Ingresa tu intento: ");
            intento = scanner.nextInt();
            
            if (intento == numeroSecreto) {
                System.out.println("¡Felicidades! Adivinaste el número " + numeroSecreto + " en " + (contadorIntentos + 1) + " intentos.");
                break;
            } else if (intento < numeroSecreto) {
                System.out.println("El número es mayor. Intenta de nuevo.");
            } else {
                System.out.println("El número es menor. Intenta de nuevo.");
            }
            contadorIntentos++;
        }
        
        scanner.close();
    }
}
