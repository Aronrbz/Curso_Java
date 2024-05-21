import java.util.Scanner;

public class SumaImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEste programa sumará los numeros impares, desde 0 hasta el numero ingresado");
        System.out.print("Ingrese un numero al final de la flecha ----->: ");

        int num = sc.nextInt();
        int suma = 0;

        for (int i = 1; i <= num; i += 2) { // inicio en 1 el iterador, porque 1 será siempre el primer numero impar, y
            suma += i;                     // luego le voy sumando 2, ya que el resultado de eso, siempre dará impar
        }

        System.out.println(suma);
        sc.close();
    }
}

