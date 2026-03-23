package set.ejercicios;

import java.util.HashSet;

public class EJ5 {
    public void ejecutar() {
        HashSet<String> set = new HashSet<>();
        set.add("Manzana");
        set.add("Naranja");
        set.add("Plátano");
        set.add("Uva");

        String eliminar = "Naranja";
        set.remove(eliminar);

        System.out.println("Conjunto tras eliminar \"" + eliminar + "\":");
        for (String s : set) {
            System.out.println(" - " + s);
        }
    }
}
