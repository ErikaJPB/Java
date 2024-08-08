package ClasesWhile;

public class Ejercicio2 {

    public static void main(String[] args) {

        // Desarrollar un programa que determine si una palabra establecida
        // previamente es o no palíndroma.

        String palabra = "reconocer";
        boolean esPalindromo = true;

        int inicio = 0;
        int fin = palabra.length() - 1;

        while (inicio < fin) {
            if (palabra.charAt(inicio) != palabra.charAt(fin)) {
                esPalindromo = false;
                break;
            }
            inicio++;
            fin--;
        }

        if (esPalindromo) {
            System.out.println(palabra + " es un palíndromo.");
            // reconocer es un palíndromo.
        } else {
            System.out.println(palabra + " no es un palíndromo");
        }
    }

}