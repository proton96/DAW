package TXT;

import java.io.*;

public class metodos {

    public  static void Leer(String ruta) {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))){
            String linea;
            
            while ((linea = br.readLine()) != null) {
            System.out.println(linea);    
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void play(String ruta) {
       try {
        String datos [] = String Leer(ruta);

       } catch (Exception e) {
        // TODO: handle exception
       }
    }
}