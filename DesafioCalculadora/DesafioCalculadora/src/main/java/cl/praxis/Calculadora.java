package cl.praxis;

public class Calculadora {

    // Constructor vacío
    public Calculadora() {}

    //metodos para sumar, restar, multiplicar y dividir (con condicion para que no divida por cero) en el orden descrito

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No puede dividir el numero por cero");
        }
        return (double) a / b;
    }
}
