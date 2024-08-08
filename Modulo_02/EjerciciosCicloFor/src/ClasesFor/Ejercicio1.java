package ClasesFor;

public class Ejercicio1 {

    public static void main(String[] args) {

        // Desarrollar un programa que permita mostrar el factorial de un numero
        // definido previamente.

        int numero = 8;
        long factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);

    }

}