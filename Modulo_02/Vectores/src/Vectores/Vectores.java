public class Vectores {
    public static void main(String[] args) {
		 

		
		// VECTORES
		
		// Son una estructura de datos que permite almacenar un grupo de datos de un mismo tipo.
		// Son conocidos como arrays y es habitual llamar matrices a los vectores que trabajan
		// con dos dimensiones. 
		
		
		// Forma 1:
		int vectorNumeros1[] = new int[10];
		System.out.println(vectorNumeros1);
		
		// Forma 2: 
		int []vectorNumeros2 = new int[10];
		System.out.println(vectorNumeros2);
		
		// Forma 3:
		int[] vectorNumeros3 = new int[10];
		System.out.println(vectorNumeros3);
		
		// Forma 4: 
		// int vectorNumeros4[];
		
		// Forma 5: 
		int vectorNumeros5[] = {};
		System.out.println(vectorNumeros5);
		
		// Forma 6: 
		int vectorNumeros6[] = {9,8,7,6,5,4,3,2,1,0};
		System.out.println(vectorNumeros6);
		
		// Forma 7:
		int vectorNumeros7[] = new int[] {9,8,7,6,5,4,3,2,1,0};
		System.out.println(vectorNumeros7);
		
		
		// Estructura de un vector
		
		
		String estudiantes[] = new String[3];
		
		estudiantes[0] = "Juan";
		estudiantes[1] = "Pedro";
		estudiantes[2] = "Maria";
		
		System.out.println(estudiantes[1]); // Pedro
		
		// El tamaño del vector no puede ser redefinido
		// Los vectores pueden ser de N posiciones, (N cualquier numero entero)
		
		double notas[] = new double[100];
		System.out.println(notas[0]); // 0.0
		
		
		// Vectores inicializados sin datos se representan de la siguiente forma
		
		//1. Numeros
		int alturas[] = new int[3];
		System.out.println(alturas[0]); // 0
		
		// 2. Strings
		
		String nombres[] = new String[3];
		System.out.println(nombres[0]); // null
		
		// 3. booleanos
		
		boolean estados[] = new boolean[3];
		System.out.println(estados[0]); // false
		
		estados[0] = true;
		System.out.println(estados[0]); // true
		
		String grupos[] = {"Primero", "Segundo", "Tercero"};
		System.out.println(grupos[1]); // Segundo
		
		
		// Para el uso de vectores es habitual utilizar ciclos para realizar operaciones 
		// dentro de los mismos.
		
		for(int i = 0; i < estudiantes.length; i++)
		{
			System.out.println("Nombre" + i + " - " + estudiantes[i]); 
			//Nombre0 - Juan
			//Nombre1 - Pedro
			//Nombre2 - Maria
		}
		
		
		// Ejercicios
		
		// 1. Mediante el uso de dos vectores almacenar 5 notas de un estudiante para calcular
		// el promedio final. Los valores para calcular el promedio se encuentran en un vector aparte que 
		// contiene los porcentajes asignados a cada nota. 
		
		double notasEstudiante[] = new double[5];
		int porcentajes[] = {20,10,30,20,20};
		
		notasEstudiante[0] = 4.5;
		notasEstudiante[1] = 3.2;
		notasEstudiante[2] = 5.0;
		notasEstudiante[3] = 1.5;
		notasEstudiante[4] = 4.3;
		
		double promedio = 0;
		
		for (int i = 0; i < notasEstudiante.length; i++)
		{
			promedio = (notasEstudiante[i] * (porcentajes[i]) / 100) + promedio;
		}
		
		System.out.println("Promedio Final " + Math.round(promedio)); // Promedio Final 4
	
		
		// 2. Dado un vector de cinco nombres cambie todas las lectras de los nombres por numeros 
		
		
		String nombresPersona[] = {"JUAN", "ERIKA", "ANA", "MARCOS", "DIEGO", "FRANCISCO"};
		
		char caracteres[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
				'N','Ñ','O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y','Z'};
		
		int numeros[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27};
		
		int x = 0;
		
		String nombreAuxiliar = "";
		
		while (x < 5) // recorre nombres
		{
			for (int j = 0; j < nombresPersona[x].length(); j++) // recorre letras de cada nombre
			{
				for (int k = 0; k < caracteres.length; k++) // recorre los caracteres del array del abecedario
				{
					if(nombresPersona[x].charAt(j) == caracteres[k])
					{
						nombreAuxiliar = nombreAuxiliar+numeros[k];
					}
				}
			}
			
			nombresPersona[x] = nombreAuxiliar;
			System.out.println(nombresPersona[x]);
			nombreAuxiliar = "";
			x++;
			
			//1022114
			//5199111
			//1141
			//1311931620
			//495716
		}
		
		
		
		}
}
