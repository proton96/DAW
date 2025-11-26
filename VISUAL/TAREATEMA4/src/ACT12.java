import java.util.Scanner;

public class ACT12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Contar caracteres");
            System.out.println("2. Invertir cadena");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcion) {
                case 1:
                    System.out.print("Introduce una cadena: ");
                    String cadena = scanner.nextLine();
                    System.out.println("La cadena tiene " + cadena.length() + " caracteres.");
                    break;
                case 2:
                    System.out.print("Introduce una cadena: ");
                    cadena = scanner.nextLine();
                    String invertida = "";
                    for (int i = cadena.length() - 1; i >= 0; i--) {
                        invertida += cadena.charAt(i);
                    }
                    System.out.println("Cadena invertida: " + invertida);
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 3);
    }
}
