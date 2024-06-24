package cl.praxis.vista;

import cl.praxis.modelo.Cliente;
import cl.praxis.modelo.CategoriaEnum;
import cl.praxis.servicio.ClienteServicio;
import cl.praxis.utilidades.ExportadorCsv;
import cl.praxis.utilidades.ExportadorTxt;
import cl.praxis.utilidades.ArchivoServicio;

import java.util.List;
import java.util.Scanner;


public class Menu {
    private ClienteServicio clienteServicio = new ClienteServicio();
    private ArchivoServicio archivoServicio = new ArchivoServicio();
    private ExportadorCsv exportadorCsv = new ExportadorCsv();
    private ExportadorTxt exportadorTxt = new ExportadorTxt();
    private String fileName = "Clientes";
    private String fileName1 = "DBClientes.csv";
    private Scanner scanner = new Scanner(System.in);

    public void iniciarMenu() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("\nSistema de Gestión de Clientes (CRUD)");
            System.out.println("1. Listar Clientes");
            System.out.println("2. Agregar Cliente");
            System.out.println("3. Editar Cliente");
            System.out.println("4. Cargar Datos");
            System.out.println("5. Exportar Datos");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                listarClientes();
            } else if (opcion == 2) {
                agregarCliente();
            } else if (opcion == 3) {
                editarCliente();
            } else if (opcion == 4) {
                importarDatos();
            } else if (opcion == 5) {
                exportarDatos();
            } else if (opcion == 6) {
                terminarPrograma();
                continuar = false;
            } else {
                System.out.println("Opción no válida, intente nuevamente.");
            }
        }
    }

    public void listarClientes() {
        List<Cliente> clientes = clienteServicio.listarClientes();
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes para mostrar.");
        } else {
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }

    public void agregarCliente() {
        System.out.print("Ingrese RUN del Cliente: ");
        String runCliente = scanner.nextLine();
        System.out.print("Ingrese Nombre del Cliente: ");
        String nombreCliente = scanner.nextLine();
        System.out.print("Ingrese Apellido del Cliente: ");
        String apellidoCliente = scanner.nextLine();
        System.out.print("Ingrese años como Cliente: ");
        String aniosCliente = scanner.nextLine();

        Cliente cliente = new Cliente(runCliente, nombreCliente, apellidoCliente, aniosCliente, CategoriaEnum.ACTIVO);
        clienteServicio.agregarCliente(cliente);
        System.out.println("Cliente agregado.");
    }

    public void editarCliente() {
        System.out.print("Ingrese RUN del Cliente a editar: ");
        String runCliente = scanner.nextLine();
        Cliente cliente = clienteServicio.buscarCliente(runCliente);
        if (cliente != null) {
            System.out.println("Seleccione qué desea hacer:");
            System.out.println("1. Cambiar el estado del Cliente");
            System.out.println("2. Editar los datos ingresados del Cliente");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                System.out.println("El estado actual es: " + cliente.getNombreCategoria());
                System.out.println("1. Cambiar el estado a Inactivo");
                System.out.println("2. Mantener el estado Activo");
                int estadoOpcion = scanner.nextInt();
                scanner.nextLine();
                if (estadoOpcion == 1) {
                    cliente.setNombreCategoria(CategoriaEnum.INACTIVO);
                    System.out.println("Estado cambiado a Inactivo.");
                } else {
                    System.out.println("Estado mantenido como Activo.");
                }
            } else if (opcion == 2) {
                System.out.println("1. Editar RUN");
                System.out.println("2. Editar Nombre");
                System.out.println("3. Editar Apellido");
                System.out.println("4. Editar años como Cliente");
                int datoOpcion = scanner.nextInt();
                scanner.nextLine();

                if (datoOpcion == 1) {
                    System.out.print("Ingrese nuevo RUN: ");
                    cliente.setRunCliente(scanner.nextLine());
                } else if (datoOpcion == 2) {
                    System.out.print("Ingrese nuevo Nombre: ");
                    cliente.setNombreCliente(scanner.nextLine());
                } else if (datoOpcion == 3) {
                    System.out.print("Ingrese nuevo Apellido: ");
                    cliente.setApellidoCliente(scanner.nextLine());
                } else if (datoOpcion == 4) {
                    System.out.print("Ingrese nuevos años como Cliente: ");
                    cliente.setAniosCliente(scanner.nextLine());
                }
                System.out.println("Datos actualizados.");
            }
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    public void importarDatos() {
        System.out.print("Ingrese la ruta del archivo CSV: ");
        String ruta = scanner.nextLine();
        List<Cliente> clientes = archivoServicio.cargarDatos(ruta);
        for (Cliente cliente : clientes) {
            clienteServicio.agregarCliente(cliente);
        }
        System.out.println("Datos importados correctamente.");
    }

    public void exportarDatos() {
        System.out.println("Seleccione el formato a exportar:");
        System.out.println("1. Formato CSV");
        System.out.println("2. Formato TXT");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        if (opcion == 1) {
            exportadorCsv.exportar(fileName, clienteServicio.listarClientes());
        } else if (opcion == 2) {
            exportadorTxt.exportar(fileName, clienteServicio.listarClientes());
        }
        System.out.println("Datos exportados correctamente.");
    }

    public void terminarPrograma() {
        String[] animacion = {"/", "|", "\\", "-", "/", "|", "\\", "-"};
        for (int i = 0; i < animacion.length; i++) {
            System.out.print("\rSaliendo ... " + animacion[i]);
            try {
                Thread.sleep(200); // Pausar por 200 milisegundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nPrograma terminado.");
    }
}
