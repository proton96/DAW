import java.util.Scanner;

public class ACT5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa una cadena: ");
        // Normaliza: minúsculas y sin espacios (.replaceAll)
        String cadena = scanner.nextLine().toLowerCase().replaceAll("\\s+", "");  
        
        boolean esPalindromo = true;
        for (int i = 0; i < cadena.length() / 2; i++) {
            if (cadena.charAt(i) != cadena.charAt(cadena.length() - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }
        
        if (esPalindromo) {
            System.out.println("La cadena '" + cadena + "' es un palíndromo.");
        } else {
            System.out.println("La cadena '" + cadena + "' no es un palíndromo.");
        }
        
        scanner.close();
    }
}
