package ClasesOperadores;

public class Ejercicio6 {

    public static void main(String[] args) {

        int ladoCuadrado = 8;

        int areaCuadrado = ladoCuadrado * ladoCuadrado;

        int perimetroCuadrado = ladoCuadrado * 4;

        System.out.println("Área del cuadrado: " + areaCuadrado);
        System.out.println("Perímetro del cuadrado: " + perimetroCuadrado);

        int baseTriangulo = 9;
        int alturaTriangulo = 8;

        int ladoUnoTriangulo = 8;
        int ladoDosTriangulo = 8;

        double areaTriangulo = 0.5 * baseTriangulo * alturaTriangulo;
        int perimetroTriangulo = baseTriangulo + ladoUnoTriangulo + ladoDosTriangulo;

        System.out.println("Área del triángulo: " + areaTriangulo);
        System.out.println("Perímetro del triángulo: " + perimetroTriangulo);

        int baseRectangulo = 8;
        int alturaRectangulo = 6;

        int areaRectangulo = baseRectangulo * alturaRectangulo;
        int perimetroRectangulo = 2 * (baseRectangulo + alturaRectangulo);

        System.out.println("Área del rectángulo: " + areaRectangulo);
        System.out.println("Perímetro del rectángulo: " + perimetroRectangulo);

    }

}