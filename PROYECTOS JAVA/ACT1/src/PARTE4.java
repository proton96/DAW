import java.util.Scanner;
import java.util.concurrent.Callable;

public class PARTE4 {

    static void main() {
        // Con tres variables A,B,C tienes que con solo una variable auxiliar
        // A=B , C=B y A=C. Ademas amplia con una variable mas y distintas formas


        // PRIMERA FORMA

        //INTRODUCCION

        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);


        // DESARROLLO

        System.out.println("Dime el numero A: ");
        a = sc.nextInt();
        System.out.println("Dime el numero B: ");
        b = sc.nextInt();
        System.out.println("Dime el numero C: ");
        c = sc.nextInt();

        int resultadoA = c;
        int resultadoB = a;
        int resultadoC = b;

        //DESENLACE

        System.out.println("Te troleo, estos son los nuevos valores de cada letra: ");
        System.out.println("A=" + resultadoA);
        System.out.println("B=" + resultadoB);
        System.out.println("C=" + resultadoC);



        // SEGUNDA FORMA AÑADIENDO UNA VARIABLE MAS

        // INTRODUCCION

        int A;
        int B;
        int C;
        int D;
        int resultado;
        char operacion=0;
        Scanner sc2 = new Scanner(System.in);

        // DESARROLLO
        System.out.println("Introduce A: ");
        A = sc.nextInt();
        System.out.println("Introduce B: ");
        B = sc.nextInt();
        System.out.println("Introduce C: ");
        C = sc.nextInt();
        System.out.println("Introduce D: ");
        D = sc.nextInt();

        System.out.println("Te troleo, sus valores reales apareceran ahora al pulsarlos: ");
        resultado = sc.next().charAt(0);

        switch (resultado) {
            case 'a':
                System.out.println("A=" + B);
                break;
            case 'b':
                System.out.println("B=" +  A);
                break;
            case 'c':
                System.out.println("C=" + D);
                break;
            case 'd':
                System.out.println("D=" +  C);
                break;
        }






    }

    }
