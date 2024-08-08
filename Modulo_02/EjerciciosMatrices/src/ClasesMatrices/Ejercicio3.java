package ClasesMatrices;

public class Ejercicio3 {
    public static void main(String[] args) {

        // Desarrollar un programa que dada una matriz 3*4 con números
        // aleatorios, imprimir de la matriz sólo lo siguiente:
        // - La primera fila
        // - La segunda columna
        // - La tercera fila

        int filas = 3;
        int columnas = 4;

        int matriz[][] = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random() * 25);
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
                // 5 1 1 16
                // 3 6 4 11
                // 4 12 7 7
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Primera Fila");
        // Primera Fila
        for (int i = 0; i < columnas; i++) {
            System.out.print(matriz[0][i] + " ");
            // 5 1 1 16

        }
        System.out.println();
        System.out.println();
        System.out.println("Segunda Columna");
        // Segunda Columna

        for (int i = 0; i < filas; i++) {
            System.out.println(matriz[i][1]);
            // 1
            // 6
            // 12
        }
        System.out.println();
        System.out.println();
        System.out.println("Tercera fila");
        // Tercera fila

        for (int i = 0; i < columnas; i++) {
            System.out.print(matriz[2][i] + " ");
            // 4 12 7 7
        }

        System.out.println();

    }
}
