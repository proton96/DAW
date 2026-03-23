import java.util.Scanner;

public class main {
    

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
        // MENU EJECUTOR
        do {
            System.out.println("======MENU PRE-EXAMEN 2 ======");
            System.out.println("[1] EJERCICIO 1");
            System.out.println("[2] EJERCICIO 2");
            System.out.println("[3] SALIR");
            System.out.println("¿Que opcion deseas?:");
            num = sc.nextInt();

            switch (num) {
                case 1:
                    ejercicio1.menu();
                    break;
                case 2:
                    ejercicio2.menu();
                    break;
                default:
                    break;
            }

        } while (num != 3);
        
        sc.close();




    }




}
