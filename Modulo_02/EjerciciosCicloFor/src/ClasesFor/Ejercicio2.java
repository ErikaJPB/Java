package ClasesFor;

public class Ejercicio2 {

    public static void main(String[] args) {

        // Desarrollar un programa que determine los divisores de un numero
        // definido previamente.

        int numero = 26;

        System.out.println("Los divisores de " + numero + " son: ");
        // Los divisores de 26 son:

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.print(i + " ");
                // 1 2 13 26
            }
        }
    }

}