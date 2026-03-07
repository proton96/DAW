public class Metodos {

    // EJERCIO1 (LISTA DE ENTEROS)
    public static void enteros(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //EJERCICIO2 (calcular la suma de los elementos de una array)

    public static int sumaNumeros (int[] arr){
        int suma = 0;
        for (int i = 0; i < arr.length; i++) {
            suma += arr[i];
        }
            return suma;
    }


    //EJERCICIO3 (encontrar el numero mayor)

    public static int numMaximo (int[] arr) {
        int maximo =  arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maximo) {
                maximo = arr[i];
            }
        }
        return maximo;
    }

    //EJERCICIO4 ( contar numero de vocales)

    public static int contarVocales (char [] arr){
        int vocales = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                vocales++;
            }
        }
        return vocales;
    }


    //EJERCICIO5 (Concatenar todos los elementos en una sola cadena)

    public static String concatenarArray (String[] arr){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(" ");
        }
        return sb.toString();
    }

    //EJERCICIO6 (Invertir orden array enteros)

    public static void invertirArray (int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int j = arr.length -1 -i;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    //EJERCICIO7 (Calcular promedio reciclando el metodo suma )

    public static double calcularPromedio(int[] arr){
        int suma = sumaNumeros(arr);
        return (double) suma / arr.length;
    }


    //EJERCICIO8 (contar numero de veces caracter especifico)

    public static int numeroVocal(char[] arr, char buscado) {
        int contador = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == buscado) {
                    contador++;
                }
            }
                return contador;   
            }



    //EJERCICIO9 (verificar si esta en ascendente)

    public static boolean ascendArray (int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }


    //EJERCICIO10 (sumar dos matrices 2x2 y imprimir resultado)

    public static int[][] sumaMatriz(int[][] a, int[][] b){
        int[][] resultado = new int [2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultado[i][j] = a[i][j] + b[i][j];
            }
        }
        return resultado;


    }

    public static void imprimirMatriz(int[][] matriz){
        //Filas
        for (int i = 0; i < matriz.length; i++) {   
            //Columnas
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }
    

    }


    //EJERCICIO11 (Transponer una matriz)

    public static int[][] transponerMatriz (int[][] matriz){
        int[][] resultado = new int[2][2];
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado.length; j++) {
                resultado[i][j] = matriz[j][i];
            }
        }
        return resultado;
    }




    //EJERCICIO12(separar los partes e impares)

    public static int[][] separarParesImpares (int[] original) {

        //PRIMERO CONTAMOS
        int contadorPares = 0;
        int contadorImpares = 0;
        for (int num : original) {
            if (num % 2 == 0) {
                contadorPares++;
            }else {
                contadorImpares++;
            }
            
        }

        //CREAMOS LOS ARRAYS
        int[] pares = new int[contadorPares];
        int[] impares = new int[contadorImpares];

        //LLENAR ARRAYS

        int indicePares = 0;
        int indiceImpares = 0;
        for (int num : original) {
            if (num % 2 == 0) {
                pares[indicePares++] = num;
            } else {
                impares[indiceImpares++] = num;
            }
        }

        return new int[][] {pares , impares};

    }


    //EJERCICIO13 ( Orden ascendente con algoritmo burbuja)

    public static void burbujaMetodo(int[] arr){
        //PASADAS n-1 veces máximo
        for (int pasada = 0; pasada < arr.length -1; pasada++) {
            for (int i = 0; i < arr.length - pasada -1; i++) {
                 //DESORDENADOS?? intercambiar
                if (arr[i] > arr[i+1] ) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
           
        }
    }

    


    //EJERCICIO14 (Crear array bidimensional y mostrar diagonal principal.)

    public static void bidimensionalArray (){
        
    }





    }



