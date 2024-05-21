import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lista inicial de libros
        ArrayList<String> libros = new ArrayList<>(List.of("Introducción a Java", "Programación en C++"));

        // Variable para almacenar la opción elegida por el usuario
        int op;

        do {
            // Mostrar el menú y obtener la opción
            op = mostrarMenu();

            if (op == 1) {  // Agregar libro
                System.out.print("Ingrese el nombre del libro a añadir: ");
                String nombreLibro = scanner.nextLine();
                agregarLibro(libros, nombreLibro);
            } else if (op == 2) {  // Eliminar libro
                System.out.print("Ingrese el nombre del libro a eliminar: ");
                String libroBorrar = scanner.nextLine();
                eliminarLibro(libros, libroBorrar);
            } else if (op == 3) {  // Verificar si un libro existe
                System.out.print("Ingrese el nombre del libro a verificar: ");
                String libroVerificar = scanner.nextLine();
                verificarLibro(libros, libroVerificar);
            } else if (op == 4) {  // Listar todos los libros
                listarLibros(libros);
            } else if (op == 5) {  // Ordenar libros
                ordenarLibros(libros);
            } else if (op == 0) {  // Salir
                System.out.println("Adiós!\n");
            } else {  // Opción inválida
                System.out.println("Opción inválida\n");
            }
        } while (op != 0);

        // Cerrar el scanner antes de finalizar el programa
        scanner.close();
    }

    // Mostrar el menú y leer una opción válida
    static int mostrarMenu() {
        mensaje(" === MENÚ DE OPCIONES ===\n");
        mensaje(" 1. Agregar Libro:\n");
        mensaje(" 2. Eliminar Libro:\n");
        mensaje(" 3. Verificar Libro:\n");
        mensaje(" 4. Listar Libros:\n");
        mensaje(" 5. Ordenar Libros:\n");
        mensaje(" 0. Salir\n");
        return leerValorInt("Elige una opción: ");
    }

    // Leer un entero de la entrada estándar
    static int leerValorInt(String mensaje) {
        System.out.print(mensaje);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    // Imprimir un mensaje
    static void mensaje(String mensaje) {
        System.out.print(mensaje);
    }

    // Agregar un libro a la lista
    static void agregarLibro(ArrayList<String> libros, String nombreLibro) {
        if (!libros.contains(nombreLibro)) {
            libros.add(nombreLibro);
            System.out.println(nombreLibro + " ha sido agregado.\n");
        } else {
            System.out.println(nombreLibro + " ya está en la colección.\n");
        }
    }

    // Eliminar un libro de la lista
    static void eliminarLibro(ArrayList<String> libros, String libroBorrar) {
        if (libros.contains(libroBorrar)) {
            libros.remove(libroBorrar);
            System.out.println(libroBorrar + " ha sido eliminado.\n");
        } else {
            System.out.println(libroBorrar + " no está en la colección.\n");
        }
    }

    //verificar

    static void verificarLibro(ArrayList<String> libros, String libroVerificar) {
        boolean encontrado = false;
        for (String libro : libros) {
            if (libro.equalsIgnoreCase(libroVerificar)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println(libroVerificar + " está disponible en la biblioteca.\n");
        } else {
            System.out.println(libroVerificar + " no se encuentra en la biblioteca.\n");
        }
    }



    static void ordenarLibros(ArrayList<String> libros) {
        Collections.sort(libros, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Los libros han sido ordenados alfabéticamente.\n");
        listarLibros(libros);
    }

    static void listarLibros(ArrayList<String> libros) {
        System.out.println("Lista de Libros:");
        for (String libro : libros) {
            System.out.println(libro);
        }
        System.out.println();
    }
}


