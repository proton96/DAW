package CSV;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

/*Vamos unicamente a leer el CSV, ignorar la cabecera , imprimir, 
calcular el total y la media , y contar la tarjeta*/
/*Seguidamente vamos a crear un nuevo archivo de Excel llamado ventas_tarjeta.xlsx que incluya
únicamente las ventas cuyo método de pago sea Tarjeta.
 */

public class metodos {

    // Clase interna Ventas.
    public static class Venta {
        String factura;
        String cliente;
        double importe;
        String metodoPago;

        public Venta(String factura, String cliente, double importe, String metodoPago) {
            this.factura = factura;
            this.cliente = cliente;
            this.importe = importe;
            this.metodoPago = metodoPago;

        }
    }

    public static void procesarVentas(String ruta) {

        // Asumimos que esta en la raiz del proyecto.

        // Vamos a generar los acumuladores y contadores
        double sumaImportes = 0.0;
        int contadorVentas = 0;
        int contadorTarjeta = 0;

        // Lista para guardar ventas con tarjeta
        List<Venta> ventasTarjeta = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

            String linea;
            // Esto lo usamos para saltar la cabecera.
            boolean esPrimeraLinea = true;

            // 1. Leer linea a linea
            while ((linea = br.readLine()) != null) {

                // 2.Saltar la cabecera
                if (esPrimeraLinea) {
                    esPrimeraLinea = false;
                    // esto hace que pase a la siguiente interaccion del while
                    continue;
                }

                // 3. Split por la coma
                String[] campos = linea.split(",");

                if (campos.length < 4) {
                    // Aqui la linea mal formada la ignoramos
                    continue;
                }

                String factura = campos[0].trim();
                String cliente = campos[1].trim();
                String importeStr = campos[2].trim();
                String metodoPago = campos[3].trim();

                double importe;

                // 4. parseDouble dentro de try-catch
                try {
                    importe = Double.parseDouble(importeStr);
                    // puede lanzar NumberFormatException
                } catch (NumberFormatException e) {
                    // Linea invalida, no cortamos el programa, solo la saltamos.
                    System.out.println("Linea inválida (importe no numérico): " + linea);
                    continue;
                }

                // 5. Imprimir linea con el formato pedido.
                System.out.println("Factura:    " + factura + ", Cliente:    " + cliente + ", Importe:    " + importe
                        + ", Pago:    " + metodoPago);
                // 6 actualizar acumuladores y contadores.
                sumaImportes += importe;
                contadorVentas++;

                if (metodoPago.equalsIgnoreCase("Tarjeta")) {
                    contadorTarjeta++;
                    ventasTarjeta.add(new Venta(factura, cliente, importe, metodoPago));
                }

            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            return;
        }

        // 7. Calcular e imprimir el total y la media.
        if (contadorVentas > 0) {
            double media = sumaImportes / contadorVentas;
            System.out.println("Importe total: " + sumaImportes);
            System.out.println("Importe medio: " + media);
            System.out.println("Ventas pagadas con Tarjeta: " + contadorTarjeta);

        } else {
            System.out.println(" No se han encontrado ventas validas.");
        }
    }

    // CREAMOS LA LISTA VENTASTARJETA.

}
