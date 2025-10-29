import java.util.Scanner;

public class PARTE3 {


    static void main() {

//  Una tienda quiere porcentajes de sus productos electronicos
//  y de sus productos de ropa. Ademas esto se calculara en relacion
//  a  sus ventas

     //INTRODUCCION

        double electro;
        double ropa;
        Scanner sc = new Scanner(System.in);

        //DESARROLLO

        System.out.println("¡Hola! Dime el numero de ventas de ropa: ");
        ropa = sc.nextInt();

        System.out.println("¡Hola! Dime el numero de ventas de electronica: ");
        electro = sc.nextInt();

        double porcenR = ropa/100;
        double porcenE = electro/100;

        //Desenlace
        System.out.println("Aqui tienes ambos porcentajes basados en tus ventas: ");
        System.out.println("Porcentaje de ropa:"   + porcenR);
        System.out.println("Porcentaje de electronica:"   + porcenE);
    }
}
