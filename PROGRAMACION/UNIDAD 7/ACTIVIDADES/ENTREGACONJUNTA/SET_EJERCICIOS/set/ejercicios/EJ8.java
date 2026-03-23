package set.ejercicios;

import java.util.TreeSet;

public class EJ8 {
    public void ejecutar() {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 1; i <= 5; i++) set.add(i * 10);

        System.out.println("Antes de vaciar: " + set);
        set.clear();
        System.out.println("¿Está vacío? " + set.isEmpty());
    }
}
