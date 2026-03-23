package set.ejercicios;

import java.util.HashSet;

public class EJ4 {
    public void ejecutar() {
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Kotlin");

        String buscar = "Python";
        if (set.contains(buscar)) {
            System.out.println("\"" + buscar + "\" SÍ está en el conjunto.");
        } else {
            System.out.println("\"" + buscar + "\" NO está en el conjunto.");
        }
    }
}
