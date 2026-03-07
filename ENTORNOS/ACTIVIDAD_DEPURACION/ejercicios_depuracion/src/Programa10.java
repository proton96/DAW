import java.util.Arrays;

public class Programa10 {
    public static void main(String[] args) {
        // Generar la secuencia Fibonacci
        int n = 10;
        int[] fibonacci = new int[n];

        fibonacci[0] = 1;
        fibonacci[1] = 1;
            for (int i = 2; i < n; i++) {  // Empieza en 2, suma i-2 + i-1
                fibonacci[i] = fibonacci[i-2] + fibonacci[i-1];
                    }


        System.out.println("Secuencia Fibonacci: " + Arrays.toString(fibonacci));
    }


}
