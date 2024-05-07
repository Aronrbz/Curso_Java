import java.util.Scanner;

public class Fechas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // le solicitamos las fechas al usuario
        System.out.println("Ingrese la primera fecha como DD/MM/AAAA:");
        String fecha1 = sc.nextLine();
        System.out.println("Ingrese la segunda fecha como DD/MM/AAAA:");
        String fecha2 = sc.nextLine();

        // aca convertimos las fechas a enteros con un parseo o casteo
        int dia1 = Integer.parseInt(fecha1.substring(0, 2));

        /* el substring aca va a extraer partes específicas de la cadena fecha1. En este caso, substring(0, 2)
        extrae los dos primeros caracteres del escaneo en el sout y lo almacena en una variable de tipo int llamada
        dia1. el metodo substring tiene un indice de inicio y termino, siendo el 0 el primer elemento y el 2, el tercer
        elemento (un slash /) pero como en el final del indice se termina en el tercer elemento, no lo toma.
        es como cuando hacemos un for.

        Mientras que 'Integer.parseInt' convierte la cadena extraída en un entero en este caso, el numero entero del
        dia */

        int mes1 = Integer.parseInt(fecha1.substring(3, 5));

        //Desde aca y antes de la condicion 'if', se repite lo mismo de arriba (respecto a conversion de datos)
        int ano1 = Integer.parseInt(fecha1.substring(6, 10));

        int dia2 = Integer.parseInt(fecha2.substring(0, 2));
        int mes2 = Integer.parseInt(fecha2.substring(3, 5));
        int ano2 = Integer.parseInt(fecha2.substring(6, 10));

        /* Condicion para determinar que fecha es mayor:

         Comparamos primero los años, luego los meses si los años son iguales, y finalmente los días si tanto los años
         como los meses son iguales. si el año es menor (o sea por ej 1972 vs 2024) el año menor determina a la persona
         mayor (ahora entiendo porque el compañero pregunto eso antes de iniciar el ejercicio...) */
        if (ano1 < ano2 || (ano1 == ano2 && mes1 < mes2) || (ano1 == ano2 && mes1 == mes2 && dia1 < dia2)) {
            System.out.println("persona 1 es mayor");
        } else if (ano1 > ano2 || (ano1 == ano2 && mes1 > mes2) || (ano1 == ano2 && mes1 == mes2 && dia1 > dia2)) {
            System.out.println("persona 2 es mayor");
        } else {
            System.out.println("Tienen la misma edad");
        }

        sc.close();
    }
}
