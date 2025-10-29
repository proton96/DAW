import java.util.Scanner;

public class ACT4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el dia: ");
        int dia = sc.nextInt();

        System.out.println("Ingresa el mes (1-12): ");
        int mes = sc.nextInt();

        System.out.println("Ingresa el año: ");
        int año = sc.nextInt();

        sc.close();

        //Vamos a validar el mes.

        if (mes < 1 || mes > 12) {
            System.out.println("Fecha invalida: El mes debe estar entre 1 y 12.");
        }

        //Validar año (rango basico, se ajusta si es necesario)
           if (año < 1 || año > 9999) {
            System.out.println("Fecha invalida: El año debe estar entre 1 y 9999.");
           }

           //Vamos a determinar los dias maximos del mes con switch
           int diasMaximos;
           switch (mes) {
            case 4: case 6: case 9: case 11:
                diasMaximos = 30;
                break;
            case 2:
                //Logica del año bisiesto
                if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)){
                    diasMaximos = 29;
                }   else {
                    diasMaximos = 28;
                }
                break;
                //Meses 1,3,5,7,8,10,12
            default:
                diasMaximos = 31;
                break;
           }

           // Validar dia 
           if (dia <1  || dia > diasMaximos){
                System.out.println("Fecha invalida: El dia debe estar entre 1 y " + diasMaximos + "para este mes.");

           } else {
            System.out.println("La fecha "+ dia + "/" + mes + "/" + año + " es valida.");
           }

    }
}
