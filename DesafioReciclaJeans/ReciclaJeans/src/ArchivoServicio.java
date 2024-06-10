import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoServicio {
    private String rutaArchivo;


    public ArchivoServicio() {
    }

    public ArchivoServicio(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }




    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }


    //Metodo
    //cargar datos desde apoyo (ProductosImportados)
    public ArrayList<Producto> cargarDatos(String rutaArchivo) {
        ArrayList<Producto> listaProductos = new ArrayList<>();
        BufferedReader reader = null;

        try {
            // Crear un FileReader para el archivo
            FileReader fileReader = new FileReader(rutaArchivo);
            // Crear un BufferedReader para leer el archivo
            reader = new BufferedReader(fileReader);
            String linea;
            // Leer línea por línea
            while ((linea = reader.readLine()) != null) {
                // Separar la línea en partes usando la coma como delimitador
                String[] partes = linea.split(",");
                // Crear un nuevo objeto Producto con las partes
                Producto producto = new Producto();
                producto.setArticulo(partes[0]);
                producto.setPrecio(partes[1]);
                producto.setDescripcion(partes[2]);
                producto.setCodigo(partes[3]);
                producto.setTalla(partes[4]);
                producto.setMarca(partes[5]);
                producto.setColor(partes[6]);
                // Agregar el producto a la lista
                listaProductos.add(producto);
            }
            System.out.println("Datos cargados correctamente desde " + rutaArchivo);
        } catch (IOException e) {
            // Manejo de la excepción
            System.out.println("Ocurrió un error al cargar los datos desde el archivo.");
            e.printStackTrace();
        } finally {
            // Cerrar el BufferedReader
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Ocurrió un error al cerrar el archivo.");
                    e.printStackTrace();
                }
            }
        }

        return listaProductos;
    }
}