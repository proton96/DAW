package TXT;
import java.io.*;

public class metodos {

  /*Escribe un programa en Java que lea un archivo de texto llamado `numeros.txt`, el cual
contiene una serie de valores (uno por línea). El programa debe:

1. Leer cada línea del archivo.

2. Determinar si la línea contiene un número entero.

3. Sumar los números válidos encontrados.

4. Calcular la media de los números válidos.

5. Mostrar los siguientes resultados:

 - La suma de los números.
 - La media de los números.
 - Un mensaje indicando si alguna línea no es un número válido.
 */

 public void procesar(String ruta) {
    int suma = 0;
    int contador = 0;
    boolean hayError = false;

    try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            try {
                int numero = Integer.parseInt(linea);
                suma += numero;
                contador++;
            } catch (NumberFormatException e) {
                hayError = true;
            }
        }
    } catch (IOException e) {
        System.out.println("Error al leer el archivo: " + e.getMessage());
        return;
    }

    double media = contador > 0 ? (double) suma / contador : 0;

    System.out.println("Suma de los números: " + suma);
    System.out.println("Media de los números: " + media);
    if (hayError) {
        System.out.println("Algunas líneas no son números válidos.");
    }

}
}
