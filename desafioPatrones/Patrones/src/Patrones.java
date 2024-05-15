//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Patrones {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);

        // solicitud de un numero (al usuario), para saber cuantos caracteres se mostraran por pantalla.
        System.out.print("\nIngrese al final de la fecha, un número para saber cuántos caracteres quiere mostrar -----> ");
        int num = sc.nextInt();

        // Patrón 1
        System.out.println("\nPatrón 1:");
        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                System.out.print("*");
            } else {
                System.out.print(".");
            }
        }
        System.out.println("\n------------------------");

        // Patrón 2
        System.out.println("\nPatrón 2:");
        for (int i = 0; i < num; i++) {
            System.out.print((i % 4) + 1);
        }
        System.out.println("\n------------------------");

        // Patrón 3
        System.out.println("\nPatrón 3:");
        for (int i = 0; i < num; i++) {
            if (i % 3 == 0) {
                System.out.print("|");
            } else {
                System.out.print("*");
            }
        }
        System.out.println("\n-----------------------");

        sc.close();
    }
}