import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class testExamen {
    @Test
    void testCalcularFactorial() {
         int numero = 1;
        int resultado =Examen.calcularFactorial(numero);
        assertEquals(1, resultado);
    }

    @Test
    void testContarCambios() {
        int[] array = {-1 , 2 , 3};
        int resultado = Examen.contarCambios(array);
        assertEquals(1, resultado);
    }

    @Test
    void testInventirArray() {
        int[] array  = {2 , 3 , 4 , 5};
        int[] esperado = {5 , 4 , 3 , 2};
        int[] resultado = Examen.inventirArray(array);
        assertArrayEquals(esperado, resultado);
    }

    @Test
    void testPosicionPrimerNegativo() {
        int[] array = {-2 , 3, -4 };
        int resultado = Examen.posicionPrimerNegativo(array);
        assertEquals(-4, resultado);
    }
}

        
