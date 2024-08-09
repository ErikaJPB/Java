package ClasesCondicionales;

public class Ejercicio1 {

    public static void main(String[] args) {

        // Desarrollar un programa que permita por medio de la edad de una
        // persona, determinar la categoría en la que pertenece a raíz de la
        // siguiente tabla:

        // Rango de edad Categoría
        // 0 - 5 Infante
        // 6 - 10 Niño
        // 11 - 15 Pre adolescente
        // 16 - 18 Adolescente
        // 19 - 25 Pre adulto
        // 26 - 40 Adulto
        // 41 - 55 Pre anciano
        // 56+ Anciano

        int edad = 10;

        if (edad >= 0 && edad <= 5) {
            System.out.println("Infante");
        } else if (edad >= 6 && edad <= 10) {
            System.out.println("Niño");

        } else if (edad >= 11 && edad <= 15) {
            System.out.println("Preadolescente");
        } else if (edad >= 16 && edad <= 18) {
            System.out.println("Adolescente");
        } else if (edad >= 19 && edad <= 25) {
            System.out.println("Preadulto");
        } else if (edad >= 26 && edad <= 40) {
            System.out.println("Adulto");
        } else if (edad >= 41 && edad <= 55) {
            System.out.println("Preanciano");
        } else if (edad >= 56) {
            System.out.println("Anciano");
        }

    }

}
