package cl.praxis;

import cl.praxis.servicio.ClienteServicio;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteServicioTest {
    @Test
    public void testAgregarCliente() {
        ClienteServicio clienteServicio = new ClienteServicio();
        Cliente cliente = new Cliente("Aron", "Bustos", "16977135-9", "Vicuña Mackenna 625");
        clienteServicio.agregarCliente(cliente);
        assertEquals(1, clienteServicio.listarClientes().size());
    }

    @Test
    public void testEliminarCliente() {
        ClienteServicio clienteServicio = new ClienteServicio();
        Cliente cliente = new Cliente("Aron", "Bustos", "16977135-9", "Vicuña Mackenna 625");
        clienteServicio.agregarCliente(cliente);
        clienteServicio.eliminarCliente("16977135-9");
        assertEquals(0, clienteServicio.listarClientes().size());
    }

    @Test
    public void testBuscarCliente() {
        ClienteServicio clienteServicio = new ClienteServicio();
        Cliente cliente = new Cliente("Aron", "Bustos", "16977135-9", "Vicuña Mackenna 625");
        clienteServicio.agregarCliente(cliente);
        Cliente encontrado = clienteServicio.buscarCliente("16977135-9");
        assertNotNull(encontrado);
        assertEquals("Aron", encontrado.getNombre());
    }

    @Test
    public void testListarClientes() {
        ClienteServicio clienteServicio = new ClienteServicio();
        Cliente cliente1 = new Cliente("Aron", "Bustos", "16977135-9", "Vicuña Mackenna 625");
        Cliente cliente2 = new Cliente("Gaspar", "Bustos", "24143078-2", "Fresia 7500");
        clienteServicio.agregarCliente(cliente1);
        clienteServicio.agregarCliente(cliente2);
        assertEquals(2, clienteServicio.listarClientes().size());
    }
}
