import java.util.List;
import java.util.Set;
import java.util.Map;

public class Principal {
    public static void main(String[] args) {
        String archivo = "estudiantes.csv";
        
        // 1. Leer y mostrar lista completa
        List<Estudiante> estudiantes = GestiónEstudiantes.leerEstudiantesCSV(archivo);
        System.out.println("--- Lista completa de estudiantes ---");
        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }
        
        // 2. Ciudades únicas (Set)
        Set<String> ciudades = GestiónEstudiantes.obtenerCiudadesUnicas(estudiantes);
        System.out.println("\n--- Ciudades únicas ---");
        for (String c : ciudades) {
            System.out.println(c);
        }
        
        // 3. Agrupados por ciudad (Map)
        Map<String, List<Estudiante>> porCiudad = GestiónEstudiantes.agruparPorCiudad(estudiantes);
        System.out.println("\n--- Estudiantes por ciudad ---");
        for (Map.Entry<String, List<Estudiante>> entry : porCiudad.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // 4. Atención en cola (Queue)
        GestiónEstudiantes.simularAtencion(estudiantes);
    }
}
