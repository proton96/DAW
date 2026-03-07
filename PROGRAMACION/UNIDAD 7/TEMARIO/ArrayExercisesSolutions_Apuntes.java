
public class ArrayExercisesSolutions {

    // 1. Suma de elementos de un array
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // 2. Encontrar el mayor valor en un array
    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // 3. Contar vocales en un array de caracteres
    public static int countVowels(char[] array) {
        int count = 0;
        for (char c : array) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    // 4. Concatenar cadenas en un array
    public static String concatenateStrings(String[] array) {
        StringBuilder result = new StringBuilder();
        for (String str : array) {
            result.append(str);
        }
        return result.toString();
    }

    // 5. Invertir un array de enteros
    public static int[] reverseArray(int[] array) {
        int n = array.length;
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = array[n - 1 - i];
        }
        return reversed;
    }

    // 6. Sumar matrices 2x2
    public static int[][] sumMatrices(int[][] mat1, int[][] mat2) {
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return result;
    }

    // 7. Calcular el promedio de un array de enteros
    public static double calculateAverage(int[] array) {
        int sum = sumArray(array);
        return (double) sum / array.length;
    }

    // 8. Contar ocurrencias de un carácter en un array de caracteres
    public static int countCharOccurrences(char[] array, char target) {
        int count = 0;
        for (char c : array) {
            if (c == target) {
                count++;
            }
        }
        return count;
    }

    // 9. Verificar si un array de enteros está ordenado
    public static boolean isArraySorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // 10. Transponer una matriz 2x2
    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] transposed = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                transposed[i][j] = matrix[j][i];
            }
        }
        return transposed;
    }

    public static void main(String[] args) {
        // Ejemplo de uso de las soluciones
        int[] nums = {3, 1, 4, 1, 5};
        char[] chars = {'a', 'b', 'c', 'a', 'e'};
        String[] strings = {"Hola", " ", "mundo"};

        System.out.println("Suma de elementos: " + sumArray(nums));
        System.out.println("Mayor valor: " + findMax(nums));
        System.out.println("Número de vocales: " + countVowels(chars));
        System.out.println("Cadenas concatenadas: " + concatenateStrings(strings));
        System.out.println("Array invertido: " + java.util.Arrays.toString(reverseArray(nums)));

        int[][] mat1 = {{1, 2}, {3, 4}};
        int[][] mat2 = {{5, 6}, {7, 8}};
        System.out.println("Suma de matrices: " + java.util.Arrays.deepToString(sumMatrices(mat1, mat2)));
        System.out.println("Promedio: " + calculateAverage(nums));
        System.out.println("Ocurrencias de 'a': " + countCharOccurrences(chars, 'a'));
        System.out.println("Array ordenado: " + isArraySorted(nums));
        System.out.println("Matriz transpuesta: " + java.util.Arrays.deepToString(transposeMatrix(mat1)));
    }
}
