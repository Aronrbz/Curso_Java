import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ExportadorTxt extends Exportador {

    @Override
    public void exportar(ArrayList<Producto> listaProductos, String archivo) {
        PrintWriter printWriter = null;
        try {
            File file = new File(archivo);
            printWriter = new PrintWriter(file);

            for (int i = 0; i < listaProductos.size(); i++) {
                Producto producto = listaProductos.get(i);
                printWriter.println("Articulo: " + producto.getArticulo());
                printWriter.println("Precio: " + producto.getPrecio());
                printWriter.println("Descripcion: " + producto.getDescripcion());
                printWriter.println("Codigo: " + producto.getCodigo());
                printWriter.println("Talla: " + producto.getTalla());
                printWriter.println("Marca: " + producto.getMarca());
                printWriter.println("Color: " + producto.getColor());
                printWriter.println();
            }
            System.out.println("datos exportados a: " + archivo);
        } catch (IOException e) {
            System.out.println("error al exportar datos.");
            e.printStackTrace();
        } finally {
            if (printWriter != null) {
                printWriter.close();
            }
        }
    }
}
