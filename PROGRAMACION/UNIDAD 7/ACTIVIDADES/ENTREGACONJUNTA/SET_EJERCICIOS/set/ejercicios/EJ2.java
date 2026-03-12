package set.ejercicios;

import java.util.TreeSet;

public class EJ2 {
    public void ejecutar() {
        TreeSet<Integer> numeros = new TreeSet<>();
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }

        System.out.println("Números del 1 al 10 en orden ascendente:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
