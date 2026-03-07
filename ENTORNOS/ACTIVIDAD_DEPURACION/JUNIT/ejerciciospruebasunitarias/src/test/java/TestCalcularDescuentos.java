import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestCalcularDescuentos {
    @Test
    public void testAplicarDescuento() {
        int precioOriginal = 200;
        double porcentajeDescuento = 21;
        double resultado = CalculadoraDescuentos.aplicarDescuento(precioOriginal, porcentajeDescuento);
        assertEquals(158.0, resultado);
    }
}
