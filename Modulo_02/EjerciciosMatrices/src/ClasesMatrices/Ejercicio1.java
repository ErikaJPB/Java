package ClasesMatrices;

public class Ejercicio1 {

    public static void main(String[] args) {

        // Desarrollar un programa que por medio de tres (3) matrices de N*M
        // (Determinar el tamaño, igual para las 3 matrices):
        // -Almacenar números pares aleatorios entre 0 y 100 en la primera matriz.
        // -Almacenar números impares aleatorios entre 0 y 50 en la segunda matriz.
        // -Almacenar la suma de los valores de ambas matrices en la tercera matriz.

        int filas = 3;
        int columnas = 3;
        int aux = 0;

        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];
        int[][] matriz3 = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                aux = (int) (Math.random() * 100);
                if (aux % 2 == 0) {
                    matriz1[i][j] = aux;
                } else {
                    j--;
                }
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                aux = (int) (Math.random() * 50);
                if (aux % 2 != 0) {
                    matriz2[i][j] = aux;
                } else {
                    j--;
                }
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("Matriz 1: Valores 0 a 100");
        // Matriz 1: Valores 0 a 100
        System.out.println();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz1[i][j] + " ");
                // 20 34 8
                // 62 70 46
                // 36 44 60
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Matriz 2: Valores 0 a 50");
        // Matriz 2: Valores 0 a 50
        System.out.println();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz2[i][j] + " ");
                // 43 35 7
                // 29 1 35
                // 5 29 5
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Matriz 3 - Suma de las dos matrices");
        // Matriz 3 - Suma de las dos matrices
        System.out.println();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz3[i][j] + " ");
                // 63 69 15
                // 91 71 81
                // 41 73 65
            }
            System.out.println();
        }

    }

}
