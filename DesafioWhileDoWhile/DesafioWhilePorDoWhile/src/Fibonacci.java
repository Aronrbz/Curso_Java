import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n* Este programa mostrara la secuencia de fibonacci en base al numero ingresado.");
        System.out.println("** Si el usuario ingresa el numero 5, se mostraran los primeros 5 numeros de la secuencia de fibonacci.");
        System.out.print("*** Ingrese un numero, al final de la flecha, que determinara cuantos valores de la secuencia de fibonacci se mostraran ---> ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("El número debe ser mayor que 0.");
        } else {
            // los dos primeros numeros de la secuencia
            int a = 0;
            int b = 1;

            for (int i = 0; i < n; i++) {
                System.out.println(a);

                int sig = a + b;

                // Actualizacion de los valores a y b
                a = b;
                b = sig;
            }
        }
        sc.close();
    }
}