import java.util.Scanner;

public class PARTE2 {
    static void main() {

// En esta parte vamos a realizar una api que lea 4 enteros y calcule : +,* y su media aritmetica.

        //INTRODUCCION

        int numero1;
        int numero2;
        int numero3;
        int numero4;
        Scanner sc = new Scanner(System.in);

        //DESARROLLO

        System.out.println("Introduce numero 1: ");
        numero1 = sc.nextInt();
        System.out.println("Introduce numero 2: ");
        numero2 = sc.nextInt();
        System.out.println("Introduce numero 3: ");
        numero3 = sc.nextInt();
        System.out.println("Introduce numero 4: ");
        numero4 = sc.nextInt();

        int suma = numero1+numero2+numero3+numero4;
        int multiplicacion = numero1*numero2*numero3*numero4;
        double media = suma /4;

        // DESENLACE

        System.out.println("La suma es: " + suma);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("Nuestra media aritmetica es: " +media);

    }
}
