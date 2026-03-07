
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;


public class TestOperacionesArray {
    

    @Test 
    public void testSuma(){
        int[] array = { 1, 2, 3, 4, 5 };
        int resultado =  OperacionesArray.sumar(array);
        assertEquals(15,resultado);
    }
}
