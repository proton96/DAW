import java.util.Scanner;

public class ACT16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();
        
        // Convertir a valor absoluto para trabajar sin signo negativo
        numero = Math.abs(numero);
        
        int suma = 0;
        
        while (numero > 0) {
            // Obtener último dígito
            int digito = numero % 10; 
            // Sumar dígito a la suma
            suma += digito;   
            // Eliminar último dígito        
            numero /= 10;             
        }
        
        System.out.println("La suma de los dígitos es: " + suma);
    }
}
