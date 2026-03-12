package ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio5 {
    public void ejecutar() {
        HashMap<String, String> dic = new HashMap<>();
        dic.put("casa","house"); dic.put("perro","dog");
        dic.put("gato","cat");   dic.put("coche","car");
        dic.put("libro","book"); dic.put("agua","water");
        dic.put("ordenador","computer");

        Scanner sc = new Scanner(System.in);
        System.out.print("Palabra en español: ");
        String palabra = sc.nextLine().toLowerCase();

        System.out.println(dic.containsKey(palabra)
            ? "Traducción: " + dic.get(palabra)
            : "Palabra no encontrada.");

        sc.close();
    }
}
