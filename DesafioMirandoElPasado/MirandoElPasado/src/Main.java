import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.Queue;
import java.util.LinkedList;

 //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        //to see how IntelliJ IDEA suggests fixing it.
        //System.out.println("Hello and welcome!");

        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.

        ArrayList<String> marcas = new ArrayList<>();

        marcas.add("Ford");
        marcas.add("Chevrolet");
        marcas.add("Mazda");
        marcas.add("Kia");
        marcas.add("Hyundai");
        marcas.add("Suzuki");
        marcas.add("Mitsubishi");
        marcas.add("Nissan");

        System.out.println("///////////////////////////////////////////////");
        System.out.println("///////////// Listado Inicial ////////////////");
        System.out.println("/////////////////////////////////////////////");
        for (String marca : marcas) {
            System.out.println(marca);
        }


        //Agregar marcas nuevas
        marcas.add("Blokbaster");
        marcas.add("Carrefour");
        marcas.add("Jetix");

        System.out.print("\n///////////////////////////////////////////////");
        System.out.println("\nListado Actualizado:\n");
        for (String marca : marcas) {
            System.out.println(marca);
        }

        //cambiar blockbaster por blockbuster
        int index = marcas.indexOf("Blokbaster");
        if (index != -1) {
            marcas.set(index, "Blockbuster");
        }

        System.out.print("\n///////////////////////////////////////////////");
        System.out.println("\nListado Actualizado de Marcas:\n");
        for (String marca : marcas) {
            System.out.println(marca);
        }

        //Sacar el supermercado
        marcas.remove("Carrefour");

        System.out.print("\n///////////////////////////////////////////////");
        System.out.println("\nListado luego de remover 'Carrefour': \n");
        for (String marca : marcas) {
            System.out.println(marca);
        }

        // Agregar marcas adicionales "posiblesMarcas" y añadirlas a "marcas"
        ArrayList<String> posiblesMarcas = new ArrayList<>();
        posiblesMarcas.add("Praxis");
        posiblesMarcas.add("DesafioLatam");
        posiblesMarcas.add("CoderHouse");

        marcas.addAll(posiblesMarcas);

        System.out.print("\n///////////////////////////////////////////////");
        System.out.println("\nUltimo listado, después de agregar posibles marcas: \n");
        for (String marca : marcas) {
            System.out.println(marca);
        }

        // count de marcas
        int cantidadMarcas = marcas.size();

        System.out.println("\nmarcas en la Lista: " + cantidadMarcas);
        System.out.print("\n///////////////////////////////////////////////\n");


        //Ejericio 2

        Set<String> invitados = new TreeSet<>();

        // Paso 2: Agregar los nombres al Set de invitados
        invitados.add("Daniel");
        invitados.add("Paola");
        invitados.add("Facundo");
        invitados.add("Pedro");
        invitados.add("Jacinta");
        invitados.add("Florencia");
        invitados.add("Juan Pablo");

        // Imprimir los nombres en consola
        System.out.println("\n///////////////////////////////////////////////");
        System.out.println("/////////// Invitados Iniciales //////////////");
        System.out.println("/////////////////////////////////////////////");
        for (String invitado : invitados) {
            System.out.println(invitado);
        }

        Set<String> posiblesInvitados = new TreeSet<>();
        posiblesInvitados.add("Jorge");
        posiblesInvitados.add("Francisco");
        posiblesInvitados.add("Marcos");

        invitados.addAll(posiblesInvitados);

        // Imprimir el nuevo listado en pantalla
        System.out.print("\n///////////////////////////////////////////////");
        System.out.println("\n invitados actualizado:\n");
        for (String invitado : invitados) {
            System.out.println(invitado);
        }


        invitados.remove("Jorge");

        System.out.print("\n///////////////////////////////////////////////");
        System.out.println("\nListado luego de remover a Jorge :'(  \n");
        for (String invitado : invitados) {
            System.out.println(invitado);
        }

        System.out.print("\n///////////////////////////////////////////////\n");

        Map<String, Integer> golosinas = new TreeMap<>();

        golosinas.put("Chocman", 100);
        golosinas.put("Trululú", 100);
        golosinas.put("Centella", 100);
        golosinas.put("Kilate", 50);
        golosinas.put("Miti-miti", 30);
        golosinas.put("Traga Traga", 150);
        golosinas.put("Tableton", 5);

        System.out.println("\n///////////////////////////////////////////////");
        System.out.println("//////////// Listado de Dulces ///////////////");
        System.out.println("/////////////////////////////////////////////");

        System.out.println("\ngolosinas:");
        for (Map.Entry<String, Integer> golosina : golosinas.entrySet()) {
            System.out.println(golosina.getKey() + " a " + golosina.getValue() + " pesos");
        }


        // Filtrar los que cuestan menos de 100

        System.out.println("\n///////////////////////////////////////////////");
        System.out.println("Dulces que costaban menos de 100 :'( \n ");
        for (Map.Entry<String, Integer> golosina : golosinas.entrySet()) {
            if (golosina.getValue() < 100) {
                System.out.println(golosina.getKey() + " a " + golosina.getValue() + " pesos");
            }
        }
        //con luca era millonario xd

        System.out.print("\n///////////////////////////////////////////////\n");

        Queue<String> juegos = new LinkedList<>();

        juegos.add("Tombo");
        juegos.add("Congelado");
        juegos.add("Quemaditas");
        juegos.add("Cachipún");
        juegos.add("Pillarse");


        System.out.println("\n///////////////////////////////////////////////");
        System.out.println("///////////// Lista de Juegos ////////////////");
        System.out.println("/////////////////////////////////////////////\n");
        for (String juego : juegos) {
            System.out.println(juego);
        }

        int cantidadJuegos = juegos.size();
        System.out.println("\n///////////////////////////////////////////////");
        System.out.println("Cantidad de juegos en el listado: \n" + cantidadJuegos);

    //aguante el pillarse o paco y al ladron xd

    }
}