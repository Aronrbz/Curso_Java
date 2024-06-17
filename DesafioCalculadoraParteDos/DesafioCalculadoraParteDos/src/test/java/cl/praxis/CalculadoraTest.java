package cl.praxis;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        CalculadoraDos calculadora = new CalculadoraDos();
        int resultado = calculadora.sumar(2, 3);
        assertEquals(5, resultado);
    }

    @Test
    public void testRestar() {
        CalculadoraDos calculadora = new CalculadoraDos();
        int resultado = calculadora.restar(5, 3);
        assertEquals(2, resultado);
    }

    @Test
    public void testMultiplicar() {
        CalculadoraDos calculadora = new CalculadoraDos();
        int resultado = calculadora.multiplicar(2, 3);
        assertEquals(6, resultado);
    }

    @Test
    public void testDividir() {
        CalculadoraDos calculadora = new CalculadoraDos();
        int resultado = calculadora.dividir(6, 3);
        assertEquals(2, resultado);
    }
}
