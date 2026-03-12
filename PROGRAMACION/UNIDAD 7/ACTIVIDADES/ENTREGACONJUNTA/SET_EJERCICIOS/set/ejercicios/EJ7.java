package set.ejercicios;

import java.util.HashSet;
import java.util.Set;

public class EJ7 {
    public void ejecutar() {
        Set<Integer> setA = new HashSet<>(Set.of(1, 2, 3, 4, 5));
        Set<Integer> setB = new HashSet<>(Set.of(3, 4, 5, 6, 7));

        Set<Integer> interseccion = new HashSet<>(setA);
        interseccion.retainAll(setB);

        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);
        System.out.println("Intersección (elementos comunes): " + interseccion);
    }
}
