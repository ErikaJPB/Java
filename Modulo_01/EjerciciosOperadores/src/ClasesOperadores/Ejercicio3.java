package ClasesOperadores;

public class Ejercicio3 {

	public static void main(String[] args) {

		int numeroUno = 8;
		int numeroDos = 2;

		System.out.println("Valores iniciales:");
		System.out.println("numeroUno " + numeroUno);
		System.out.println("numeroDos " + numeroDos);

		int aux = numeroUno;
		numeroUno = numeroDos;
		numeroDos = aux;

		System.out.println("Valores despues de intercambiar:");
		System.out.println("numeroUno " + numeroUno);
		System.out.println("numeroDos " + numeroDos);

	}

}
