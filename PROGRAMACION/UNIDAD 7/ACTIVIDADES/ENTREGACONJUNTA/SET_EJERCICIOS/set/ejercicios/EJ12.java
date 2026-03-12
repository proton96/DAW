package set.ejercicios;

import java.util.LinkedHashSet;
import java.util.Random;

public class EJ12 {
    public void ejecutar() {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        Random random = new Random();

        System.out.println("Generando números aleatorios entre 1 y 20...");
        while (set.size() < 8) {
            int num = random.nextInt(20) + 1;
            boolean añadido = set.add(num);
            if (!añadido) {
                System.out.println(" [Duplicado ignorado: " + num + "]");
            }
        }

        System.out.println("Conjunto sin duplicados: " + set);
    }
}
