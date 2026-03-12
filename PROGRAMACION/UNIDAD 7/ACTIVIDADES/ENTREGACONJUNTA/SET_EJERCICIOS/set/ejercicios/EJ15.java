package set.ejercicios;

import java.util.HashSet;
import java.util.Set;

public class EJ15 {
    public void ejecutar() {
        Set<String> setA = new HashSet<>(Set.of("Java", "Python", "C++", "Kotlin"));
        Set<String> setB = new HashSet<>(Set.of("Python", "Kotlin", "Rust", "Go"));

        // Exclusivos de A
        Set<String> soloEnA = new HashSet<>(setA);
        soloEnA.removeAll(setB);

        // Exclusivos de B
        Set<String> soloEnB = new HashSet<>(setB);
        soloEnB.removeAll(setA);

        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);
        System.out.println("Solo en A: " + soloEnA);
        System.out.println("Solo en B: " + soloEnB);
    }
}
