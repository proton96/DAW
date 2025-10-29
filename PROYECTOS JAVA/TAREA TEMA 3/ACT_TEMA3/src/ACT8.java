import java.util.Scanner;

public class ACT8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número entero positivo: ");
        int numero = sc.nextInt();
        
        sc.close();
        
        // Validar número positivo
        if (numero <= 0) {
            System.out.println("Número inválido. Debe ser positivo.");
            return;
        }
        
        // Calcular suma de divisores propios
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
            }
        }
        
        // Verificar si es perfecto
        if (suma == numero) {
            System.out.println("El número " + numero + " es perfecto.");
        } else {
            System.out.println("El número " + numero + " no es perfecto. Suma de divisores: " + suma + ".");
        }
    }
}
