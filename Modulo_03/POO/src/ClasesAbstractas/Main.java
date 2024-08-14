package ClasesAbstractas;

public class Main {

    public static void main(String[] args) {

        // En la ejecucion de ambas clases se invoca el metodo getColor() definido e
        // implementado desde la superclase figura.
        // El metodo abstracto calcularArea() se implemento en cada una de las subclases
        // (cuadrado y triangulo)

        String colorDelCuadrado = "Verde";
        double ladoDelCuadrado = 2.5;

        Cuadrado cuadradoVerde = new Cuadrado(colorDelCuadrado, ladoDelCuadrado);

        System.out.println("El area del cuadrado " + cuadradoVerde.getColor() + " es: " + cuadradoVerde.calcularArea());

        String colorDelTriangulo = "Amarillo";
        double baseDelTriangulo = 8.3;
        double alturaDelTriangulo = 2.5;

        Triangulo trianguloAmarillo = new Triangulo(colorDelTriangulo, baseDelTriangulo, alturaDelTriangulo);

        System.out.println(
                "El area del triangulo " + trianguloAmarillo.getColor() + " es: " + trianguloAmarillo.calcularArea());
    }

}