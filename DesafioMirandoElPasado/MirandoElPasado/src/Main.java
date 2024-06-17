import java.util.ArrayList;

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
        System.out.print("\n///////////////////////////////////////////////");
        System.out.println("\nmarcas en la Lista: " + cantidadMarcas);

    }
}