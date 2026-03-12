package set.ejercicios;

import java.util.TreeSet;

public class EJ11 {
    public void ejecutar() {
        TreeSet<Integer> setGrande = new TreeSet<>();
        for (int i = 1; i <= 10; i++) setGrande.add(i);

        TreeSet<Integer> setPequeno = new TreeSet<>();
        setPequeno.add(2);
        setPequeno.add(4);
        setPequeno.add(6);

        boolean esSubconjunto = setGrande.containsAll(setPequeno);

        System.out.println("Set grande: " + setGrande);
        System.out.println("Set pequeño: " + setPequeno);
        System.out.println("¿Es subconjunto? " + esSubconjunto);
    }
}
