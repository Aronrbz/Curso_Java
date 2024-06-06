//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        
        //System.out.printf("Hello and welcome!");
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.

        // Creacion de objeto Cliente y Vehiculo
        Cliente cliente = new Cliente(30);  // Edad del cliente como parámetro
        Vehiculo vehiculo = new Vehiculo("ABC123");  // Patente del vehículo como parámetro

        LibroVenta libroVenta = new LibroVenta("Venta1", "01102020");

        libroVenta.guardarVenta(cliente, vehiculo);
    }
}