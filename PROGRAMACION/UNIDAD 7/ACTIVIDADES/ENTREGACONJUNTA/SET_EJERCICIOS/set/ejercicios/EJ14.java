package set.ejercicios;

import java.util.HashSet;

public class EJ14 {
    public void ejecutar() {
        HashSet<String> origen = new HashSet<>();
        origen.add("Madrid");
        origen.add("Barcelona");
        origen.add("Sevilla");
        origen.add("Granada");

        HashSet<String> destino = new HashSet<>(origen);

        System.out.println("Conjunto origen:  " + origen);
        System.out.println("Conjunto destino: " + destino);
        System.out.println("¿Son iguales? " + origen.equals(destino));
    }
}
