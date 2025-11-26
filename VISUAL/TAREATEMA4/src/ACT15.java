import java.util.Scanner;

public class ACT15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();
        
        // Convertir a valor absoluto para contar dígitos sin signo negativo
        numero = Math.abs(numero);
        
        int contador = 0;
        
        // Caso especial si el número es 0, que tiene 1 dígito
        if (numero == 0) {
            contador = 1;
        } else {
            while (numero > 0) {
                // Elimina el último dígito
                numero /= 10; 
                // Cuenta un dígito más
                contador++;   
            }
        }
        
        System.out.println("El número tiene " + contador + " dígitos.");
    }
}
