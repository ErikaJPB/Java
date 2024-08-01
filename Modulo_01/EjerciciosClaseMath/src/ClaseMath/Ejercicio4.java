package ClaseMath;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double numero1 = 1 + Math.random()*49;
		double numero2 = 1 + Math.random()*49;
		
		double numero1Redondeado = Math.floor(numero1);
		double numero2Redondeado = Math.ceil(numero2);
		
		System.out.println("Numero 1 redondeado con floor: " + numero1Redondeado);
		System.out.println("Numero 2 redondeado con ceil: " + numero2Redondeado);
	
		
		
		double numeroMayor = Math.max(numero1Redondeado, numero2Redondeado);
		System.out.println("El numero mayor es: " + numeroMayor);
	}
		

}
