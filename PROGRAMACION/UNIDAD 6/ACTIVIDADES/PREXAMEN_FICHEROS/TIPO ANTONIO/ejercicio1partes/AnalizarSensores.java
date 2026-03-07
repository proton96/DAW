import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class AnalizarSensores {
     private static boolean validarNumeroCampos(int numerosDesados, int nIntroducidos){
        if (nIntroducidos != numerosDesados){
            System.out.println("Formato incorrecto");
            return false;
        }
        else{
            System.out.println("Línea con formato correcto");
            return true;
        }
    }
    private static double validarTemperatura(String valor){
        try {
            double temperatura = Double.parseDouble(valor);
            return temperatura;
        } catch (NumberFormatException e){
            System.out.println("Incorrecto");
        }
        return -999999999999999999999999.0;
    }
    private static double[] calcularMinimoMaxMedia(double[] valores){
        double min = valores[0], max = valores[0], sumatoria = valores[0];
        for (int i=1; i<valores.length;i++){
            if (min> valores[i]) min = valores[i];
            if (max< valores[i]) max = valores[i];
            sumatoria +=valores[i];
        }
     return new double[]{min, max, sumatoria/valores.length};
    }

    public static void play(String path){
        int contVal = 0;
        int contInval = 0;
        int contFueraderango = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String linea;
            double[] valores =new double [3];


            while ((linea = br.readLine()) != null) {
                String[] campos = linea.trim().split(";");
               if(!validarNumeroCampos(3,campos.length)){
                   new RuntimeException("Error campos");
               }

               double temperatura = validarTemperatura(campos[2]);

               if (temperatura != -999999999999999999999999.0){
                   valores[contVal]= (double) temperatura;
                   contVal++;
                   if ((double)temperatura>0.0 && (double)temperatura<35.0) contFueraderango++;

               } else contInval++;
                System.out.println("Líneas válidas: " +contVal+ "\n líneas inválidas: " +contInval);

            }
            double[] paco = calcularMinimoMaxMedia(valores);
            System.out.println("El mínimo es: " +paco[0] +
                    "\nEl máximo es: " +paco[1] +
                    "\nEl media es: " +paco[2]);
            System.out.println("Fuera de rango: " +contFueraderango);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
