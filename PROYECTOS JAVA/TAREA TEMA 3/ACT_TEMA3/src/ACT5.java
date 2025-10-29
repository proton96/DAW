import java.util.Scanner;

public class ACT5 {
    public static void main(String[] args) {
        // equilátero (todos iguales)
        //isósceles (dos iguales)
        //escaleno (todos diferentes)
        //invalido si no cumple desigualdad triangular (suma de dos lados mayor al tercero)
        Scanner sc= new Scanner(System.in);
        
        //Solicitamos los datos al usuario
        System.out.println("Ingresa el lado A: ");
        double a = sc.nextDouble();
        System.out.println("Ingresa el lado B: ");
        double b = sc.nextDouble();
        System.out.println("Ingresa el lado C: ");
        double c = sc.nextDouble();

        sc.close();

        //Validar la desigualdad triangular 
        if ((a+b<=c) && (a+c <=b) && (b+c<=a)){
            System.out.println("Los lados no forman un triangulo.");
            return;
        }

        //Clasificar el tipo 
         if (a == b && b == c) {
            System.out.println("El triángulo con lados " + a + ", " + b + ", " + c + " es equilátero.");
        } else if (a == b || a == c || b == c) {
            System.out.println("El triángulo con lados " + a + ", " + b + ", " + c + " es isósceles.");
        } else {
            System.out.println("El triángulo con lados " + a + ", " + b + ", " + c + " es escaleno.");
        }
    }
}
