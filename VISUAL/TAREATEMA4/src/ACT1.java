import java.util.Scanner;

public class ACT1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();
        
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            contador++;
        }
        
        System.out.println("La cadena tiene " + contador + " caracteres.");
        
        scanner.close();
    }
}
