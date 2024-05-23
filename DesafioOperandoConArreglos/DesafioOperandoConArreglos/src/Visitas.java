//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Visitas {


    public static void promedio(int[] visitas) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int suma = 0;
        int cantidad = visitas.length;

        // Sumar las visitas
        for (int i = 0; i < cantidad; i++) {
            suma += visitas[i];
        }

        // Calcular el promedio
        double promedio = (double) suma / cantidad;

        // Mostramos el resultado por consola
        System.out.println("Promedio de visitas: " + promedio);
    }

    public static void main(String[] args) {
        // aca almacenamos las visitas diarias
        int[] visitas = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            visitas[i] = Integer.parseInt(args[i]);
        }
        // Llamamos al método "promedio" para calcular y mostrar el resultado
        promedio(visitas);
    }
}
