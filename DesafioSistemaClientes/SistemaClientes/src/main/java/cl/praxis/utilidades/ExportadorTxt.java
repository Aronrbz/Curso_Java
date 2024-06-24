package cl.praxis.utilidades;

import cl.praxis.modelo.Cliente;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ExportadorTxt extends Exportador {
    @Override
    public void exportar(String fileName, List<Cliente> listaClientes) {
        try (FileWriter writer = new FileWriter(fileName + ".txt")) {
            for (Cliente cliente : listaClientes) {
                writer.append(cliente.getRunCliente()).append(" ");
                writer.append(cliente.getNombreCliente()).append(" ");
                writer.append(cliente.getApellidoCliente()).append(" ");
                writer.append(cliente.getAniosCliente()).append(" ");
                writer.append(cliente.getNombreCategoria().toString()).append("\n");
            }
            System.out.println("Datos exportados a TXT correctamente.");
        } catch (IOException e) {
            System.out.println("Error al exportar datos a TXT.");
            e.printStackTrace();
        }
    }
}
