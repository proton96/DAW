package ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio8 {
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine().toLowerCase();

        HashMap<Character, Integer> mapa = new HashMap<>();
        for (char c : palabra.toCharArray()) {
            mapa.put(c, mapa.getOrDefault(c, 0) + 1);
        }

        System.out.println("\n--- Caracteres en \"" + palabra + "\" ---");
        mapa.forEach((k, v) -> System.out.println("'" + k + "': " + v));
        sc.close();
    }
}
