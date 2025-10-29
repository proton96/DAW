import java.util.Scanner;

public class PART5 {
    void main() {
        //Polinomio que introducimos su valor x el cual tenemos que seguir la ecuacion y nos
        // muestre resultado


        //INTRODUCCION

        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor del polimonio: ");
        x = sc.nextInt();
        //DESARROLLO
        int cuadrado = x*x;
        int cubo = x*x*x;
        int cuatro = x*x*x*x;
        int quinto = x*x*x*x*x;

        // DESENLACE

        System.out.println(" Aqui tienes el resultado del polinomio: ");
        double resultado = quinto +  (7*cuatro) - (4*cubo) + (2*cuadrado) - x + 10;
        System.out.println(resultado);

    }
}
