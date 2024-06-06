import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //System.out.printf("Hello and welcome!");
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.

        // Pedir datos al usuario
        System.out.print("Nombre de venta aca --->  ");
        String nombreVenta = sc.nextLine();

        System.out.print("fecha de la venta (formato DDMMYYYY) aca --->: ");
        String fechaVenta = sc.nextLine();

        System.out.print("Ingrese la patente del vehiculo aca --->: ");
        String patenteVehiculo = sc.nextLine();

        System.out.print("edad del cliente aca --->: ");
        int edadCliente = sc.nextInt();


        // Creacion de objeto Cliente y Vehiculo
        Cliente cliente = new Cliente(edadCliente);
        Vehiculo vehiculo = new Vehiculo(patenteVehiculo);

        LibroVenta libroVenta = new LibroVenta(nombreVenta, fechaVenta);

        // Guardar la venta
        libroVenta.guardarVenta(cliente, vehiculo);

        sc.close();
    }
}