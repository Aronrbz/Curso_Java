package cl.praxis;

public class CalculadoraDos {

    // Constructor vacío
    public CalculadoraDos() {
    }


    //Metodos sumar, rest, multi, div
    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No puede ser cero el divisor");
        }
        return a / b;
    }
}
