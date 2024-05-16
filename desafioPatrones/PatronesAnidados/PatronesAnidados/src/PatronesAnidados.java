//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class PatronesAnidados {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número para ver el dibujo de un patron
        System.out.print("\nIngrese al final de la fecha, un número para mostrar los patrones y su respectivo dibujo -----> ");
        int num = sc.nextInt();


        System.out.println("\nPatrón 1:");
        mostrarPatron1(num);
        System.out.println("\nPatrón 2:");
        mostrarPatron2(num);
        System.out.println("\nPatrón 3:");
        mostrarPatron3(num);
        System.out.println("\nPatrón 4:");
        mostrarPatron4(num);

        sc.close();
    }

    public static void mostrarPatron1(int num) {
        for (int i = 1; i <= num; i++) {
            if (i == 1 || i == num) {
                for (int j = 1; j <= num; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 1; j < num - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n--------");
    }


    public static void mostrarPatron2(int num){
        for (int i = 1; i <= num; i++) {
            if (i == 1 || i == num) {
                for (int j = 1; j <= num; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= num - i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n--------");
    }

    public static void mostrarPatron3( int num){
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == j || i + j == num - 1 || (num % 2 == 0 && (i == num / 2 - 1 || i == num / 2) && (j == num / 2 - 1 || j == num / 2))) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("\n--------");
    }

    public static void mostrarPatron4( int num){
        for (int i = 0; i < num; i++) {
            if (i == 0) {
                for (int j = 0; j < num; j++) {
                    System.out.print("*");
                }
            } else if (i == num - 1) {
                System.out.print(" ");
                for (int j = 1; j <= num; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print(" ");
                for (int j = 1; j < num; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("\n--------");
    }
}




