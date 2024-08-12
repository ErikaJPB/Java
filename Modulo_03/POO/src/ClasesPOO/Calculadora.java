package ClasesPOO;

public class Calculadora {

	private int numero1;
	private String operador;
	private int numero2;

	// Constructor
	// public Calculadora (int numero1, String operador, int numero2)
	// {
	// this.numero1 = numero1;
	// this.operador = operador;
	// this.numero2 = numero2;
	// }

	// Constructor vacio
	// Para asignar los valores se deben usar los getters and setters

	public Calculadora() {

	}

	/**
	 * @param numero1
	 * @param operador
	 * @param numero2
	 */
	public Calculadora(int numero1, String operador, int numero2) {
		this.numero1 = numero1;
		this.operador = operador;
		this.numero2 = numero2;
	}

	public static void main(String[] args) {

		// Paso por valor => Son argumentos de tipo primitivo que contienen el valor
		// exacto de estos.
		// Se caracteriza por el uso de tipos primitivos que permite el paso de valores
		// exactos a los metodos.

		// Calculadora Operaciones = new Calculadora();
		// int resultado = Operaciones.sumar(9,4);
		// System.out.println(resultado);
		//
		// }
		//
		// public int sumar(int numero1, int numero2)
		// {
		// return numero1 + numero2;
		// }

		// Paso por referencia => Son argumentos de tipo objeto, arreglo, entre otros,
		// que no contienen los valores de estos,
		// sino su respectiva direccion en memoria.

		//
		// Calculadora Operaciones = new Calculadora();
		// int numeros[] = {9,2,8,1,0,9};
		// int resultado = Operaciones.sumarVector(numeros);
		// System.out.println(resultado);

		// Calculadora Operaciones = new Calculadora(9, "+", 8);

		Calculadora Operaciones = new Calculadora();
		Operaciones.setNumero1(9);
		Operaciones.setOperador("+");
		Operaciones.setNumero2(8);
		System.out.println(Operaciones.operacion());
	}

	// getters and setters
	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public String getOperador() {
		return operador;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public String operacion() {
		return this.getNumero1() + " " + this.getOperador() + " " + this.getNumero2();
	}

}

// public int sumarVector(int numeros[])
// {
// int suma = 0;
// for (int i = 0; i < numeros.length; i++)
// {
// suma = suma + numeros[i];
// }
// return suma;
// }
