public class Utilidad {

    // limpiar la pantalla
    public static void limpiarPantalla() {
        // Este método intenta limpiar la pantalla de la consola
        // Utiliza secuencias de escape ANSI
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // pausar el programa por un tiempo
    public static void esperar(int segundos) {
        //metodo que pausa el programa
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            System.out.println("error al pausar el programa.");
        }
    }
}
