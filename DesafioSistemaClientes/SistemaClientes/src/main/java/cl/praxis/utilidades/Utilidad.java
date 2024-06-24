package cl.praxis.utilidades;

public class Utilidad {

    public static void limpiarPantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static void pausar(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
