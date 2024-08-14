package ClasesInterfaces;

public class Main {

    public static void main(String[] args) {

        // Ejecucion de la clase BarcoPirata que usa la interfaz Barco. Aqui se han
        // invocado los metodos definidos
        // en la interfaz, asi como se ha hecho uso de los atributos y metodos de la
        // clase.
        BarcoPirata sunny = new BarcoPirata();

        sunny.setX(450);
        sunny.setY(180);

        sunny.moverPosicion(50, 20);
        sunny.conocerPosicion();

        sunny.disparar();
    }

}
