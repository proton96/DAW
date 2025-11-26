import java.util.Scanner;

public class ACT18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce una cadena: ");
        String texto = scanner.nextLine().toLowerCase();
        
        int contadorConsonantes = 0;
        
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c >= 'a' && c <= 'z') {
                // Comprobar si no es vocal
                if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                    contadorConsonantes++;
                }
            }
        }
        
        System.out.println("La cadena tiene " + contadorConsonantes + " consonantes.");
    }
}
