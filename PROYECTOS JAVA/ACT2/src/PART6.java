import java.util.Scanner;

public class PART6 {
    void main() {
        // Se dan dos instantes de tiempo en formato (horas/minutos/segundos), por lo que
        // el programa tiene en cuenta que el segundo es anterior al primero. Y de esta forma
        // muestra la diferencia.

        //INTRODUCCION
        int h1;
        int m1;
        int s1;
        int h2;
        int m2;
        int s2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la hora, minutos y segundos del primer instante:");
        h1 = sc.nextInt();
        m1 = sc.nextInt();
        s1 = sc.nextInt();
        System.out.println("Introduce la hora, minutos y segundos del segundo instante:");
        h2 = sc.nextInt();
        m2 = sc.nextInt();
        s2 = sc.nextInt();

        //DESARROLLO
        int totalSegs1 = h1 * 3600 + m1 * 60 + s1;
        int totalSegs2 = h2 * 3600 + m2 * 60 + s2;
        int diferencia = totalSegs1 - totalSegs2;

        int horas = diferencia / 3600;
        int minutos = (diferencia % 3600) / 60;
        int segundos = diferencia % 60;

        //DESENLACE

        System.out.println("La diferencia es: "+ horas +"h"+ minutos +"min"+ segundos +"seg."  );







    }
}
