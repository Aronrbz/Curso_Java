package escrituralectura;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Archivo {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Perro");
        lista.add("Gato");
        lista.add("Juan");
        lista.add("Daniel");
        lista.add("Juan");
        lista.add("Gato");
        lista.add("Perro");
        lista.add("Camila");
        lista.add("Daniel");
        lista.add("Camila");

        String directorio = "src/carpeta";
        String archivo = "texto.txt";

        crearArchivo(directorio, archivo, lista);
    }

    public static void crearArchivo(String directorio, String nombreArchivo, ArrayList<String> lista) {
        if (!nombreArchivo.endsWith(".txt")) {
            nombreArchivo = nombreArchivo + ".txt";
        }

        File dir = new File(directorio);
        if (!dir.exists()) {
            if (dir.mkdirs()) {
                System.out.println("Directorio creado");
            } else {
                System.out.println("Error al crear directorio");
                return;
            }
        } else {
            System.out.println("El directorio ya existe");
        }

        File archivo = new File(directorio + "/" + nombreArchivo);
        if (archivo.exists()) {
            archivo.delete();
            System.out.println("Archivo existente eliminado");
        }

        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado");
            } else {
                System.out.println("El archivo ya existe");
            }

            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);

            for (String item : lista) {
                bw.write(item);
                bw.newLine();
            }

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
