package set.ejercicios;

import java.util.HashSet;

public class Ej1 {
    public void ejecutar() {
        HashSet<String> nombres = new HashSet<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Marta");
        nombres.add("Carlos");
        nombres.add("Sofía");

        System.out.println("Nombres en el HashSet:");
        for (String nombre : nombres) {
            System.out.println(" - " + nombre);
        }
    }
}
