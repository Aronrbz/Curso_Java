package cl.praxis.servicio;

import cl.praxis.modelo.Cliente;
import java.util.ArrayList;

public class ClienteServicio {
    private ArrayList<Cliente> listaClientes;

    public ClienteServicio() {
        listaClientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public void eliminarCliente(String rut) {
        for (int i = 0; i < listaClientes.size(); i++) {
            Cliente cliente = listaClientes.get(i);
            if (cliente.getRunCliente().equals(rut)) {
                listaClientes.remove(cliente);
                i--; // Decrementar el índice para ajustar la lista después de eliminar
            }
        }
    }

    public Cliente buscarCliente(String rut) {
        for (int i = 0; i < listaClientes.size(); i++) {
            Cliente cliente = listaClientes.get(i);
            if (cliente.getRunCliente().equals(rut)) {
                return cliente;
            }
        }
        return null;
    }

    public ArrayList<Cliente> listarClientes() {
        ArrayList<Cliente> copiaListaClientes = new ArrayList<>();
        for (int i = 0; i < listaClientes.size(); i++) {
            copiaListaClientes.add(listaClientes.get(i));
        }
        return copiaListaClientes;
    }
}
