public class main {
    public static void main(String[] args) {
        //COSITAS NECESARIAS PARA EL PRINTEO
        int[] numeros = {10, 20, 30, 40, 50};
        String[] palabras = {"Hola", "Esquirol", "mi", "amor"}; 
        char[] letras = {'E', 's', 'q', 'u', 'i', 'r', 'o', 'l', 'i'};
        int maximo = Metodos.numMaximo(numeros);
        int total = Metodos.sumaNumeros(numeros);
        int contar = Metodos.contarVocales(letras);
        String concatenar = Metodos.concatenarArray(palabras);
        double promedio = Metodos.calcularPromedio(numeros);
        char buscar = 'i';
        int veces = Metodos.numeroVocal(letras, buscar);
        int[] ordenado = {1 , 2 , 3 , 4 , 5};
        int[] desorden = {1, 3 , 5 , 2 , 4};
        int [][] matrizA = {{1, 2},  {3, 4}};
        int [][] matrizB = {{5, 6},  {7, 8}};
        int [][] suma = Metodos.sumaMatriz(matrizA, matrizB);
        int[][] original = {{1, 2}, {3, 4}};
        int[][] traspuesta = Metodos.transponerMatriz(original) ;
        int[][] resultado2 = Metodos.separarParesImpares(numeros);
        int[] prueba = {5, 2, 8, 1};
        Metodos.burbujaMetodo(prueba);








        //PRINTEADAS:
        System.out.println("La suma total es: "+ total);
        System.out.println("El numero mayor es: " + maximo);
        System.out.println( "El numero de vocales es: " + contar);
        System.out.println("Concatenado: '" + concatenar + "'");
        System.out.println("Aqui tienes el invertido: ");
        Metodos.invertirArray(numeros);
        Metodos.enteros(numeros);
        System.out.println("Promedio: " + promedio);
        System.out.println("La letra: "+buscar + " se repite "+ veces + " veces.");
        System.out.println("Ordenado: " + Metodos.ascendArray(ordenado));
        System.out.println("Desordenado: " + Metodos.ascendArray(desorden));
        System.out.print("Matriz A:");
        Metodos.imprimirMatriz(matrizA);
        System.out.print("Matriz B: ");
        Metodos.imprimirMatriz(matrizB);
        System.out.print("Suma: ");
        Metodos.imprimirMatriz(suma);
        System.out.println("Original: ");
        Metodos.imprimirMatriz(original);
        System.out.println("Traspuesta:");
        Metodos.imprimirMatriz(traspuesta);
        System.out.println("Pares:");
        Metodos.enteros(resultado2[0]);
        System.out.println("Impares: ");
        Metodos.enteros(resultado2[1]);
        System.out.println("BURBUJA: ");
        Metodos.burbujaMetodo(prueba);
        Metodos.enteros(prueba);
    }
}
