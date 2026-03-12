package set.ejercicios;

import java.util.HashSet;
import java.util.Scanner;

public class EJ13 {
    public void ejecutar(Scanner sc) {
        System.out.print("Introduce la primera palabra: ");
        String palabra1 = sc.nextLine().toLowerCase().replace(" ", "");

        System.out.print("Introduce la segunda palabra: ");
        String palabra2 = sc.nextLine().toLowerCase().replace(" ", "");

        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();

        for (char c : palabra1.toCharArray()) set1.add(c);
        for (char c : palabra2.toCharArray()) set2.add(c);

        if (set1.equals(set2)) {
            System.out.println("\"" + palabra1 + "\" y \"" + palabra2 + "\" SÍ son anagramas.");
        } else {
            System.out.println("\"" + palabra1 + "\" y \"" + palabra2 + "\" NO son anagramas.");
        }
    }
}
