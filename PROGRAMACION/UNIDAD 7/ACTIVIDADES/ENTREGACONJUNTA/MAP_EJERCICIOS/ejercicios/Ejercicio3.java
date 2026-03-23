package ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio3 {
    public void ejecutar() {
        HashMap<String, String> agenda = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n-- Agenda --");
            System.out.println("1. Agregar  2. Buscar  3. Mostrar  0. Volver");
            System.out.print("Opción: ");
            op = sc.nextInt(); sc.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("Nombre: ");   String n = sc.nextLine();
                    System.out.print("Teléfono: "); String t = sc.nextLine();
                    agenda.put(n, t);
                    System.out.println("Contacto añadido.");
                }
                case 2 -> {
                    System.out.print("Nombre: ");
                    String n = sc.nextLine();
                    System.out.println(agenda.containsKey(n)
                        ? n + ": " + agenda.get(n) : "No encontrado.");
                }
                case 3 -> {
                    if (agenda.isEmpty()) System.out.println("Agenda vacía.");
                    else agenda.forEach((k, v) -> System.out.println(k + ": " + v));
                }
            }
        } while (op != 0);
        sc.close();
    }
}
