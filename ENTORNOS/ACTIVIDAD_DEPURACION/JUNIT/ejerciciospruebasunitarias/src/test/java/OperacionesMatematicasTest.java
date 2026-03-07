import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OperacionesMatematicasTest {
    @Test
    public void testEsPrimo() {
         int num = 7;
         boolean resultado = OperacionesMatematicas.esPrimo(num);
         assertEquals(true, resultado);
    }
}
