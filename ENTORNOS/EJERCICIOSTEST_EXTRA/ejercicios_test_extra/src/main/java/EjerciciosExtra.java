public class EjerciciosExtra {
    public static int cuadrado(int n) {
        return n * n;
    }

    public static int sumaArray(int[] array) {
        int suma = 0;
        for (int n : array) {
            suma += n;
        }
        return suma;
    }

    public static int mayor(int a, int b) {
        if(a>b){
            return a;
        } else{
            return b;
        }
    }

    public static int contarPares(int[] array) {
        int contador = 0;
        for (int n : array) {
            if (n % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

    public static int longitudCadena(String texto) {
        return texto.length();
    }

    public static boolean esPositivo(int n) {
        return n > 0;
    }

    public static int ultimoElemento(int[] array) {
        return array[array.length - 1];
    }

    // assertArrayEquals
    public static int[] duplicarArray(int[] array) {
        int[] resultado = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            resultado[i] = array[i] * 2;
        }
        return resultado;
    }

    // assertThrows
    public static int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero");
        }
        return a / b;
    }

    // assertThrows
    public static int obtenerElemento(int[] array, int indice) {
        if (array == null) {
            throw new IllegalArgumentException("El array no puede ser null");
        }

        if (indice < 0 || indice >= array.length) {
            throw new IllegalArgumentException("Índice fuera de rango");
        }

        return array[indice];
    }
}
