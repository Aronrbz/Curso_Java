import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ProductoServicio productoServicio;
    private ArchivoServicio archivoServicio;

    public Menu() {
        this.productoServicio = new ProductoServicio();
        this.archivoServicio = new ArchivoServicio();
    }

    public Menu(ProductoServicio productoServicio, ArchivoServicio archivoServicio) {
        this.productoServicio = productoServicio;
        this.archivoServicio = archivoServicio;
    }

    public ProductoServicio getProductoServicio() {
        return productoServicio;
    }

    public void setProductoServicio(ProductoServicio productoServicio) {
        this.productoServicio = productoServicio;
    }

    public ArchivoServicio getArchivoServicio() {
        return archivoServicio;
    }

    public void setArchivoServicio(ArchivoServicio archivoServicio) {
        this.archivoServicio = archivoServicio;
    }

    // Mostrar el menú
    public void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        // Menú
        System.out.println(" ");
        System.out.println("///////////////////////");
        System.out.println("/////Recicla Jeans/////");
        System.out.println("///////////////////////");
        System.out.println(" ");
        System.out.println("Seleccione una opción: ");
        while (opcion != 4) {

            Utilidad.limpiarPantalla();

            System.out.println("1. Listar Producto");
            System.out.println("2. Editar Datos");
            System.out.println("3. Importar Datos");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción acá (digite un número y presione enter)--->: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                productoServicio.listarProductos();
            } else if (opcion == 2) {
                editarDatos(sc);
            } else if (opcion == 3) {
                importarDatos(sc);
            } else if (opcion == 4) {
                System.out.println("Cerrando...");
            } else {
                System.out.println("Opción no válida. Intente nuevamente.");
            }
            Utilidad.esperar(2); // Pausa para la transición
        }

        sc.close();
    }

    // Método para editar datos
    private void editarDatos(Scanner scanner) {
        // Pedir el código del producto a editar
        System.out.print("Ingrese el código del producto a editar: ");
        String codigo = scanner.nextLine();

        Producto producto = null;
        for (Producto p : productoServicio.getListaProductos()) {
            if (p.getCodigo().equals(codigo)) {
                producto = p;
                break;
            }
        }

        if (producto != null) {
            System.out.println("Producto encontrado: " + producto);
            System.out.print("Ingrese el nuevo precio: ");
            String nuevoPrecio = scanner.nextLine();
            producto.setPrecio(nuevoPrecio);
            System.out.println("Precio actualizado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    // Método para importar datos
    private void importarDatos(Scanner scanner) {
        // Pedir la ruta del archivo al usuario
        //aca he usado una ruta absoluta para eso");
        //mi ruta absoluta es C:\Users\Abustos\OneDrive - G-TALENT SPA\Escritorio\Talento_Digital\asignaturas\backend\java\clase_06052024\DesafioReciclaJeans\ReciclaJeans\ProductosImportados.csv
        System.out.println("importar el archivo de apoyo ProductosImportados.csv / por ejemplo C:/usuario/ProductosImportados.csv ");
        System.out.print("Ingrese la ruta del archivo para importar los datos -->: ");
        String rutaArchivo = scanner.nextLine();

        ArrayList<Producto> productosImportados = archivoServicio.cargarDatos(rutaArchivo);
        productoServicio.setListaProductos(productosImportados);
        System.out.println("Datos importados correctamente.");
    }
}
