package ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio7 {
    public void ejecutar() {
        HashMap<String, Integer> inventario = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n-- Inventario --");
            System.out.println("1. Agregar  2. Actualizar  3. Eliminar  4. Mostrar  0. Volver");
            System.out.print("Opción: ");
            op = sc.nextInt(); sc.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("Producto: "); String p = sc.nextLine();
                    System.out.print("Cantidad: "); int c = sc.nextInt(); sc.nextLine();
                    inventario.put(p, c);
                }
                case 2 -> {
                    System.out.print("Producto: "); String p = sc.nextLine();
                    if (inventario.containsKey(p)) {
                        System.out.print("Nueva cantidad: ");
                        inventario.put(p, sc.nextInt()); sc.nextLine();
                    } else System.out.println("No existe.");
                }
                case 3 -> {
                    System.out.print("Producto: "); String p = sc.nextLine();
                    System.out.println(inventario.remove(p) != null ? "Eliminado." : "No encontrado.");
                }
                case 4 -> {
                    if (inventario.isEmpty()) System.out.println("Inventario vacío.");
                    else inventario.forEach((k, v) -> System.out.println(k + ": " + v + " uds."));
                }
            }
        } while (op != 0);
        sc.close();
    }
}
