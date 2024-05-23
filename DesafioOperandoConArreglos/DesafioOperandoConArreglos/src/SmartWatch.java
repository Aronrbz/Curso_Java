import java.util.ArrayList;

public class SmartWatch {

    // Método para filtrar los pasos y eliminar valores no válidos
    public static void clearSteps(int[] pasos, ArrayList<Integer> pasosFiltrados) {
        // Filtramos los pasos
        for (int i = 0; i < pasos.length; i++) {
            if (pasos[i] >= 200 && pasos[i] <= 100000) {
                pasosFiltrados.add(pasos[i]);
            }
        }
    }

    //calcular el promedio de pasos
    public static void promedio(ArrayList<Integer> pasosFiltrados) {
        int suma = 0;

        // Sumar los pasos
        for (int i = 0; i < pasosFiltrados.size(); i++) {
            suma += pasosFiltrados.get(i);
        }

        // Calcular el promedio
        double promedio = (double) suma / pasosFiltrados.size();

        // Mostrar el resultado
        System.out.println("promedio de pasos: " + promedio);
    }

    public static void main(String[] args) {

        int[] pasos = new int[args.length];


        for (int i = 0; i < args.length; i++) {
            pasos[i] = Integer.parseInt(args[i]);
        }

        // lista para almacenar los pasos filtrados
        ArrayList<Integer> pasosFiltrados = new ArrayList<>();

        // Filtrar pasos invalids
        clearSteps(pasos, pasosFiltrados);

        // Calcular y mostrar el promedio de los pasos filtrados
        promedio(pasosFiltrados);
    }
}
