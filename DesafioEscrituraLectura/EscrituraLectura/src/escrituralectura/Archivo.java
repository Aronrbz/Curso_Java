package escrituralectura;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
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
        buscarTexto(directorio, archivo, "Perro");
    }

    public static void crearArchivo(String directorio, String nombreArchivo, ArrayList<String> lista) {
        if (!nombreArchivo.endsWith(".txt")) {
            nombreArchivo = nombreArchivo + ".txt";
        }

        File dir = new File(directorio);
        if (!dir.exists()) {
            boolean dirCreated = dir.mkdirs();
            if (dirCreated) {
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
            boolean fileDeleted = archivo.delete();
            if (fileDeleted) {
                System.out.println("Archivo existente eliminado");
            }
        }

        try {
            boolean fileCreated = archivo.createNewFile();
            if (fileCreated) {
                System.out.println("Archivo creado");
            } else {
                System.out.println("El archivo ya existe");
            }

            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < lista.size(); i++) {
                bw.write(lista.get(i));
                bw.newLine();
            }

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void buscarTexto(String directorio, String nombreArchivo, String texto) {
        File archivo = new File(directorio + "/" + nombreArchivo);

        if (!archivo.exists()) {
            System.out.println("El archivo ingresado no existe");
            return;
        }

        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String data;
            int count = 0;

            while ((data = br.readLine()) != null) {
                if (data.contains(texto)) {
                    count++;
                }
            }

            br.close();
            System.out.println("El texto '" + texto + "' se encuentra " + count + " veces en el archivo.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
