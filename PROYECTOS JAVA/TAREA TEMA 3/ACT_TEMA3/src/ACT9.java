import java.util.Scanner;

public class ACT9 {
        //Utilizamos long en vez de int para soportar números más grandes sin desbordamiento, como 20.
     // Método para calcular factorial
    public static long factorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
        }
    public static void main(String[] args) {
       
        // Mostramos menu y pedimos operacion a usuario.

        Scanner sc = new Scanner(System.in);
        System.out.println("=== Calculadora Avanzada ===");
        System.out.println("Operaciones:");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicación");
        System.out.println("4 - División");
        System.out.println("5 - Potencia");
        System.out.println("6 - Raíz cuadrada");
        System.out.println("7 - Factorial");
        System.out.print("Selecciona una operación (1-7): ");
        int operacion = sc.nextInt();


    // Validar operación
        if (operacion < 1 || operacion > 7) {
            System.out.println("Operación inválida. Debe ser entre 1 y 7.");
            sc.close();
            return;
        } 

        double num1 = 0, num2 = 0;

    // Solicitar números según operación
        if (operacion >= 1 && operacion <= 5) {
            System.out.print("Ingresa el primer número: ");
            num1 = sc.nextDouble();
            System.out.print("Ingresa el segundo número: ");
            num2 = sc.nextDouble();
        } else {
            System.out.print("Ingresa el número: ");
            num1 = sc.nextDouble();
        }
        
        sc.close(); 

    double resultado = 0;
        

        //%.2f nos ayuda a redondear y truncar los numeros num1 y num2. Dejandonos un resultado en consola mas exacto.
        //Ejemplo: si num1=2.345 y num2=1.678, el printf redondea a: Resultado: 2.35 + 1.68 = 4.02.

        // Switch para operaciones
        switch (operacion) {
            // Suma
            case 1: 
                resultado = num1 + num2;
                System.out.printf("Resultado: %.2f + %.2f = %.2f%n", num1, num2, resultado);
                break;

            // Resta    
            case 2: 
                resultado = num1 - num2;
                System.out.printf("Resultado: %.2f - %.2f = %.2f%n", num1, num2, resultado);
                break;

            // Multiplicación    
            case 3: 
                resultado = num1 * num2;
                System.out.printf("Resultado: %.2f * %.2f = %.2f%n", num1, num2, resultado);
                break;

            // División   
            case 4: 
                if (num2 == 0) {
                    System.out.println("Error: División por cero no permitida.");
                    return;
                }
                resultado = num1 / num2;
                System.out.printf("Resultado: %.2f / %.2f = %.2f%n", num1, num2, resultado);
                break;

            // Potencia    
            case 5: 
                resultado = Math.pow(num1, num2);
                System.out.printf("Resultado: %.2f ^ %.2f = %.2f%n", num1, num2, resultado);
                break;

            // Raíz cuadrada    
            case 6: 
                if (num1 < 0) {
                    System.out.println("Error: No se puede calcular raíz cuadrada de número negativo.");
                    return;
                }
                resultado = Math.sqrt(num1);
                System.out.printf("Resultado: √%.2f = %.2f%n", num1, resultado);
                break;

            // Factorial   
            case 7: 
                if (num1 < 0 || num1 != (int)num1) {
                    System.out.println("Error: Factorial requiere un entero no negativo.");
                    return;
                }

                //%d! lo utilizamos en el int y el long para mostrar el factorial sin decimales,si num1 es 5, imprime "Resultado: 5! = 120" seguido de un nuevo renglón.
                //sin decimales innecesarios.
                //Para un input de 6 en factorial, el printf genera "Resultado: 6! = 720%n"
                //, donde 720 es 6×5×4×3×2×1, y %n asegura que la siguiente línea (si hay más código) empiece en un nuevo renglón.
                // Si lo comparamos con System.out.println("Resultado: " + num1 + "! = " + factorialResultado); seria lo mismo pero sin formatear.
                long factorialResultado = factorial((int)num1);
                System.out.printf("Resultado: %d! = %d%n", (int)num1, factorialResultado);
                break;   
        }
    }
}
