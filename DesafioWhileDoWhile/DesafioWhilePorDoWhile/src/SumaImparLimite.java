import java.util.Scanner;

public class SumaImparLimite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEste programa sumará los numeros impares que hay entre el primer y el segundo numero ingresado");
        System.out.print("Ingrese el primer numero al final de la flecha (de preferencia, debe ser menor al segundo numero) --->: ");
        int min = sc.nextInt();

        System.out.print("Ingrese el el segundo numero al final de la flecha (de preferencia, que sea mayor al primer numero) --->: ");
        int max = sc.nextInt();

        int suma = 0;


        if (min % 2 == 0) { //aca me aseguro de que, si el primer numero es par, sumarle 1, para convertirlo a impar
            min+=1;
        }

        for (int i = min; i <= max; i += 2) {   //aca, como ya hemos convertido el numero a impar (el primer valor), al sumarle siempre 2
            suma += i;                         // al primer numero impar, siempre sera impar, el iterador debe ser menor o igual al maximo
  // System.out.println(i); este sout me sirvio para ir viendo el valor de mi iterador y si puedo o no sumarlo (sacale el coment para que veas el valor que toma)
        }
        System.out.println(suma);
        sc.close();
    }
}