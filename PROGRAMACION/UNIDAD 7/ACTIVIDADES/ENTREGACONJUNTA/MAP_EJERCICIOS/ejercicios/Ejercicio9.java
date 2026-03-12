package ejercicios;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio9 {
    public void ejecutar() {
        TreeMap<Integer, String> empleados = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n-- Empleados (TreeMap) --");
            System.out.println("1. Agregar  2. Buscar por ID  3. Listar  0. Volver");
            System.out.print("Opción: ");
            op = sc.nextInt(); sc.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("ID: ");      int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Nombre: ");  String n = sc.nextLine();
                    System.out.print("Salario: "); double s = sc.nextDouble(); sc.nextLine();
                    empleados.put(id, n + " | " + s + "€");
                }
                case 2 -> {
                    System.out.print("ID: "); int id = sc.nextInt(); sc.nextLine();
                    System.out.println(empleados.containsKey(id)
                        ? "ID " + id + ": " + empleados.get(id) : "No encontrado.");
                }
                case 3 -> {
                    if (empleados.isEmpty()) System.out.println("Sin empleados.");
                    else empleados.forEach((k, v) -> System.out.println("ID " + k + ": " + v));
                }
            }
        } while (op != 0);
        sc.close();
    }
}
