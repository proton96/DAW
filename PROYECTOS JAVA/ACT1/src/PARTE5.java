import java.util.Scanner;

public class PARTE5 {

    static void main() {

        // Nos pide que dando una cantidad de segundos, muestres esa cantidad
        // en formato hora , minutos y segundos


        //INTRODUCCION

        int intro;
        int segundos;
        int minutos;
        int minutosR;
        int horas;
        int horasR;


        //DESARROLLO
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Hola! Dame la cantidad en segundos y te la dejo guapa: ");
        intro = sc.nextInt();


        segundos = intro %60;
        minutos = intro /60;
        minutosR = minutos % 60;
        horas = minutos /60;
        horasR = horas %60;

        //DESENLACE

        System.out.println(horasR + "horas " + minutosR + "minutos " + segundos + "segundos" );






    }
}
