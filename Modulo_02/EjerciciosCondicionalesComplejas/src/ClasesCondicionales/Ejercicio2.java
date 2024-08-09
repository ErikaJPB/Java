package ClasesCondicionales;

public class Ejercicio2 {

    public static void main(String[] args) {

        // Desarrollar un programa que permita determinar la cantidad de cifras
        // de un número X teniendo en cuenta que el número únicamente puede
        // tener 4 cifras. Mostrar un mensaje por defecto si el número supera las
        // 4 cifras.

        int numero = 2164;

        int cantidadCifras = (int) (Math.log10(numero) + 1);

        if (cantidadCifras <= 4) {
            System.out.println(cantidadCifras + " cifras");
        } else {
            System.out.println("El numero tiene más de 4 cifras");
        }

    }

}
