import java.util.Scanner;

public class ACT7 {
    Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número N: ");
        int N = scanner.nextInt();
        
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
        
        scanner.close();
    }
}