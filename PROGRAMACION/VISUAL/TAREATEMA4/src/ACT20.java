public class ACT20 {
    public static void main(String[] args) {
        System.out.println("Múltiplos de 5 entre 1 y 100:");
        
        for (int i = 1; i <= 100; i++) {
            // Verifica si i es múltiplo de 5 (resto 0 al dividir por 5)
            if (i % 5 == 0) {  
                System.out.println(i);
            }
        }
        
        System.out.println("Fin de la lista.");
    }
}
