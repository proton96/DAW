import java.util.Scanner;

public class ACT10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Contador de cadenas ingresadas
        int contador = 0;
        // Almacena la cadena más larga  
        String masLarga = "";
        // Longitud máxima encontrada 
        int maxLongitud = 0;  
        
        System.out.println("Ingresa cadenas. Escribe 'salir' para terminar:");
        
        while (true) {
            // Lee la cadena completa con nextLine()
            String entrada = scanner.nextLine(); 
            // Compara ignorando mayúsculas/minúsculas 
            if (entrada.equalsIgnoreCase("salir")) {  
                break;
            }
            // Incrementa el contador para cada cadena válida
            contador++;  
            
            if (entrada.length() > maxLongitud) {
                maxLongitud = entrada.length();
                // Actualiza la cadena más larga
                masLarga = entrada;  
            }
        }
        
        System.out.println("Número total de cadenas ingresadas: " + contador);
        if (contador > 0) {
            System.out.println("La cadena más larga es: '" + masLarga + "' con " + maxLongitud + " caracteres.");
        } else {
            System.out.println("No se ingresaron cadenas.");
        }
        
        scanner.close();
    }
}
