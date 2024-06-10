import java.util.Scanner;

public class Menu {
    private ProductoServicio productoServicio;
    private ExportadorTxt exportadorTxt;

    public Menu() {
    }

    public Menu(ProductoServicio productoServicio, ExportadorTxt exportadorTxt) {
        this.productoServicio = productoServicio;
        this.exportadorTxt = exportadorTxt;
    }




    public ProductoServicio getProductoServicio() {
        return productoServicio;
    }

    public void setProductoServicio(ProductoServicio productoServicio) {
        this.productoServicio = productoServicio;
    }

    public ExportadorTxt getExportadorTxt() {
        return exportadorTxt;
    }

    public void setExportadorTxt(ExportadorTxt exportadorTxt) {
        this.exportadorTxt = exportadorTxt;
    }



    // mostrar menu
    public void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        // menu
        System.out.println(" ");
        System.out.println("///////////////////////");
        System.out.println("/////Indiana Jeans/////");
        System.out.println("//////////////////////");
        System.out.println(" ");
        System.out.println("Seleccione una opcion: ");
        while (opcion != 4) {

            Utilidad.limpiarPantalla();

            System.out.println("1. Listar Producto");
            System.out.println("2. Agregar Producto");
            System.out.println("3. Exportar Datos");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción aca (digite un numero)--->: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                productoServicio.listarProductos();
            } else if (opcion == 2) {
                agregarProducto(sc);
            } else if (opcion == 3) {
                exportarDatos(sc);
            } else if (opcion == 4) {
                System.out.println("Cerrando...");
            } else {
                System.out.println("Opción no válida. Intente nuevamente.");
            }
        }

        sc.close();
    }

    // method para agregar producto
    private void agregarProducto(Scanner scanner) {
        // pedir datos al usuario
        System.out.print("Ingresar nombre articulo: ");
        String articulo = scanner.nextLine();
        System.out.print("Ingresar precio: ");
        String precio = scanner.nextLine();
        System.out.print("Ingresar descripcion: ");
        String descripcion = scanner.nextLine();
        System.out.print("Ingresar codigo: ");
        String codigo = scanner.nextLine();
        System.out.print("Ingresar talla: ");
        String talla = scanner.nextLine();
        System.out.print("Ingresar marca: ");
        String marca = scanner.nextLine();
        System.out.print("Ingresar color: ");
        String color = scanner.nextLine();

        // Creaproducto y lo addedea a la list
        Producto producto = new Producto(articulo, precio, descripcion, codigo, talla, marca, color);
        productoServicio.agregarProducto(producto);
    }

    // exportar datos
    private void exportarDatos(Scanner scanner) {
        //aca se pide el nombre del archivo
        System.out.print("Ingrese el nombre del archivo para exportar los datos: ");
        String archivo = scanner.nextLine();

        exportadorTxt.exportar(productoServicio.getListaProductos(), archivo);
    }
}
