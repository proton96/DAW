package set.ejercicios;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class EJ3 {
    public void ejecutar(Scanner sc) {
        LinkedHashSet<String> palabras = new LinkedHashSet<>();
        System.out.println("Introduce palabras (escribe 'fin' para terminar):");

        while (true) {
            String entrada = sc.nextLine();
            if (entrada.equalsIgnoreCase("fin")) break;
            palabras.add(entrada);
        }

        System.out.println("Palabras en orden de inserción:");
        for (String p : palabras) {
            System.out.println(" - " + p);
        }
    }
}
