
import java.util.Scanner;

public class ACT3 {
    public static void main(String[] args) {
        
    Scanner escaner = new Scanner(System.in);
    //Esto son nuestras notas 
    double n1,n2,n3,n4,n5;
    //Vamos a meter el promedio
    double promedio;

    //Pedir que ingrese las notas
    System.out.println("Ingresame la nota 1: ");
    n1 = escaner.nextDouble();
    System.out.println("Ingresame la nota 2: ");
    n2 = escaner.nextDouble();
    System.out.println("Ingresame la nota 3: ");
    n3 = escaner.nextDouble();
    System.out.println("Ingresame la nota 4: ");
    n4 = escaner.nextDouble();
    System.out.println("Ingresame la nota 5: ");
    n5 = escaner.nextDouble();


    


    //Validar cada nota entre 0 y 100
    if (n1 < 0 || n1 > 100) {
        System.out.println("Error nota 1 fuera de rango.");
        return;
        
    }  else if (n2 < 0 || n2 > 100) {
        System.out.println("Error nota 2 fuera de rango.");
        return;
    }  else if (n3 < 0 || n3 > 100) {
        System.out.println("Error nota 3 fuera de rango.");
        return;
    }  else if (n4 < 0 || n4 > 100) {
        System.out.println("Error nota 4 fuera de rango.");
        return;
    }  else if (n5 < 0 || n5 > 100) {
        System.out.println("Error nota 5 fuera de rango.");
        return;
    }

    //Calcular el promedio 
    promedio = (n1+n2+n3+n4+n5) /5;

    //Mostrar promedio 
    System.out.println("\nPromedio: " + promedio);


    // Ahora vamos a asignar las calificaciones 
    if (promedio >= 90 && promedio <= 100) {
    System.out.println("Calificación: A");
        } else if (promedio >= 80) {
        System.out.println("Calificación: B");
        } else if (promedio >= 70) {
        System.out.println("Calificación: C");
        } else if (promedio >= 60) {
        System.out.println("Calificación: D");
        } else {
        System.out.println("Calificación: F");
        }

        escaner.close();



    }
}