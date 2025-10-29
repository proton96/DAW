import java.util.Scanner;

public class PART7 {
    void main() {

        //INTRODUCCION
        int dia;
        int mes;
        int año;
        int suerte;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el dia, mes y año de tu nacimiento:");
        dia = sc.nextInt();
        mes = sc.nextInt();
        año = sc.nextInt();

        //DESARROLLO
        suerte = dia + mes + año;

        int numeroDeLaSuerte = 0;
        int temp = suerte;
        while (temp > 0) {
            numeroDeLaSuerte += temp % 10;
            temp /= 10;
        }
    System.out.println("Aqui tienes tu dia de la suerte: "+numeroDeLaSuerte);

    }
    }
