public class Taxi {
    private int valorPasaje;

    public Taxi(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    public int getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    public int pagarPasaje(int monto) {
        if (monto >= valorPasaje) {
            return monto - valorPasaje;
        } else {
            return valorPasaje;
        }
    }

}

