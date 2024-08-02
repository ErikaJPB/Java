package ClaseMath;

public class Ejercicio2 {

	public static void main(String[] args) {

		double[] numeros = { 2, 8, 9, 27, 28, 55, 121 };

		for (double numero : numeros) {
			double raizCuadrada = Math.sqrt(numero);
			System.out.println("La raiz cuadrada de " + numero + " es " + raizCuadrada);
		}
	}

}