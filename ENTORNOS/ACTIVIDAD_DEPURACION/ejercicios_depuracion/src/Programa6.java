public class Programa6 {
    public static void main(String[] args) {
        // Calcular el factorial de un número
        int numero = 5;
        int factorial = 0;

        for (int i = 0; i <= numero; i++) {
            factorial *= numero;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
