import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LibroVenta {
    private String nombreVenta;
    private String fechaVenta;

    public LibroVenta(String nombreVenta, String fechaVenta) {
        this.nombreVenta = nombreVenta;
        this.fechaVenta = fechaVenta;
    }

    public String getNombreVenta() {
        return nombreVenta;
    }

    public void setNombreVenta(String nombreVenta) {
        this.nombreVenta = nombreVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public void guardarVenta(Cliente cliente, Vehiculo vehiculo) {
        File directorio = new File("ficheros");
        if (!directorio.exists()) {
            directorio.mkdir();
        }

        File archivo = new File(directorio, nombreVenta + ".txt");
        if (archivo.exists()) {
            System.out.println("El archivo ya existe.");
            return;
        }

        try (FileWriter writer = new FileWriter(archivo)) {
            writer.write("Patente del Vehiculo: " + vehiculo.getPatente() + "\n");
            writer.write("Edad del Cliente: " + cliente.getEdad() + "\n");
            writer.write("Fecha de la Venta: " + fechaVenta + "\n");
            writer.write("Nombre de Venta: " + nombreVenta + "\n");
            System.out.println("Venta guardada exitosamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al guardar la venta.");
            e.printStackTrace();
        }
    }
}
