package Clases;

import java.util.Arrays;

public class Variables {
	// NUMEROS ENTEROS

	// byte: Emplea un solo byte (8 bits) de almacenamiento.
	// Esto permite almacenar valores entre [-128, 127]
	byte numeroByte = 9;

	// short: Emplea el doble almacenamiento de (byte)
	// Esto permite almacenar valores entre [-32.768, 32.767]
	short numeroShort = 32767;

	// int: Emplea un tamaño mayor, 4 bytes (32 bits)
	// Esto permite alcanzar valores entre [-2147483648, 2147483647]
	int numeroInt = 41825;

	// long: Emplea el tamaño mayor de todos los enteros, 8 bytes (64 bits)
	// Esto permite almacenar valores entre [-9223372036854775808,
	// 9223372036854775807]
	long numeroLong = 926465464697266565L;

	// NUMEROS FLOTANTES

	// float: Emplea un tamaño de 32 bits (4 bytes).
	// Esto permite almacenar valores entre [-3.4028234E+8, 1.40239846E-45]
	float numeroFloat = 5976464F;

	// double: Emplea un tamaño de 64 bits (8 bytes).
	// Esto permite almacenar valores entre [-1.7976931348623157E+309,
	// 4.94065645841246544E-324]
	double numeroDouble = 2654792142478F;

	// BOOLEANOS Y CARACTERES

	// boolean: Se emeplea con la finalidad de trabajar con valores
	// verdaderos/falsos (booleanos)
	// Se traducen sus valores en true/false
	boolean variableBoolean = true;

	// char: Se emplea para almacenar caracteres individuales (letras, aunque puede
	// contener numeros)
	// Utiliza 16 bits y se codifica sobre UTF-16 Unicode.
	char numeroChar = 1;
	char letraChar = 'D';

	
	// DATOS ESTRUCTURADOS

	// CADENAS DE CARACTERES

	// String: Se emplea creando una instancia de la clase String,
	// aunque parezca trabajar con datos primitivos.
	String variableString = "Hola a todos";

	// VECTORES - ARRAYS

	// Vector - Arreglo: Se emplea para almacenar
	// un grupo de datos del mismo tipo.

	// Forma 1
	int vectorNumeros1[] = new int[10];
	// Forma 2
	int[] vectorNumeros2 = new int[10];
	// Forma 3
	int[] vectorNumeros3 = new int[10];
	// Forma 4
	int vectorNumeros4[];
	// Forma 5
	int vectorNumeros5[] = {};
	// Forma 6
	int vectorNumeros6[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
	// Forma 7
	int vectorNumeros7[] = new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

	// Matriz: Se emplea para almacenar un grupo de datos del mismo
	// de forma bidimensional basados en [x], [y].

	// Forma 1
	int matrizNumeros1[][] = new int[4][5];
	// Forma 2
	int[][] matrizNumeros2 = new int[4][5];
	// Forma 3
	int[][] matrizNumeros3 = new int[4][5];
	// Forma 4

	// int matrizNumeros4[][];
	
	// Forma 5
	int matrizNumeros5[][] = {};
	// Forma 6
	int matrizNumeros6[][] = { { 1, 2 }, { 3, 9 } };
	// Forma 7
	int matrizNumeros7[][] = new int[][] { { 6, 2 }, { 2, 7 } };

	public void printVariables() {
		System.out.println("byte: " + numeroByte);
		System.out.println("short: " + numeroShort);
		System.out.println("int: " + numeroInt);
		System.out.println("long: " + numeroLong);
		System.out.println("float: " + numeroFloat);
		System.out.println("double: " + numeroDouble);
		System.out.println("boolean: " + variableBoolean);
		System.out.println("char (numero): " + numeroChar);
		System.out.println("char (letra): " + letraChar);
		System.out.println("String: " + variableString);

		System.out.println("Vector: " + Arrays.toString(vectorNumeros1));
		System.out.println("Vector: " + Arrays.toString(vectorNumeros2));
		System.out.println("Vector: " + Arrays.toString(vectorNumeros3));
		System.out.println("Vector: " + Arrays.toString(vectorNumeros4));
		System.out.println("Vector: " + Arrays.toString(vectorNumeros5));
		System.out.println("Vector: " + Arrays.toString(vectorNumeros6));
		System.out.println("Vector: " + Arrays.toString(vectorNumeros7));

		printMatrix("matrizNumeros1", matrizNumeros1);
        printMatrix("matrizNumeros2", matrizNumeros2);
        printMatrix("matrizNumeros3", matrizNumeros3);
       // printMatrix("matrizNumeros4", matrizNumeros4);
        printMatrix("matrizNumeros5", matrizNumeros5);
        printMatrix("matrizNumeros6", matrizNumeros6);
        printMatrix("matrizNumeros7", matrizNumeros7);
	}
		public static void printMatrix(String name, int[][] matrix) {
			System.out.println("Matrix: " + name);
            for (int[] matrix1 : matrix) {
                for (int j = 0; j < matrix1.length; j++) {
                    System.out.print(matrix1[j] + " ");
                }
                System.out.println();
            }
			System.out.println();
		}

	
	public static void main(String[] args) {
		Variables variables = new Variables();
		variables.printVariables();
	}

}
