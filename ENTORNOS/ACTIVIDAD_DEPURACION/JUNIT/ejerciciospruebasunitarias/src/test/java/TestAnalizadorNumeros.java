import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestAnalizadorNumeros {

    @Test
    public void testcontarMayoresQueUmbral() {
        int[] array = {10, 5, 15, 8, 20};
        int umbral = 10;

        int resultado = AnalizadorNumeros.contarMayoresQueUmbral(array, umbral);
        assertEquals(3, resultado);
    }



    @Test
    public void testcalcularFactorial() {
        int numero = 5;

        int resultado = AnalizadorNumeros.calcularFactorial(numero);
        assertEquals(120, resultado);
    }


    @Test
    public void testcontarParesImpares(){
        int[] array = {2, 5, 8, 7, 10};
        String resultado = AnalizadorNumeros.contarParesImpares(array);
        assertEquals("Pares: 3, Impares: 2", resultado);

    }

    @Test
    public void testcalcularPromedio() {
        int[] array = {10, 20, 30, 40, 50};
        double resultado = AnalizadorNumeros.calcularPromedio(array);
        assertEquals(30.0, resultado);

    }

    @Test
    public void testordenarAscendente(){
        int[] array = {5, 2, 8, 1, 3};
        int[] esperado = {1, 2, 3, 5, 8};
        int[] resultado = AnalizadorNumeros.ordenarAscendente(array);
        assertArrayEquals(esperado, resultado);
      
    }
}
