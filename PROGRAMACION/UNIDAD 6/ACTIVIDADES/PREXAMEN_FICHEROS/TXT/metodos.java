package TXT;

import java.io.*;

public class metodos {

    // ACT1 y ACT2

    public static void act1(String nombreArchivo) {
        try {
            // Se utiliza FileReader y BufferedReader para la lectura
            FileReader fr = new FileReader(nombreArchivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            // Se lee línea por línea hasta el final del archivo [3]
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            br.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    // ACT2

    public static void act2(String nombreArchivo) {
        System.out.println("Vamos a ver si tiene tres campos: ");
        try {
            FileReader fr = new FileReader(nombreArchivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;

            while ((linea = br.readLine()) != null) {
                // Ahora llamamos al auxiliar
                if (tieneTresCampos(linea)) {
                    System.out.println("OK");
                } else {
                    System.out.println("[X]     " + linea + " (Faltan o sobran campos)");
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Error de validando: " + e.getMessage());
        }
    }

    // Este es mi auxiliar de este ejercicio.
    public static boolean tieneTresCampos(String linea) {
        if (linea == null || linea.trim().isEmpty()) {
            return false;
        }
        String[] campos = linea.split(";");
        return campos.length == 3;

    }

    // ACT3
    public static void act3(String nombreArchivo) {
        try {
            FileReader fr = new FileReader(nombreArchivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            // Se lee línea por línea hasta el final del archivo [3]
            while ((linea = br.readLine()) != null) {

                if (temperaturaValida(linea)) {
                    System.out.println("OK -> " + linea);
                } else {
                    System.out.println("ERROR TEMPERATURA -> " + linea);
                }
            }
            br.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    // este es nuestro metodo auxiliar necesario para realizar la actividad
    public static boolean isValid(int n_linea, int tamanio){
        if(tamanio != n_linea){
            return false;
        }
        return true;
    }
    public static boolean temperaturaValida(String temperatura){
        try {
            double temperaturaFinal = Double.parseDouble(temperatura);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }




            //ACT4
            public static void act4(String nombreArchivo) {
        try {
            FileReader fr = new FileReader(nombreArchivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            int cont1 = 0;
            int cont2 = 0;
            // Se lee línea por línea hasta el final del archivo [3]
            while ((linea = br.readLine()) != null) {

                if (temperaturaValida(linea)) {
                    System.out.println("OK -> " + linea);
                    cont1++;
                } else {
                    System.out.println("ERROR TEMPERATURA -> " + linea);
                    cont2++;
                }
            }
            br.close();
            System.out.println("LINEAS VALIDAS: " + cont1);
            System.out.println("LINEAS INVALIDAS: " + cont2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

        //ACT5
        //•Calcular y mostrar: mínima, máxima y media de las temperaturas válidas.

         public static void act5(String nombreArchivo) {
        try {
            FileReader fr = new FileReader(nombreArchivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            int cont1 = 0;
            int cont2 = 0;
            double min = 9999;
            double max = 0;
            double media = 0;
            double num = 0; 
            double sumanum = 0;
            
            while ((linea = br.readLine()) != null) {

                if (temperaturaValida(linea)) {
                    cont1++;
                     String array[] = linea.split(";");
                num = Double .parseDouble(array[2]);
                sumanum += num;
                if (num<min) {
                    min = num; 
                } 
                if (num>max) {
                    max = num;
                }
                } else {
                    cont2++;
                }
               
            }
            media = sumanum/cont1;
            System.out.println("LA MEDIA ES: " + media);
            System.out.println("EL VALOR MAXIMO ES: " + max);
            System.out.println("EL VALOR MINIMO ES: " + min);

            br.close();
            System.out.println("LINEAS VALIDAS: " + cont1);
            System.out.println("LINEAS INVALIDAS: " + cont2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

        //ACT6

     public static void act6(String nombreArchivo) {
        try {
            FileReader fr = new FileReader(nombreArchivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            int cont1 = 0;
            int contInRange = 0;
            double num = 0; 
            int contOutRange =0;
            // Se lee línea por línea hasta el final del archivo [3]
            while ((linea = br.readLine()) != null) {
                String array[] = linea.split(";");
                if(!isValid(3, array.length)){
                    System.out.println("Numero invalido");
                    return;
                }

                //VALIDAR QUE LA TEMPERATURA SEA UN NUMERO
                if(!temperaturaValida(array[2])){
                    System.out.println("Error tempetautra"); 
                }else{
                    cont1++;
                }

                
                num = Double .parseDouble(array[2]);
                if(0 <num && num>35){
                    contInRange++;
                } else{
                    contOutRange++;
                }
                  
            }
            br.close();
            System.out.println("LINEAS VALIDAS: " + cont1);
            System.out.println("LINEAS VALIDAD DENTRO DEL RANGO: " + contInRange);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}