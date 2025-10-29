import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


    // NOS PIDE EL AREA Y PERIMETRO DE UNA CIRCUNFERENCIA
    // AREA = PI * RADIO AL CUADRADO
    // PERIMETRO= 2 * PI * R


    // INTRODUCIÓN

    double radio;
    double pi = 3.14;
    double resultado;
    char operacion = 0;
    Scanner sc = new Scanner(System.in);

    //DESARROLLO
    System.out.println("Introduce el radio: ");
    radio = sc.nextInt();

    System.out.println("SI CALCULAS AREA PULSA +, SI CALCULAS PERIMETRO PULSA -: ");
    resultado = sc.next().charAt(0);

    switch (operacion) {
        case '+':
            resultado = pi * Math.pow(radio, 2);
            break;
        case '-':
            resultado = 2 * pi * radio;
            break;

    }
// DESENLACE

    System.out.println("Resultado: " + resultado);

}
