import java.util.Scanner;

public class PART2 {
    void main() {

        // Calculo del salario semanal sabiendo que cobras a 12 euros/hora

        //INTRODUCCION

        double horas;
        Scanner sc = new Scanner(System.in);

        //DESARROLLO

        System.out.println("INTRODUCE LAS HORAS TRABAJADAS MENSUALES: ");
        horas = sc.nextInt();

        double divmes= horas/4;
        double resultado= divmes*12;

        //DESENLACE
        System.out.println("ESTE ES TU SALARIO SEMANAL: " + resultado);

    }
}
