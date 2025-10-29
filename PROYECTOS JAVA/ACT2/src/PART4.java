import java.util.Scanner;

public class PART4 {
    void main() {

        //OBTENER LA NOTA FINAL DE UN ALUMNO EN BASE A SUS PORCENTAJES.
//INTRODUCCION

        int primer;
        int segundo;
        int tercero;

        Scanner sc = new Scanner(System.in);

        //DESARROLLO

        System.out.println("Ingresa practica: ");
        primer = sc.nextInt();
        System.out.println("Ingresa problemas: ");
        segundo = sc.nextInt();
        System.out.println("Ingresa teorico: ");
        tercero = sc.nextInt();

        //DESENLACE
        double suma = (primer+segundo+tercero);
        double resultado = (suma*0.1)+(suma*0.5)+(suma*0.4)/3;
        System.out.println("Aqui tienes tu nota final: "+ resultado + "  final.");


    }
}
