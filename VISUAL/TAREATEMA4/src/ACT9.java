import java.util.Scanner;

public class ACT9 {     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número N: ");
        int N = scanner.nextInt();
        
        int suma = 0;
        for (int i = 2; i <= N; i += 2) {
            suma += i;
        }
        
        System.out.println("La suma de los números pares desde 1 hasta " + N + " es: " + suma);
    }
    
}
                        
