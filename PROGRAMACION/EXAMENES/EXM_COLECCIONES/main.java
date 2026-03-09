
import java.util.Scanner;

public class main {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int num;

        //INICIALIZACION
    Ej1 ej1 = new Ej1();
    Ej2 ej2 = new Ej2();


        do {
            System.out.println("=======MENU EXAMEN=======");
            System.out.println("[1] EJERCICIO 1");
            System.out.println("[2] EJERCICIO 2");
            System.out.println("[3] EXIT");
            System.out.println("Elige una opcion: ");
            num = sc.nextInt();

            switch (num) {
                case 1:
                    ej1.menu();
                    break;
                case 2: 
                   ej2.menu();
                    break;
                default:
                    break;
            }




        } while (num!=3);

        sc.close();
    }

    

}
