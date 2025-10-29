import java.util.Scanner;

public class ACT6 {
    
    public static void main(String[] args) {
        
        //Introducir datos
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tus ingresos anuales: ");
        double ingresos = sc.nextDouble();
        
        System.out.print("Ingresa el número de dependientes: ");
        int dependientes = sc.nextInt();
        
        sc.close();

       // Validar entradas
        if (ingresos < 0) {
            System.out.println("Ingresos inválidos.");
            return;
        }
        if (dependientes < 0) {
            System.out.println("Número de dependientes inválido.");
            return;
        }
        // Calcular impuesto base
        double impuesto = 0;
        if (ingresos < 20000) {
            impuesto = ingresos * 0.05;
        } else if (ingresos < 40000) {
            impuesto = ingresos * 0.10;
        } else if (ingresos < 80000) {
            impuesto = ingresos * 0.20;
        } else {
            impuesto = ingresos * 0.30;
        }
        
        // Aplicar reducción por dependientes
        if (dependientes > 3) {
            impuesto *= 0.95;
        } 
        // Mostrar resultado
        System.out.printf("Tu impuesto anual es: %.2f%n", impuesto);
    }
}
