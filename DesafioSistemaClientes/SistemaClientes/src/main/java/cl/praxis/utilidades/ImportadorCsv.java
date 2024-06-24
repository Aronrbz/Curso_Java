package cl.praxis.utilidades;

import cl.praxis.modelo.Cliente;
import cl.praxis.modelo.CategoriaEnum;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ImportadorCsv {

    public List<Cliente> importar(String fileName) {
        List<Cliente> clientes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(";");
                if (fields.length == 5) {
                    String runCliente = fields[0];
                    String nombreCliente = fields[1];
                    String apellidoCliente = fields[2];
                    String aniosCliente = fields[3];
                    CategoriaEnum categoria = CategoriaEnum.valueOf(fields[4]);
                    clientes.add(new Cliente(runCliente, nombreCliente, apellidoCliente, aniosCliente, categoria));
                }
            }
            System.out.println("Datos importados desde " + fileName);
        } catch (IOException e) {
            System.out.println("Error al importar datos: " + e.getMessage());
        }
        return clientes;
    }
}
