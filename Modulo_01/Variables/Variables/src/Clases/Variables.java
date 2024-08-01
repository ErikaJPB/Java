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

	// TIPOS ESTRUCTURADOS DEFINIDOS POR EL USUARIO

	// Variable de tipo persona (Persona es una clase)
	// Persona P;
	// Variable de tipo animal (Animal es una clase)
	// Animal A;
	// Variable de Java de la clase Math
	// Math M;
	// Variable de Java de la clase Scanner
	// Scanner S;
	// Variable de Java de la clase BufferedReader
	// BufferedReader B;

	// CONSTANTES

	// Tendra la palabra clave final para ser definida.
	final int documento = 921474159;
	final char letraA = 'A', letraB = 'B', letraC = 'C';
	final String acronimo = "CC";

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

		System.out.println("documento: " + documento);
		System.out.println("letraA: " + letraA);
		System.out.println("letraB: " + letraB);
		System.out.println("letraC: " + letraC);
		System.out.println("acronimo: " + acronimo);
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

	// OPERADORES

	// Operador de asignación (=)

	public static void assignmentOperator() {

		int numero1 = 8;
		int numero2 = numero1;

		System.out.println("La variable numero1 vale: " + numero1);
		System.out.println("La variable numero2 vale: " + numero2);

	}

	// Operadores aritméticos (+ - * / %)

	public static void arithmeticOperators() {

		long numero1 = 8;
		int numero2 = 13;
		long resta = numero1 - numero2;

		System.out.println("El resultado es " + resta);

		int numero3 = 3;
		int numero4 = 52;

		int suma = numero3 + numero4;

		System.out.println("El resultado es " + suma);

		double numero5 = 7.6;
		int numero6 = 4;
		double multiplicacion = numero5 * numero6;

		System.out.println("El resultado es " + multiplicacion);

		float numero7 = 2.3F;
		int numero8 = 5;
		float division = numero7 / numero8;

		System.out.println("El resultado es " + division);

	}

	public static void basicArithmeticOperators() {
		int numero1 = 12;
		int numero2 = 2;
		double division;
		int suma, resta, multiplicacion;
		double modulo;
		double operacion;

		operacion = 9 / 3 * 5 - 3 + 8 * 2;
		System.out.println("El resultado de la operación es: " + operacion);

		// División
		division = numero1 / numero2;
		System.out.println("El resultado de la división es: " + division);

		// Suma
		suma = numero1 + numero2;
		System.out.println("El resultado de la suma es: " + suma);

		// Resta
		resta = numero1 - numero2;
		System.out.println("El resultado de la resta es: " + resta);

		// Multiplicación
		multiplicacion = numero1 * numero2;
		System.out.println("El resultado de la multiplicación es: " + multiplicacion);

		// Módulo
		modulo = numero1 % numero2;
		System.out.println("El resultado del módulo es: " + modulo);
	}

	// Operadores Aritmeticos Incrementales

	public static void unaryOperators() {

		// ++A Incrementa el valor y luego utiliza la variable

		int a = 5;
		int b = ++a;

		System.out.println(a);
		System.out.println(b);

		// A++ Utiliza la variable y luego incrementa el valor

		int c = 5;
		int d = c++;

		System.out.println(c);
		System.out.println(d);

		// --A Decrementa el valor y luego utiliza la variable

		int e = 5;
		int f = --e;

		System.out.println(e);
		System.out.println(f);

		// A-- Utiliza la variable y luego decrementa el valor
		int g = 5;
		int h = g--;

		System.out.println(g);
		System.out.println(h);

	}

	// Operadores Aritmeticos Combinados

	public static void compoundAssignmentOperators() {

		// += Suma combinada

		int a = 5;
		int b = 2;

		b += a;

		System.out.println(b);

		// -= Resta combinada

		int c = 5;
		int d = 2;

		d -= c;

		System.out.println(d);

		// *= Multipliación combinada

		int e = 5;
		int f = 2;

		f *= e;

		System.out.println(f);

		// /= División combinada

		int g = 5;
		double h = 2;

		h /= g;

		System.out.println(h);

		// %= Módulo combinado

		int i = 5;
		int j = 2;

		j %= i;

		System.out.println(j);

	}

	// Operadores de relación

	public static void relationalOperators() {

		// Igual que (==)

		boolean igualQue = 5 == 4;
		System.out.println(igualQue);

		// Diferente que (!=)

		boolean distintoQue = 4 != 2;
		System.out.println(distintoQue);

		// Menor que (<)

		boolean menorQue = 5 < 3;
		System.out.println(menorQue);

		// Mayor que (>)

		boolean mayorQue = 5 > -5;
		System.out.println(mayorQue);

		// Menor o igual que (<=)

		boolean menorIgualQue = 2 <= 3;
		System.out.println(menorIgualQue);

		// Mayor o igual que (>=)

		boolean mayorIgualQue = 3 >= 9;
		System.out.println(mayorIgualQue);

	}

	@SuppressWarnings("unused")
	public static void logicalOperators() {
		// Negación - Unario (!)
		boolean negacion = !false;
		System.out.println(negacion);

		// Suma lógica - Binario (|)
		boolean sumaLogica = true | false;
		System.out.println(sumaLogica);

		// Suma lógica exclusiva (^)
		boolean sumaLogicaExclusiva = (5 == 4) ^ (5 < 4);
		System.out.println(sumaLogicaExclusiva);

		// Producto lógico - Binario (&)
		boolean productoLogico = (5 == 6) & (5 < 4);
		System.out.println(productoLogico);

		// Suma lógica cortocircuito (||)
		boolean sumaLogicaCortocircuito = true || false;
		System.out.println(sumaLogicaCortocircuito);

		// Producto lógico cortocircuito (&&)
		boolean productoLogicoCortocircuito = (5 == 4) && (5 < 4);
		System.out.println(productoLogicoCortocircuito);
	}

	public static void conditionalOperator() {

		// Operador condicional (?:)

		int a = 4;
		int b = a == 4 ? a + 5 : 6 - a;
		System.out.println(b);
		b = a > 4 ? a * 4 : a + 8;
		System.out.println(b);

	}

	public static void concatenationOperator() {

		// Operador de concatenación (+)

		String saludo = "Hola" + "Juan";
		System.out.println(saludo);

	}

	public static void separators() {

		// Parentesis () - Permite modificar la prioridad de la expresion
		// contener expresionaes para el control del flujo y realizar
		// conversiones de tipo.

		int suma = (5 + 9) * 2;
		System.out.println(suma);

		// Llaves {}
		// Permite definir bloques de código y ambitos y contener los valores
		// iniciales de un array

		// Corchetes []
		// Permite declarar bloques de array (vectores o matrices) y referenciar
		// sus elementos.

		int arreglo[] = { 2, 9 };
		System.out.println(Arrays.toString(arreglo));

		// Punto y coma ;
		// Permite separar sentencias

		// Coma ,
		// Permite separar identificadores consecutivos en la declaración de variables
		// y en las listas de parametros. Tambien se emplea para encadenar sentencias
		// en un ciclo for.

		// int a, b, c;

		// Punto .
		// Permite separar el nombre de un atributo o método de su instancia de
		// referencia.
		// Tambien separa el identificador de un paquete de los subpaquetes y clases.

		double euler = Math.E;
		System.out.println(euler);
	}

	public static void mathClass() {

		// Math

		double valorPi = Math.PI;
		System.out.println(valorPi);

		double raiz = Math.sqrt(25);
		System.out.println(raiz);

		// Valor absoluto
		System.out.println("Valor absoluto = " + Math.abs(-123));

		// Hipotenusa
		System.out.println("Hipotenusa = " + Math.hypot(15, 9));

		// Logaritmo Natural
		System.out.println("Logaritmo Natural = " + Math.log(4));

		// Numero mayor
		System.out.println("Número mayor = " + Math.max(4, 9));

		// Numero menor
		System.out.println("Número menor = " + Math.min(4, 9));

		// Potencia
		System.out.println("Potencia = " + Math.pow(5, 4));

		// Numero Aleatorio
		System.out.println("Número aleatorio = " + Math.random() * 100);

		// Numero Redondeado
		System.out.println("Número redondeado = " + Math.round(Math.random() * 10));

		// Raiz cuadrada
		System.out.println("Raiz cuadrada = " + Math.sqrt(121));

	}

	public static void main(String[] args) {
		Variables variables = new Variables();
		variables.printVariables();
		assignmentOperator();
		arithmeticOperators();
		basicArithmeticOperators();
		unaryOperators();
		compoundAssignmentOperators();
		relationalOperators();
		logicalOperators();
		conditionalOperator();
		concatenationOperator();
		separators();
		mathClass();

	}

}
