import java.util.Scanner;

public class ACT10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       // Declarar variables para cada materia
        double calif1, calif2, calif3, calif4, calif5, calif6;
        double peso1, peso2, peso3, peso4, peso5, peso6;
        double sumaPesos;
        double promedioPonderado;
        
        System.out.println("=== Sistema de Gestión de Calificaciones ===");
        System.out.println("Ingresa las calificaciones y pesos de 6 materias\n");
        
        // Solicitar calificación y peso de la materia 1
        System.out.print("Ingresa la calificación de la materia 1 (0-100): ");
        calif1 = sc.nextDouble();
        System.out.print("Ingresa el peso porcentual de la materia 1 (ej: 15 para 15%): ");
        peso1 = sc.nextDouble();
        System.out.println();
        
        // Materia 2
        System.out.print("Ingresa la calificación de la materia 2 (0-100): ");
        calif2 = sc.nextDouble();
        System.out.print("Ingresa el peso porcentual de la materia 2: ");
        peso2 = sc.nextDouble();
        System.out.println();
        
        // Materia 3
        System.out.print("Ingresa la calificación de la materia 3 (0-100): ");
        calif3 = sc.nextDouble();
        System.out.print("Ingresa el peso porcentual de la materia 3: ");
        peso3 = sc.nextDouble();
        System.out.println();
        
        // Materia 4
        System.out.print("Ingresa la calificación de la materia 4 (0-100): ");
        calif4 = sc.nextDouble();
        System.out.print("Ingresa el peso porcentual de la materia 4: ");
        peso4 = sc.nextDouble();
        System.out.println();
        
        // Materia 5
        System.out.print("Ingresa la calificación de la materia 5 (0-100): ");
        calif5 = sc.nextDouble();
        System.out.print("Ingresa el peso porcentual de la materia 5: ");
        peso5 = sc.nextDouble();
        System.out.println();
        
        // Materia 6
        System.out.print("Ingresa la calificación de la materia 6 (0-100): ");
        calif6 = sc.nextDouble();
        System.out.print("Ingresa el peso porcentual de la materia 6: ");
        peso6 = sc.nextDouble();
        System.out.println();
        
        sc.close();
        
        // Calcular suma de pesos
        sumaPesos = peso1 + peso2 + peso3 + peso4 + peso5 + peso6;
        
        // Validar que la suma de pesos sea 100%
        if (Math.abs(sumaPesos - 100) > 0.01) {
            System.out.printf("Error: La suma de los pesos es %.2f%%. Debe ser exactamente 100%%.%n", sumaPesos);
            return;
        }
        
        // Calcular promedio ponderado
        promedioPonderado =(calif1 * peso1 / 100) + 
                           (calif2 * peso2 / 100) + 
                           (calif3 * peso3 / 100) + 
                           (calif4 * peso4 / 100) + 
                           (calif5 * peso5 / 100) + 
                           (calif6 * peso6 / 100);
        
        // Mostrar resumen
        System.out.println("=== Resumen de Materias ===");
        System.out.printf("Materia 1: Calificación %.2f, Peso %.2f%%%n", calif1, peso1);
        System.out.printf("Materia 2: Calificación %.2f, Peso %.2f%%%n", calif2, peso2);
        System.out.printf("Materia 3: Calificación %.2f, Peso %.2f%%%n", calif3, peso3);
        System.out.printf("Materia 4: Calificación %.2f, Peso %.2f%%%n", calif4, peso4);
        System.out.printf("Materia 5: Calificación %.2f, Peso %.2f%%%n", calif5, peso5);
        System.out.printf("Materia 6: Calificación %.2f, Peso %.2f%%%n", calif6, peso6);
        System.out.printf("\nSuma de pesos: %.2f%%%n", sumaPesos);
        
        // Determinar aprobación o reprobación
        System.out.println("\n=== Resultado Final ===");
        if (promedioPonderado < 60) {
            System.out.printf("Promedio ponderado: %.2f%%. Has reprobado.%n", promedioPonderado);
        } else {
            System.out.printf("Promedio ponderado: %.2f%%. ¡Has aprobado!%n", promedioPonderado);

        }
    }
}
