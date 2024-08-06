package Ciclos;

public class Ciclos {

	public static void main(String[] args) {
	

		// Ciclos - Permite repetir una o varias instrucciones cuantas veces sea necesario.
	
		
		// CICLO FOR
		
		// Es una estructura ciclica que permite ejecutar una o varias lineas de codigo de forma repetitiva
		// pero teniendo control y conocimiento sobre las iteraciones. 
		// Consta de valor inicial, una condicion y valor final. 
		
		
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Número: " + i);
		}
		
		
		// Se puede diseñar de forma diferente
		
		// Creacion de valor de inicio fuera del ciclo
		
		int i = 0;
		for(; i < 10; i++) {
			System.out.println(" Caso 1 - Número: " + i);
		}
		
		// Incremento o decremento dentro del ciclo
		
		for (int j = 0; j < 10;)
		{
			j++;
			System.out.println("Caso 2 - Número: " + j);
		}
		
		// Sentencias adicionales dentro de la declaracion del ciclo:
		
		for (int x = 0; x <10; System.out.println(x), x++)
		{
			System.out.println("Caso 3 - Número: ");
			
		}
		
		// Omision del uso de las llaves:
		
		for (int y = 0; y < 10; System.out.print("Caso 4 - Número: " + y + " "), y++);
		
		
		// Ejercicios
		
		//  1. Imprimir los numeros pares entre 0 y 20 de forma ascendente.
		
		for (int a = 0; a <= 20; a+=2)
		{
			System.out.println(a + " ");		
		}
		
		
		// otra forma menos eficiente porque conlleva mas lineas de codigo.
		
		for (int b = 0; b <= 20; b++)
		{
			if (b % 2 == 0)
			{
				System.out.println(b + " ");
			}
		}
		
		
		// 2. Imprimir los numeros pares entre 0 y 20 de forma descendente.
		
		for (int c = 20; c >= 0; c -= 2)
		{
			System.out.println(c + " ");
		}
		
		
		// 3. Contar cuantos numeros hay entre 1 y 1000 que sean multiplos de 7.
		
		int contador = 0;
		
		for (int d = 1; d <= 1000; d++)
		{
			if (d % 7 == 0)
			{
				contador++;
			}	
		}
		
		System.out.println("Los multiplos de 7 entre 1 y 1000 son: " + contador);

		
		
		// 4. Imprimir tablas de multiplicar del 1 al 10 con su resultado. 
	
		for (int num=1; num <=10; num++)
		{
			System.out.println("Tabla de multiplicar del " + num );
			for (int mult = 1; mult <= 10; mult ++)
			{
				System.out.println(num + " * " + mult + " = " + num * mult);
			}
		}
		
		
		// CICLO WHILE
		
		// Es una estructura de control ciclica que permite ejecutar una o varias
		// lineas de codigo de forma iterativa, teniendo el control y conocimiento
		// de las iteraciones. Se necesita una condicional en la declaracion que determina
		// si el ciclo continua o se detiene. En la mayoria de casos se desconoce la cantidad de
		// veces deseada para iterar porque no tiene valor de inicio ni valor de parada. 
		
		
		// La estructura del ciclo while cuenta con una condicion que debe tomar un valor
		// booleano. Si este valor es verdadero se ejecutara la sentencia. Concluida esta accion
		// se vuelve a evaluar la condicion hasta que esta cambie a falso. 
		
		
		
		boolean m = true;
		
		while (m)
		{
			System.out.println("Ciclo While");
			m = false;
		}
		
			int n = 0;
			while(n < 10)
			{
				System.out.println(n);
				n++;
			}
		
			
			
		// Ejercicios
			
			
		// 1. Imprimir los numeros impares entre 1 y 25.
			
		int numero = 1;
			
		while(numero  <= 25)
		{
			if (numero % 2 != 0)
			{
				System.out.println(numero+ " ");
			}
			numero++;
		}
			
			
		// 2. Descomponer los caracteres de una palabra
			
		String palabra = "Curso de Java";
		int z = 0;
		
		while (z < palabra.length())
		{
			System.out.print(palabra.charAt(z) + " ");
			z++;
		}
		
		System.out.println();
		
		System.out.print("La palabra tiene " + palabra.length() + " caracteres");
		
		System.out.println();
		
		z = 0;
		palabra = "Erika";
		
		while (z < palabra.length())
		{
			System.out.println(palabra.charAt(z) + " en la posición: " + z);
			z++;
		}
		
		
		// 3. Generar numeros aleatorios del 1 al 50 y se detenga cuando genere un multiplo de 10
		
		m = true;
		
		while (m)
		{
			double numAleatorio = Math.ceil(Math.random()*50);
			System.out.println(numAleatorio);
			if (numAleatorio % 10 == 0)
			{
				m = false;
			}
		}
		
		
		// CICLO DO WHILE
		
		// Estructura de iteracion que cumple el mismo objetivo del while con la diferencia
		// que el ciclo do while ejecuta al menos una vez antes de evaluarse la condicion del ciclo, por
		// lo que siempre tendra una iteracion asi el ciclo no haya entrado en ejecucion.
		
		
		
		do 
		{
			System.out.println("Do While");
		}
		while (false);
		
		
		i = 0;
		
		do 
		{
			System.out.println(i);
		}
		while (i > 5);
	
	}

}