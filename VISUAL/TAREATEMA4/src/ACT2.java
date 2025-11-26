import java.util.Scanner;

public class ACT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();
        
        System.out.print("Ingresa la letra a buscar: ");
        String letraInput = scanner.nextLine();
        // Toma el primer carácter como letra
        char letra = letraInput.charAt(0);  
        
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char caracterActual = Character.toLowerCase(cadena.charAt(i));
            char letraBusqueda = Character.toLowerCase(letra);
            if (caracterActual == letraBusqueda) {
                contador++;
            }
        }

        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la cadena.");
        
    }
}

