import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class GestiónEstudiantes {
    
    // Método 1: Leer CSV y crear ArrayList<Estudiante>
    public static List<Estudiante> leerEstudiantesCSV(String archivo) {
        List<Estudiante> estudiantes = new ArrayList<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 4) {  // Validar 4 campos
                    String nombre = datos[0].trim();
                    int edad = Integer.parseInt(datos[1].trim());
                    String ciudad = datos[2].trim();
                    double calif = Double.parseDouble(datos[3].trim());
                    estudiantes.add(new Estudiante(nombre, edad, ciudad, calif));
                } else {
                    System.out.println("Línea malformada ignorada: " + linea);
                }
            }
        } catch (IOException e) {
            System.out.println("Error leyendo archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error parseando números: " + e.getMessage());
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error cerrando archivo: " + e.getMessage());
            }
        }
        return estudiantes;
    }
    
    // Método 2: Set con ciudades únicas
    public static Set<String> obtenerCiudadesUnicas(List<Estudiante> estudiantes) {
        Set<String> ciudades = new HashSet<>();
        for (Estudiante e : estudiantes) {
            ciudades.add(e.getCiudad());
        }
        return ciudades;
    }
    
    // Método 3: Map<ciudad, List<Estudiante>>
    public static Map<String, List<Estudiante>> agruparPorCiudad(List<Estudiante> estudiantes) {
        Map<String, List<Estudiante>> mapa = new HashMap<>();
        for (Estudiante e : estudiantes) {
            mapa.computeIfAbsent(e.getCiudad(), k -> new ArrayList<>()).add(e);
        }
        return mapa;
    }
    
    // Método 4: Simular Queue (LinkedList como Queue)
    public static void simularAtencion(List<Estudiante> estudiantes) {
        Queue<Estudiante> cola = new LinkedList<>();
        // Llenar cola con orden del ArrayList
        cola.addAll(estudiantes);
        
        System.out.println("\n--- Simulación de atención ---");
        while (!cola.isEmpty()) {
            // Atender y eliminar primero
            Estudiante atendido = cola.poll();
            System.out.println("Atendiendo: " + atendido);
        }
    }
}
