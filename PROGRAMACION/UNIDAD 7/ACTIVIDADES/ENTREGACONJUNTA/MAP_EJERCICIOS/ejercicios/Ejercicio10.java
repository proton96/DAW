package ejercicios;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio10 {
    public void ejecutar() {
        HashMap<String, Integer> votos = new HashMap<>();
        votos.put("Candidato A", 0);
        votos.put("Candidato B", 0);
        votos.put("Candidato C", 0);

        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n-- Votaciones --");
            System.out.println("1. Votar  2. Ver votos  3. Ganador  0. Volver");
            System.out.print("Opción: ");
            op = sc.nextInt(); sc.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("Candidato: "); String c = sc.nextLine();
                    if (votos.containsKey(c)) {
                        votos.put(c, votos.get(c) + 1);
                        System.out.println("Voto registrado.");
                    } else System.out.println("Candidatos: " + votos.keySet());
                }
                case 2 -> votos.forEach((k, v) -> System.out.println(k + ": " + v));
                case 3 -> {
                    String ganador = Collections.max(
                        votos.entrySet(), Map.Entry.comparingByValue()).getKey();
                    System.out.println("Ganador: " + ganador + " (" + votos.get(ganador) + " votos)");
                }
            }
        } while (op != 0);
        sc.close();
    }
}
