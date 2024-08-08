package ClasesFor;

public class Ejercicio3 {

    public static void main(String[] args) {
       

        // Desarrollar un programa que permita definir si un numero entero
        // ya establecido es un numero perfecto o no.

        int numero = 8;

        int sumaDivisores = 0;

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sumaDivisores = sumaDivisores + i;
            }
        }

        if (sumaDivisores == numero) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
            // 8 no es un número perfecto.
        }

    }

}
