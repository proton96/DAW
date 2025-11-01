import java.util.Random;
import java.util.Scanner;

public class ACT4 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Ingresa la longitud n de la cadena: ");
        int n = scanner.nextInt();
        
        String banco = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String cadenaAleatoria = "";
        
        for (int i = 0; i < n; i++) {
            int indice = random.nextInt(banco.length());
            cadenaAleatoria += banco.charAt(indice);
        }
        
        System.out.println("Cadena aleatoria generada: " + cadenaAleatoria);
        
        scanner.close();
    }
}
