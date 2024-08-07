package Matrices;

public class Matrices {

    public static void main(String[] args) {

        // MATRICES

        // Son una estructura de datos que permite almacenar un grupo de datos de un
        // mismo tipo,
        // pero de una manera bidimensional, de forma que se representan como una tabla
        // con un
        // vector para filas y otro para columnas.

        // Formas de declarar una matriz

        // Forma 1
        int matrizNumeros1[][] = new int[4][5];
        System.out.println(matrizNumeros1[0]);

        // Forma 2
        int[][] matrizNumeros2 = new int[4][5];
        System.out.println(matrizNumeros2[0]);

        // Forma 3
        int[][] matrizNumeros3 = new int[4][5];
        System.out.println(matrizNumeros3[1]);

        // Forma 4
        int matrizNumeros4[][];

        // Forma 5
        int matrizNumeros5[][] = {};

        // Forma 6
        int matrizNumeros6[][] = { { 1, 2 }, { 3, 9 } };
        System.out.println(matrizNumeros6[0]);

        // Forma 7
        int matrizNumeros7[][] = new int[][] { { 6, 2 }, { 2, 7 } };
        System.out.println(matrizNumeros7[0]);

        // Estructura de la matriz

        int numeros[][] = new int[2][2];

        // Recordar que el tamaño de la matriz no puede volver a definirse.

        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[1][0] = 6;
        numeros[1][1] = 7;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
                // 1 2
                // 6 7
            }

            System.out.println();
        }

        // La matriz puede ser de N*M posiciones, siendo estos cualquier numero entero.

        String nombres[][] = new String[20][40];

        // Matrices sin datos se representan:

        // 1. Numeros - se inicializan en 0
        int numerosMatriz[][] = new int[27][92];
        System.out.println(numerosMatriz[20][9]); // 0

        // 2. Strings - se inicializan en null
        String notas[][] = new String[27][92];
        System.out.println(notas[20][9]); // null

        // 3. Booleanos - se inicializan en false
        boolean estados[][] = new boolean[20][10];
        System.out.println(estados[5][5]);// false

        // Las matrices se pueden declarar o declarar e inicializar
        // como ocurre con las variables

        int edadesDec[][] = new int[2][3];
        int edadesInit[][] = { { 19, 18, 16 }, { 15, 14, 12 }, { 12, 11, 8 }, { 22, 30, 44 } };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(edadesInit[i][j] + " ");
                // 19 18 16
                // 15 14 12
                // 12 11 8
            }
            System.out.println("");
        }

        // Ejercicios

        // 1. Dada una matriz de 5 * 4 que almacene numeros aleatorios entre 0 y 100 en
        // todas sus posiciones.
        // Imprimir la matriz en forma de tabla.

        int matrizNumeros[][] = new int[5][4];
        int suma = 0;
        int resta = 0;
        int multiplicacion = 1;
        double division;
        double raiz;

        for (int i = 0; i < 5; i++) // recorre filas
        {
            for (int j = 0; j < 4; j++) // recorre columnas
            {
                matrizNumeros[i][j] = (int) Math.ceil(Math.random() * 100); // inserta datos

            }

        }

        for (int i = 0; i < 5; i++) // recorre filas
        {
            for (int j = 0; j < 4; j++) // recorre columnas
            {
                System.out.print(matrizNumeros[i][j] + " "); // imprime datos
                // 40 83 29 58
                // 4 97 22 16
                // 6 35 90 96
                // 80 88 45 80
                // 37 97 73 17
            }
            System.out.println();
        }

        // 2. Con base en el anterior ejercicio, realizar las sgtes operaciones
        // - Sumar todos los valores
        // - Restar todos los valores
        // - Multiplicar todos los valores
        // - Raiz cuadrada de la suma de todos los valores
        // - Division de la multiplicacion por la suma.

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                suma = suma + matrizNumeros[i][j];
                resta = resta - matrizNumeros[i][j];
                multiplicacion = multiplicacion * matrizNumeros[i][j];
            }

        }

        division = multiplicacion / suma;
        raiz = Math.sqrt(suma);

        System.out.println("La suma es: " + suma); // La suma es: 1093
        System.out.println("La resta es: " + resta); // La resta es: -1093
        System.out.println("La multiplicacion es: " + multiplicacion); // La multiplicacion es: 536870912
        System.out.println("La division es: " + division); // La division es: 491190.0
        System.out.println("La raiz cuadrada es: " + raiz); // La raiz cuadrada es: 33.06055050963308

    }

}