
import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Introduce numero 1: ");
            double nu1 = sc.nextDouble();
            System.out.println("Introduce numero 2: ");
            double nu2 = sc.nextDouble();

            System.out.println("====MENU====");
            System.out.println("1.SUMA ");
            System.out.println("2.RESTA ");
            System.out.println("3.MULTIPLICAR ");
            System.out.println("4.DIVISION ");

            Calc_base c = new Calc_base(nu1, nu2);

            int resultado = -1;

            switch (opcionMenu) {
                    case 1:
                        resultado = c.sumar();
                        break;
                    case 2:
                        resultado = restar();
                        break;
                    case 3:
                        resultado = multiplicar();
                        break;
                    case 4:
                        resultado = dividir();
                        break;
                    default:
                        System.out.println("No se aun hacer eso.");

                }

            System.out.println("El resultado es: "a  
        );


        }
        
    
    }

}
