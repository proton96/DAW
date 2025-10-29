import java.util.Scanner;

public class PART3 {

    void main() {

        // OBTENER LA PUNTUACION TOTAL DE UN EQUIPO SABIENDO QUE +3 PARTIDO GANADO, +1 PARTIDO PERDIDO
        // Y +0 PARTIDO PERDIDO

    //INTRODUCCION

        int ganar;
        int empt;
        int perd;

        Scanner sc = new Scanner(System.in);

        //DESARROLLO

        System.out.println("Ingresa partidos ganados: ");
        ganar = sc.nextInt();
        System.out.println("Ingresa partidos empatados: ");
        empt = sc.nextInt();
        System.out.println("Ingresa partidos perdidos: ");
        perd = sc.nextInt();

        //DESENLACE
        int resultado = (ganar*3) + (empt*1);
        System.out.println("Aqui tienes los resultados de tu equipo: "+ resultado + " puntos.");



    }
}
