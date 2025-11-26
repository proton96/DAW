

import java.util.Random;

public class ACT13 {
    public static void main(String[] args) {
        Random random = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String contrasena = "";
        
        for (int i = 0; i < 8; i++) {
            int indice = random.nextInt(caracteres.length());
            contrasena += caracteres.charAt(indice);
        }
        
        System.out.println("Contraseña aleatoria generada: " + contrasena);
    }
}

