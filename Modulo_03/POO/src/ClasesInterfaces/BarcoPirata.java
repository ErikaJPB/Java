package ClasesInterfaces;

public class BarcoPirata implements Barco {

    // En la clase BarcoPirata se implementa la interfaz. Esta automaticamente exige
    // e implementa los metodos declarados en la interfaz
    // para su posterior definicion.

    private int x;
    private int y;

    // getters and setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Metodos
    public void conocerPosicion() {
        System.out.println("La posicion actual es: " + x + " - " + y);
    }

    // Implementacion del metodo moverPosicion()
    @Override
    public void moverPosicion(int x, int y) {
        this.x = this.x - x;
        this.y = this.y - y;
    }

    // Imnplementacion del metodo disparar()
    @Override
    public void disparar() {
        System.out.println("Disparar cañones");

    }

    public static void main(String[] args) {

    }

}