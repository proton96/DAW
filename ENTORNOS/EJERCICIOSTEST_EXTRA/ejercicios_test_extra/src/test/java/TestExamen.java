import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class TestExamen {

    @Test
    public void sumaArray() {
        int[] array = { 1, 2, 3, 4, 5 };
        int resultado = EjerciciosExtra.sumaArray(array);

        assertEquals(15, resultado);

    }

    @Test
    public void mayor() {
        int a = 1;
        int b = 2;
        int resultado = EjerciciosExtra.mayor(a, b);
        assertEquals(2, resultado);
    }

    @Test
    public void contarPares() {
        int[] array = { 1, 2, 3, 4, 5 };
        int resultado = EjerciciosExtra.contarPares(array);
        assertEquals(2, resultado);
    }

    @Test
    public void cuadrado() {
        int n = 2;
        int m = -2;
        int l = 0;
        int resultado = EjerciciosExtra.cuadrado(n);
        int resultado2 = EjerciciosExtra.cuadrado(m);
        int resultado3 = EjerciciosExtra.cuadrado(l);
        assertEquals(4, resultado);
        assertEquals(4, resultado2);
        assertEquals(0, resultado3);
    }

    @Test
    public void longitudCadena() {
        String n = "texto";
        String m = "";
        String r = "HOLA";
        int resultado = EjerciciosExtra.longitudCadena(n);
        int resultado2 = EjerciciosExtra.longitudCadena(m);
        int resultado3 = EjerciciosExtra.longitudCadena(r);
        assertEquals(5, resultado);
        assertEquals(0, resultado2);
        assertEquals(4, resultado3);
    }

    @Test
    public void esPositivo() {

        assertEquals(true, EjerciciosExtra.esPositivo(2));
        assertEquals(false, EjerciciosExtra.esPositivo(0));
        assertEquals(false, EjerciciosExtra.esPositivo(-2));


    }

    
    @Test
    public void ultimoElemento() {

        int [] n = { 1 , 2 , 4 , 5 , 6 , 2 };
        int [] m = { 1 };

        assertEquals(2, EjerciciosExtra.ultimoElemento(n));
        assertEquals(1, EjerciciosExtra.ultimoElemento(m));

    }

    

}
