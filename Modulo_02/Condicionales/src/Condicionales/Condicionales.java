package Condicionales;

public class Condicionales {

	public static void main(String[] args) {

		// Estructural condicional - if
		// Evalua una condición que para el correcto funcionamiento retornará un valor
		// booleano.

		if (9 < 12) {
			System.out.println("9 si es menor a 12");
		}

		if (4 > 2)
			System.out.println("4 si es mayor a 2");

		if (9 < 12 && 2 <= 4) {
			System.out.println("9 si es menor a 12");
			System.out.println("2 si es menor a 4");
		}

		// P Q P && Q P || Q !P
		// True True True True False
		// True False False True False
		// False True False True True
		// False False False False True

		boolean p = true;
		boolean q = true;

		// Primera condición donde P Y Q tienen que ser true
		// para cumplir el if correctamente.

		if (p && q) {
			System.out.println("P y Q tienen un valor de true");
		}

		// Segunda condición donde P o Q tienen que ser true para cumplir
		// el if correctamente
		if (p || q) {
			System.out.println("P o Q tienen un valor de true");
		}

		// Tercera condición donde P al ser true y agregar el ! niega el true y lo
		// convierte en false

		if (!p) {
			// Ejecución en caso de que P sea true
			System.out.println("P tiene un valor de true");
		}

		// Estructura condicional - else
		// Complemento del if en caso de que este no sea true, dictamina una secuencia
		// de instrucciones que se deben ejecutar.

		if (true) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		String respuesta1 = "Si";
		String respuesta2 = "No";

		System.out.println("- ¿Quieres un café?");
		System.out.println("* " + respuesta1);

		if (respuesta1 == "Si") {
			System.out.println("- ¿Vas a comprarlo?");
			if (respuesta2 == "Si") {
				System.out.println("* " + respuesta2);
				System.out.println("- Comprar café");
			} else {
				System.out.println("* " + respuesta2);
				System.out.println("- Hacer el café");
			}
			System.out.println("- Beber");
		} else {
			System.out.println("- Sigue estudiando");
		}

		// Equals vs ==

		// Equals compara una cadena de texto contra un objeto que
		// devuelve true si las cadenas son iguales, de lo contrario
		// sera false.

		String nombre = "Erika";

		if (nombre.equals("Erika")) {
			System.out.println("True");
		}

		// El método equals se aplica a objetos y variables
		// El operador == se aplica solo a variables

		// == comprueba si ambos objetos apuntan a la misma ubicacion
		// de memoria y equals evalua la comparacion de valores en los
		// objetos

		String x = new String("Saludo");
		String y = new String("Saludo");

		System.out.println(x == y); // false
		System.out.println(x.equals(y)); // true

		// Estructura condicional - else if
		// si no se cumple la primera condicion, haga lo siguiente siempre y cuando
		// se cumpla la segunda condicion.

		if (false) // Primera condición
		{

		} else if (true) // Segunda condición
		{

		} else // Tercera condición implicita
		{

		}

		// Ejemplo

		int velocidad = 101;

		if (velocidad >= 0 && velocidad <= 30) {
			System.out.println("Zonas Escolares");
		} else if (velocidad > 30 && velocidad <= 60) {
			System.out.println("Vías Urbanas");
		} else if (velocidad > 60 && velocidad <= 80) {
			System.out.println("Vías Rurales");
		} else if (velocidad > 80 && velocidad <= 100) {
			System.out.println("Rutas Nacionales");
		} else {
			System.out.println("Estás infringiendo los límites de velocidad");
		}

		// Estructuras condicionales anidadas
		// Permiten ejecutar una sentencia a partir de una condición en forma de
		// ciclo hasta encontrar el retorno esperado (cumplimiento de la condición).
		// Si la condicion se cumple se ejecuta la sentencia del programa, en caso de no
		// cumplirse
		// se puede hacer otra condicion para que se cicle, marque error y vuelva a
		// solicitar la info
		// hasta que se cumpla la condicion.

		int numero = 9;

		if (numero >= 0) {
			if (numero > 0 && numero <= 4) {
				System.out.println("Bajo valor");
			} else if (numero > 4 && numero <= 8) {
				System.out.println("Medio valor");
			} else if (numero > 8 && numero <= 14) {
				System.out.println("Alto valor");
			}
		} else {
			System.out.println("Es negativo");

		}

		// Switch Case

		int num = 2;

		switch (num) {
			case 1:
				System.out.println("Numero 1");
				break;
			case 2:
				System.out.println("Numero 2");
				break;
			case 3:
				System.out.println("Numero 3");
				break;
			default:
				System.out.println("Error");

		}

		// Break y Continue

		// - Break - detiene el ciclo
		// - Continue - detiene unicamente la iteracion actual y
		// salta a la siguiente iteracion del ciclo sin salir de el, continue.

		// BREAK
		// En este ejemplo, pese a que debe iterar 10 veces, el break corta el ciclo en
		// la primera
		// iteracion y se sale de el.

		for (int i = 0; i < 10; i++) {
			System.out.println("Dentro del ciclo");
			break;
		}
		System.out.println("Fuera del ciclo");

		// CONTINUE
		// En este ejemplo el ciclo esta programado para iterar 5 veces, la condicional
		// en el ciclo determina
		// que cuando llegue a la tercera iteracion salte inmediatamente a la siguiente
		// iteracion, por lo cual solo
		// habran 4 impresiones en la consola.

		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println("Dentro del ciclo");
		}

		// Omision de la declaracion Break
		// Si se omite el break la ejecucion continuara en el siguiente case. A veces es
		// deseable tener multiples case sin declaraciones break entre ellos.

		int diaNumero = 6;
		String diaLaboral;

		switch (diaNumero) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				diaLaboral = "Dia Laborable";
				break;
			case 6:
			case 7:
				diaLaboral = "Fin de semana";
				break;

			default:
				diaLaboral = "Tipo de dia invalido";
		}

		System.out.println(diaNumero + " es un " + diaLaboral);

		// Switch case anidados
		// Se puede usar un switch como parte de la secuencia de un switch externo.

		int promedio = 4;
		int parcial = 4;

		switch (promedio) {
			case 1:
			case 2:
			case 3:
				System.out.println("Perdiste la materia");
				break;
			case 4:
			case 5:
				System.out.println("Ganaste la materia");
				switch (parcial) {
					case 1:
					case 2:
					case 3:
						System.out.println("Pero perdiste el parcial");
						break;
					case 4:
					case 5:
						System.out.println("Y tambien el parcial");
						break;
				}
				break;
			default:
				System.out.println("Error");
		}

		// Switch case con string
		// Desde JDK7 se puede usar un string para controlar la declaracion switch.
		// Es una operacion costosa, string no debe ser null, es case sensitive,
		// es muy parecido al metodo string.equals - compara objetos

		String amigo = "Ana";
		switch (amigo) {
			case "Diego":
				System.out.println("Hola Diego, lindo día");
				break;
			case "Juan":
				System.out.println("Juan, ¿cómo estas?");
				break;
			case "Stiven":
				System.out.println("Stiven, buena barba");
				break;
			case "Ana":
				System.out.println("Lindo cabello Ana");
				break;
			case "Susana":
				System.out.println("Susana, ¿y la familia?");
				break;
			default:
				System.out.println("Error");
		}

	}
}
