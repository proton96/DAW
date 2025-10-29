//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //HOLA JAVIER
    /* AMOR MIO
     *LOCO
     * amor
     */
    System.out.println("Jose Carlos Martín López\n Calle Socrates n20 1E \n 671221450");
    System.out.println("Hello \t Hola \n Bye \t Adios \n Home \t Casa");
    System.out.println("    *");
    System.out.println("  *   *");
    System.out.println(" *     *");
    System.out.println("*********");

    int a1 = 29;
    int b1 = 4;
    int resultado = a1 * b1;

    System.out.println(resultado);
    char a2 = 'A';
    String a3 = "Hola";
    a1 = 20;
    System.out.println(a1);

// INTRODUCION

    int numero1;
    int numero2;
    double r;
    char operador2;
    Scanner sc = new Scanner(System.in);

// DESARROLLO

    System.out.println("Introduce first numero: ");
    numero1 = sc.nextInt();

    System.out.println("Introduce second numero: ");
    numero2 = sc.nextInt();

    System.out.println("Introduce un operador (+,-,/,*)");
    operador2 = sc.next().charAt(0);


    switch (operador2){
        case '+':
            r = numero1 + numero2;
            break;
        case '-':
            r = numero1 + numero2;
            break;
        case '*':
            r = numero1 + numero2;
            break;
        case '/':
            r = numero1 + numero2;
            break;
        default:
            r= -1;
    }
// DESENLACE

    System.out.println("Resultado " + r);

}
