import java.util.Scanner;

public class SoloPares2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEste programa solo mostrará los numeros pares segun el numero ingresado");
        System.out.print("Ingrese un numero al final de la flecha ----->: ");
        int num = sc.nextInt();

        System.out.println("\nresultado:\n");
        for (int i = 1; i <= num; i++) {
            System.out.println(2 * i);

        }
        sc.close();
    }
}
