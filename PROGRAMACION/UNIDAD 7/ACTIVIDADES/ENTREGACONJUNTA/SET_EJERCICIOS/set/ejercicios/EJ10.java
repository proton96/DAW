package set.ejercicios;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class EJ10 {
    public void ejecutar() {
        List<String> lista = Arrays.asList(
            "Java", "Python", "Java", "C++", "Python", "Kotlin", "C++"
        );

        HashSet<String> unicos = new HashSet<>(lista);

        System.out.println("Lista original: " + lista);
        System.out.println("Elementos únicos: " + unicos.size());
    }
}
