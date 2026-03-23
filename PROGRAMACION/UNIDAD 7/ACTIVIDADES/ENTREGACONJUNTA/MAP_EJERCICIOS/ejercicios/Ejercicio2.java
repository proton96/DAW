package ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio2 {
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine().toLowerCase();
        String[] palabras = frase.split("\\s+");

        HashMap<String, Integer> frecuencia = new HashMap<>();
        for (String p : palabras) {
            frecuencia.put(p, frecuencia.getOrDefault(p, 0) + 1);
        }

        System.out.println("\n--- Frecuencia de palabras ---");
        frecuencia.forEach((k, v) -> System.out.println(k + ": " + v));
        sc.close();
    }

    
}
