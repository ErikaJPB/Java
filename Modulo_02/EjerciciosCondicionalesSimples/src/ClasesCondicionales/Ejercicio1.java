package ClasesCondicionales;

public class Ejercicio1 {

    public static void main(String[] args) {

        // Desarrollar un algoritmo que genere un número aleatorio de 1 a 100
        // (Math.random) y por medio de una condicional determinar sí el número
        // es menor a 50 o mayor.

        int numero = (int) (Math.random() * 100);

        if (numero > 50) {
            System.out.println("El número " + numero + " es mayor a 50.");
        } else {
            System.out.println("El número " + numero + " es menor a 50.");
        }
    }

}
