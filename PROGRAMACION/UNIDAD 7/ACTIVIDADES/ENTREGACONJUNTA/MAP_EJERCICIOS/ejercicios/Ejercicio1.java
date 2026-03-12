
package ejercicios;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio1 {
    public void ejecutar() {
        HashMap<String, String> mapa = new HashMap<>();
        mapa.put("España",   "Madrid");
        mapa.put("Francia",  "París");
        mapa.put("Alemania", "Berlín");
        mapa.put("Italia",   "Roma");
        mapa.put("Portugal", "Lisboa");
        mapa.put("Japón",    "Tokio");

        System.out.println("\n--- Países y Capitales ---");
        for (Map.Entry<String, String> e : mapa.entrySet()) {
            System.out.println(e.getKey() + " → " + e.getValue());
        }
    }
}
