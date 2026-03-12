package set.ejercicios;

import java.util.HashSet;
import java.util.Set;

public class EJ6 {
    public void ejecutar() {
        Set<Integer> setA = new HashSet<>(Set.of(1, 2, 3, 4, 5));
        Set<Integer> setB = new HashSet<>(Set.of(4, 5, 6, 7, 8));

        Set<Integer> union = new HashSet<>(setA);
        union.addAll(setB);

        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);
        System.out.println("Unión (sin duplicados): " + union);
    }
}
