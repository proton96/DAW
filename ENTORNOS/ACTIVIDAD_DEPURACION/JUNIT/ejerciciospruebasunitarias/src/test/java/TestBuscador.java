import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestBuscador {
  
    @Test
    public void testbuscarPrimerPar(){
        int[] array = {1, 3, 6, 7, 9};
        int resultado = Buscador.buscarPrimerPar(array);
        assertEquals(2, resultado);
    }

    @Test
    public void testesPalindromo(){
        String cadena = "reconocer";
        boolean resultado = Buscador.esPalindromo(cadena);
        assertEquals(true, resultado);
        
    }
}
