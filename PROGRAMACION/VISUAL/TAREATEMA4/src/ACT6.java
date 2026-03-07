import java.util.Scanner;

public class ACT6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine().toLowerCase();
        
        int contador = 0;
        String vocales = "aeiou";
        
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (vocales.indexOf(caracter) != -1) {
                contador++;
            }
        }
        
        System.out.println("La cadena tiene " + contador + " vocales.");
        
        scanner.close();
    }
}
