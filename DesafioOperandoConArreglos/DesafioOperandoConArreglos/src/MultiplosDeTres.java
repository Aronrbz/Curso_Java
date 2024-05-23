import java.util.ArrayList;

public class MultiplosDeTres {

    // Método para encontrar y sumar multiplos de tres
    public static void suma(int[] numeros, ArrayList<Integer> multiplosDeTres) {
        int suma = 0;

        // Recorrer cada número del array
        for (int i = 0; i < numeros.length; i++) {
            // Comprobar si el número es múltiplo de tres
            if (numeros[i] % 3 == 0) { //con resto de 3, sabremos si es multiplo de 3
                // Añadir el número a la list de múltiplos de 3
                multiplosDeTres.add(numeros[i]);
                // Sumar el número al total
                suma += numeros[i];
            }
        }

        // Mostrar la suma de los múltiplos de 3
        System.out.println("La suma de los múltiplos de tres es: " + suma);
    }

    public static void main(String[] args) {

        int[] numeros = new int[args.length];


        for (int i = 0; i < args.length; i++) {
            numeros[i] = Integer.parseInt(args[i]);
        }
        // lista para almacenar los múltiplos de 3
        ArrayList<Integer> multiplosDeTres = new ArrayList<>();

        // Llamar al metodo 'suma' para encontrar y sumar los múltiplos de tres
        suma(numeros, multiplosDeTres);
    }
}
