import java.util.Scanner;

public class ACT11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce una cadena de texto: ");
        String texto = scanner.nextLine();
        
        int contadorPalabras = 0;
        boolean enPalabra = false;
        
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) != ' ' && !enPalabra) {
                // Se encuentra el inicio de una palabra
                enPalabra = true;
                contadorPalabras++;
            } else if (texto.charAt(i) == ' ') {
                // Se encuentra un espacio, fuera de palabra
                enPalabra = false;
            }
        }
        
        System.out.println("La cadena tiene " + contadorPalabras + " palabras.");
    }
}
