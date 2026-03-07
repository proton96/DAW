package CSV;
import java.io.*;
import java.util.ArrayList;

public class metodos {
public void escribirEnExcel(String nombre, String localidad, int edad) {
    // Aquí iría la lógica para escribir en un archivo Excel usando una librería como Apache POI
    // Por simplicidad, solo imprimiremos un mensaje indicando que se escribiría en Excel
    System.out.println("Escribiendo en Excel: " + nombre + ", " + localidad + ", " + edad);
}


public void procesar(String ruta) {
        // Implementación del método para procesar el archivo CSV
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
        String linea;
        boolean esPrimeraLinea = true;
        int contadorMenoresIgual30 = 0;

        while ((linea = br.readLine()) != null) {
            if (esPrimeraLinea) {
                esPrimeraLinea = false;
                continue; // Saltar la cabecera
            }

            String[] partes = linea.split(",");
            String nombre = partes[0].trim();
            String localidad = partes[1].trim();
            int edad = Integer.parseInt(partes[2].trim());

            System.out.println("Nombre: " + nombre + ", Localidad: " + localidad + ", Edad: " + edad);

            if (edad <= 30) {
                contadorMenoresIgual30++;
            } else {
                // Lógica para escribir en el archivo Excel
                escribirEnExcel(nombre, localidad, edad);
                

            }
        }

        System.out.println("Número de personas menores o iguales a 30 años: " + contadorMenoresIgual30);
    } catch (IOException e) {
        System.out.println("Error al leer el archivo: " + e.getMessage());
    }
}
}
