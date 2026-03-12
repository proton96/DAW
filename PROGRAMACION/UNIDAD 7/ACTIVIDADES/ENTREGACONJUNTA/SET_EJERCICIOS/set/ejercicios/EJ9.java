package set.ejercicios;

import java.util.*;

public class EJ9 {
    public void ejecutar() {
        HashSet<String> set = new HashSet<>();
        set.add("Zebra");
        set.add("Ámbar");
        set.add("Mango");
        set.add("Brisa");
        set.add("Coral");

        List<String> lista = new ArrayList<>(set);
        Collections.sort(lista);

        System.out.println("Lista ordenada alfabéticamente:");
        for (String s : lista) {
            System.out.println(" - " + s);
        }
    }
}
