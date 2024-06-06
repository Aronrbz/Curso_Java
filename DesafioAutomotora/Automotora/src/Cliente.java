public class Cliente extends Persona {
    private int edad;

    public Cliente(String rut, String nombre, int edad) {
        super(rut, nombre, edad);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
