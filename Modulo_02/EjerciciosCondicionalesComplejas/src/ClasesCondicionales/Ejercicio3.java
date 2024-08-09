package ClasesCondicionales;

public class Ejercicio3 {

    public static void main(String[] args) {

        // Desarrollar un programa que, por medio de 3 números enteros,
        // determinar cuál es el mayor.

        int numero1 = 20;
        int numero2 = 4689;
        int numero3 = 521;

        int numeroMayor = numero1;

        if (numero2 > numeroMayor) {
            numeroMayor = numero2;
        }

        if (numero3 > numeroMayor) {
            numeroMayor = numero3;
        }

        System.out.println("El número mayor es: " + numeroMayor);

    }

}