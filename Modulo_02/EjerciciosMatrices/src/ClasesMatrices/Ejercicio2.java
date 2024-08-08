package ClasesMatrices;

public class Ejercicio2 {
    public static void main(String[] args) {

        // Desarrollar un programa que dada una matriz de números enteros
        // entre 0 – 50 de 5*3, hallar el número mayor almacenado:
        // - Puedes utilizar variables auxiliares.

        int filas = 5;
        int columnas = 3;
        int matriz[][] = new int[filas][columnas];
        int mayor = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random() * 51);
                if (mayor < matriz[i][j]) {
                    mayor = matriz[i][j];
                }
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
                // 24 47 40
                // 40 13 20
                // 28 13 14
                // 26 27 25
                // 36 2 10
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("El número mayor es: " + mayor);
        // El número mayor es: 47
    }
}
