public class Minibus extends Bus {
    private String tipoViaje;

    public Minibus(String color, String patente, int cantidadDeAsientos, String tipoViaje) {
        super(color, patente, cantidadDeAsientos);
        this.tipoViaje = tipoViaje;
    }

    public String getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    public void imprimeBus() {
        System.out.println("Color: " + getColor());
        System.out.println("Patente: " + getPatente());
        System.out.println("Cantidad de Asientos: " + getCantidadDeAsientos());
        System.out.println("Tipo de Viaje: " + tipoViaje);
    }
}
