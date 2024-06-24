package cl.praxis;

import cl.praxis.servicio.ClienteServicio;
import cl.praxis.modelo.Cliente;
import cl.praxis.modelo.CategoriaEnum;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteServicioTest {

    @Test
    public void testAgregarCliente() {
        ClienteServicio clienteServicio = new ClienteServicio();
        Cliente cliente = new Cliente("16977135-9", "Aron", "Bustos", "5", CategoriaEnum.ACTIVO);
        clienteServicio.agregarCliente(cliente);
        assertEquals(1, clienteServicio.listarClientes().size());
    }

    @Test
    public void testEliminarCliente() {
        ClienteServicio clienteServicio = new ClienteServicio();
        Cliente cliente = new Cliente("16977135-9", "Aron", "Bustos", "5", CategoriaEnum.ACTIVO);
        clienteServicio.agregarCliente(cliente);
        clienteServicio.eliminarCliente("16977135-9");
        assertEquals(0, clienteServicio.listarClientes().size());
    }

    @Test
    public void testBuscarCliente() {
        ClienteServicio clienteServicio = new ClienteServicio();
        Cliente cliente = new Cliente("16977135-9", "Aron", "Bustos", "5", CategoriaEnum.ACTIVO);
        clienteServicio.agregarCliente(cliente);
        Cliente encontrado = clienteServicio.buscarCliente("16977135-9");
        assertNotNull(encontrado);
        assertEquals("Aron", encontrado.getNombreCliente());
    }

    @Test
    public void testListarClientes() {
        ClienteServicio clienteServicio = new ClienteServicio();
        Cliente cliente1 = new Cliente("16977135-9", "Aron", "Bustos", "5", CategoriaEnum.ACTIVO);
        Cliente cliente2 = new Cliente("24143078-2", "Gaspar", "Bustos", "3", CategoriaEnum.INACTIVO);
        clienteServicio.agregarCliente(cliente1);
        clienteServicio.agregarCliente(cliente2);
        assertEquals(2, clienteServicio.listarClientes().size());
    }
}
