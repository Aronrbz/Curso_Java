package cl.praxis.utilidades;

import cl.praxis.modelo.Cliente;
import cl.praxis.modelo.CategoriaEnum;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArchivoServicio {
    public List<Cliente> cargarDatos(String fileName) {
        List<Cliente> clientes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] datos = line.split(",");
                Cliente cliente = new Cliente(datos[0], datos[1], datos[2], datos[3], CategoriaEnum.valueOf(datos[4]));
                clientes.add(cliente);
            }
            System.out.println("Datos cargados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al cargar datos.");
            e.printStackTrace();
        }
        return clientes;
    }
}
