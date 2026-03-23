package ejercicios;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Ejercicio4 {
    public void ejecutar() {
        List<String> nombres = Arrays.asList(
            "Ana","Luis","Ana","Carlos","Luis","Ana","María","Carlos","Luis","Pedro"
        );
        HashMap<String, Integer> mapa = new HashMap<>();
        for (String nombre : nombres) {
            mapa.put(nombre, mapa.getOrDefault(nombre, 0) + 1);
        }

        System.out.println("\nLista: " + nombres);
        System.out.println("--- Frecuencia ---");
        mapa.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
