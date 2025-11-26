import java.util.Scanner;

public class ACT14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce una cadena: ");
        String texto = scanner.nextLine();
        
        String resultado = "";
        
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isLowerCase(c)) {
                resultado += Character.toUpperCase(c);
            } else if (Character.isUpperCase(c)) {
                resultado += Character.toLowerCase(c);
            } else {
                // Mantiene caracteres no alfabéticos igual
                resultado += c; 
            }
        }
        
        System.out.println("Cadena con caso cambiado: " + resultado);
    }
}
