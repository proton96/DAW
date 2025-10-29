import java.util.Scanner;

public class PARTE6 {

    static void main() {


        // Vamos a dar un numero de 5 cifras vamos a separar cada uno de sus dígitos usando
        // solo operaciones con números enteros. Suponemos que el número va a tener siempre 5 dígitos exactamente.


        //INTRODUCCION

    String numero;

        //DESARROLLO
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Hola! Introduce numero de 5 digitos:  ");
        numero = sc.nextLine();

        System.out.println("El primero es : " + numero.charAt(0));
        System.out.println("El segundo es : " + numero.charAt(1));
        System.out.println("El tercero es : " + numero.charAt(2));
        System.out.println("El cuarto es : " + numero.charAt(3));
        System.out.println("El quinto es : " + numero.charAt(4));


    }
}
