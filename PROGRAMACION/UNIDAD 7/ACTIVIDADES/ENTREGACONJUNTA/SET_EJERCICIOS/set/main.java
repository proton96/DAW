package set;


import set.ejercicios.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ej1  ej1  = new Ej1();
        EJ2  ej2  = new EJ2();
        EJ3  ej3  = new EJ3();
        EJ4  ej4  = new EJ4();
        EJ5  ej5  = new EJ5();
        EJ6  ej6  = new EJ6();
        EJ7  ej7  = new EJ7();
        EJ8  ej8  = new EJ8();
        EJ9  ej9  = new EJ9();
        EJ10 ej10 = new EJ10();
        EJ11 ej11 = new EJ11();
        EJ12 ej12 = new EJ12();
        EJ13 ej13 = new EJ13();
        EJ14 ej14 = new EJ14();
        EJ15 ej15 = new EJ15();

        boolean salir = false;

        while (!salir) {
            System.out.println("\n╔══════════════════════════════╗");
            System.out.println("║     EJERCICIOS SET - JAVA    ║");
            System.out.println("╠══════════════════════════════╣");
            System.out.println("║  1. HashSet de nombres       ║");
            System.out.println("║  2. TreeSet ordenado         ║");
            System.out.println("║  3. LinkedHashSet usuario    ║");
            System.out.println("║  4. Buscar elemento          ║");
            System.out.println("║  5. Eliminar elemento        ║");
            System.out.println("║  6. Unión de conjuntos       ║");
            System.out.println("║  7. Intersección             ║");
            System.out.println("║  8. Vaciar TreeSet           ║");
            System.out.println("║  9. HashSet a lista ordenada ║");
            System.out.println("║ 10. Contar únicos            ║");
            System.out.println("║ 11. Subconjunto              ║");
            System.out.println("║ 12. LinkedHashSet aleatorios ║");
            System.out.println("║ 13. Anagrama                 ║");
            System.out.println("║ 14. Copiar conjunto          ║");
            System.out.println("║ 15. Elementos exclusivos     ║");
            System.out.println("║  0. Salir                    ║");
            System.out.println("╚══════════════════════════════╝");
            System.out.print("Elige una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1  -> ej1.ejecutar();
                case 2  -> ej2.ejecutar();
                case 3  -> ej3.ejecutar(sc);
                case 4  -> ej4.ejecutar();
                case 5  -> ej5.ejecutar();
                case 6  -> ej6.ejecutar();
                case 7  -> ej7.ejecutar();
                case 8  -> ej8.ejecutar();
                case 9  -> ej9.ejecutar();
                case 10 -> ej10.ejecutar();
                case 11 -> ej11.ejecutar();
                case 12 -> ej12.ejecutar();
                case 13 -> ej13.ejecutar(sc);
                case 14 -> ej14.ejecutar();
                case 15 -> ej15.ejecutar();
                case 0  -> salir = true;
                default -> System.out.println("Opción no válida.");
            }
        }

        sc.close();
        System.out.println("Programa finalizado.");
    }
}
