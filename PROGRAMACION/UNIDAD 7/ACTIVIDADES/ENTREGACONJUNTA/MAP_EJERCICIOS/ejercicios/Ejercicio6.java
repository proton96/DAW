package ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio6 {
    public void ejecutar() {
        HashMap<String, ArrayList<Integer>> estudiantes = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos estudiantes? ");
        int n = sc.nextInt(); sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("¿Cuántas notas? ");
            int num = sc.nextInt(); sc.nextLine();

            ArrayList<Integer> notas = new ArrayList<>();
            for (int j = 0; j < num; j++) {
                System.out.print("  Nota " + (j+1) + ": ");
                notas.add(sc.nextInt()); sc.nextLine();
            }
            estudiantes.put(nombre, notas);
        }

        System.out.println("\n--- Promedios ---");
        for (Map.Entry<String, ArrayList<Integer>> e : estudiantes.entrySet()) {
            double avg = e.getValue().stream()
                .mapToInt(Integer::intValue).average().orElse(0);
            System.out.printf("%s → %.2f%n", e.getKey(), avg);
        }
        sc.close();
    }
}
