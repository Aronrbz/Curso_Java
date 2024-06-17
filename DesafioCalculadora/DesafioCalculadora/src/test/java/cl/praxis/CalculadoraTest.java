package cl.praxis;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(3, 2);
        Assert.assertEquals(5, resultado);
    }

    @Test
    public void testRestar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.restar(5, 3);
        Assert.assertEquals(2, resultado);
    }

    @Test
    public void testMultiplicar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multiplicar(4, 2);
        Assert.assertEquals(8, resultado);
    }

    @Test
    public void testDividir() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.dividir(10, 2);
        Assert.assertEquals(5.0, resultado, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDividirPorCero() {
        Calculadora calculadora = new Calculadora();
        calculadora.dividir(10, 0);
    }
}
