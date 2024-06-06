public class Main {
    public static void main(String[] args) {
        // crear Vehiculo
        Vehiculo vehiculo = new Vehiculo("Rojo", "ABC123");
        System.out.println("Vehiculo creado: " + vehiculo.getColor() + ", " + vehiculo.getPatente());


        // crear Taxi, probar metodo creado en la clase 
        Taxi taxi = new Taxi(1000);
        System.out.println("Valor del pasaje: " + taxi.getValorPasaje());
        int vuelto = taxi.pagarPasaje(1500);
        if (vuelto != taxi.getValorPasaje()) {
            System.out.println("Vuelto: " + vuelto);
        } else {
            System.out.println("El monto ingresado es menor al valor del pasaje, pasaje original: " + taxi.getValorPasaje());
        }

        // crear Bus, probar metodo asientosDisponibles creado en la clase
        Bus bus = new Bus("Azul", "XYZ789", 40);
        System.out.println("Bus creado: " + bus.getColor() + ", " + bus.getPatente() + ", Asientos: " + bus.getCantidadDeAsientos());
        System.out.println("Asientos disponibles: " + bus.asientosDisponibles());

        // crear Minibus, probar metodo imprimeBus creado en la clase
        Minibus minibus = new Minibus("Verde", "LMN456", 20, "Interurbano");
        System.out.println("Minibus creado:");
        minibus.imprimeBus();

        // make a vendedor
        Vendedor vendedor = new Vendedor("12345678-9", "Juan Perez", 35, "Calle Falsa 123");
        System.out.println("Vendedor creado: " + vendedor.getNombre() + ", " + vendedor.getDireccion());

        // make a cliente
        Cliente cliente = new Cliente("98765432-1", "Ana Gomez", 28);
        System.out.println("Cliente creado: " + cliente.getNombre() + ", Edad: " + cliente.getEdad());

        // crear Tienda probar metodo creado en la clase
        Tienda tienda = new Tienda(vendedor, vehiculo, 50);
        System.out.println("Tienda creada: Vendedor - " + tienda.getVendedor().getNombre() + ", Vehiculo - " + tienda.getVehiculo().getPatente() + ", Stock: " + tienda.getStock());
        System.out.println(tienda.existeStock());
    }
}
