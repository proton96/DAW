import java.util.Scanner;

public class ACT3 {
    public static void main(String[] args) {
        public class InvertirCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();
        
        String cadenaInvertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i);
        }
        
        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena invertida: " + cadenaInvertida);
        
        scanner.close();
            }
        }
    }
}
