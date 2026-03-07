import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOperacionesEstadisticas {
    
    @Test
    public void sumaCuadradosPositivos() {
        int[] array = { 2, -4, 6, -8, 10 };
        int resultado = OperacionesEstadisticas.sumaCuadradosPositivos(array);
        assertEquals(140,resultado);
    }

    @Test
    public void productoNegativos() {
        int[] array = {-1, 3, -5, 7, -9};
        int resultado = OperacionesEstadisticas.productoNegativos(array);
        assertEquals(-45, resultado);

    }

}
