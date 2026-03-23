
import ejercicios.*;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ejercicio1  ej1  = new Ejercicio1();
        Ejercicio2  ej2  = new Ejercicio2();
        Ejercicio3  ej3  = new Ejercicio3();
        Ejercicio4  ej4  = new Ejercicio4();
        Ejercicio5  ej5  = new Ejercicio5();
        Ejercicio6  ej6  = new Ejercicio6();
        Ejercicio7  ej7  = new Ejercicio7();
        Ejercicio8  ej8  = new Ejercicio8();
        Ejercicio9  ej9  = new Ejercicio9();
        Ejercicio10 ej10 = new Ejercicio10();

        int opcion;
        do {
            System.out.println("\n===== MENÚ EJERCICIOS MAP =====");
            System.out.println("1.  Países y capitales");
            System.out.println("2.  Frecuencia de palabras");
            System.out.println("3.  Agenda telefónica");
            System.out.println("4.  Lista a Map");
            System.out.println("5.  Traductor español-inglés");
            System.out.println("6.  Notas de estudiantes");
            System.out.println("7.  Inventario de productos");
            System.out.println("8.  Contar caracteres");
            System.out.println("9.  Gestión de empleados");
            System.out.println("10. Sistema de votaciones");
            System.out.println("0.  Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1  -> ej1.ejecutar();
                case 2  -> ej2.ejecutar();
                case 3  -> ej3.ejecutar();
                case 4  -> ej4.ejecutar();
                case 5  -> ej5.ejecutar();
                case 6  -> ej6.ejecutar();
                case 7  -> ej7.ejecutar();
                case 8  -> ej8.ejecutar();
                case 9  -> ej9.ejecutar();
                case 10 -> ej10.ejecutar();
                case 0  -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }
}
