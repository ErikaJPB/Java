package ClasesFor;

public class Ejercicio4 {

    public static void main(String[] args) {

        // Desarrollar un programa que realice la sumatoria de todas las iteraciones
        // de un ciclo desde 0 hasta un numero entero definido previamente, al resultado
        // de la suma realizar las sgtes operaciones

        // Raiz cuadrada
        // Generar un num aleatorio entre 1 y la suma de las iteraciones.
        // Determinar los divisores
        // Hallar la factorial
        // Definir si es un numero perfecto

        int numero = 3;
        int suma = 0;

        for (int i = 0; i <= numero; i++) {
            suma = suma + i;
        }

        System.out.println("La suma de las iteraciones de 0 hasta " + numero + " es: " + suma);
        // La suma de las iteraciones de 0 hasta 3 es: 6
        System.out.println("La raiz cuadrada de la sumatoria es: " + Math.sqrt(suma));
        // La raiz cuadrada de la sumatoria es: 2.449489742783178

        double aleatorio = Math.ceil(Math.random() * suma);
        int numeroAleatorio = (int) aleatorio;
        System.out.println("El numero aleatorio entre 1 y " + suma + " es: " + numeroAleatorio);
        // El numero aleatorio entre 1 y 6 es: 3

        System.out.println("Los divisores de " + suma + " son: ");
        // Los divisores de 6 son:
        for (int i = 1; i <= suma; i++) {
            if (suma % i == 0) {
                System.out.println(i);
                // 1
                // 2
                // 3
                // 6
            }
        }

        long factorial = 1;
        for (int i = 1; i <= suma; i++) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de la sumatoria: " + factorial);
        // El factorial de la sumatoria: 720

        int sumaDivisores = 0;
        for (int i = 1; i < suma; i++) {
            if (suma % i == 0) {
                sumaDivisores = sumaDivisores + i;
            }
        }

        if (sumaDivisores == suma) {
            System.out.println(suma + " es un número perfecto.");
            // 6 es un número perfecto.
        } else {
            System.out.println(suma + " no es un número perfecto.");
        }
    }

}