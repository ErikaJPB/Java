package ClasesAbstractas;

public class Cuadrado extends Figura {

    // Nuevo atributo
    private double lado;

    // Constructor
    public Cuadrado(String color, double lado) {
        // se usa super porque el color viene de la clase figura
        super(color);
        this.lado = lado;
    }

    // Metodo se implementa para el cuadrado
    public double calcularArea() {
        return lado * lado;
    }

    public static void main(String[] args) {

    }

}