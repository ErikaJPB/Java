package ClasesAbstractas;

public class Triangulo extends Figura {

    // Atributos
    private double base;
    private double altura;

    // Constructor
    public Triangulo(String color, double base, double altura) {
        // se usa super porque el color viene de la clase figura
        super(color);
        this.base = base;
        this.altura = altura;
    }

    // Metodo, se implementa para el triangulo
    public double calcularArea() {
        return (base * altura) / 2;
    }

    public static void main(String[] args) {

    }

}
