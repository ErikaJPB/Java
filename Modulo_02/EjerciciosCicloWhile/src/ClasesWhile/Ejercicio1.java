package ClasesWhile;

public class Ejercicio1 {

    public static void main(String[] args) {

        // Desarrolla un programa que permita invertir la palabra “Programación”.
        // El resultado debe ser “nóicamargorP”

        String palabra = "Programación";
        String resultado = "";

        int indice = palabra.length() - 1;

        while (indice >= 0) {
            resultado = resultado + palabra.charAt(indice);
            indice--;
        }

        System.out.println(resultado);

    }

}
