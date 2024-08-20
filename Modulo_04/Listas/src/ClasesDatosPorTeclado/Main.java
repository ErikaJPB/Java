package ClasesDatosPorTeclado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
// import java.util.*;

public class Main {

    // administrador de excepciones que java.io proporciona para el uso de
    // BufferedReader e InputStreamReader
    public static void main(String[] args) throws IOException {

        // Datos por Teclado => la entrada o lectura de datos en java permite a los
        // usuarios interactuar con los programas, dado que permite el ingreso de datos
        // dinamicos en cada ejecucion.

        // Dos de las formas de leer datos en java son:
        // - Buffereader e InputStreamReader => de la libreria java.io
        // - scanner => de la libreria java.util

        // BufferedReader - InputStreamReader
        // Son dos clases las que se deben importar para el control de los datos, pero
        // Java obliga el uso del IOException para el manejo de excepciones dentro de la
        // clase. O se puede importar solo java.io.*

        // Se debe crear un bojeto de estas clases para hacer uso de sus metodos
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // para conocer en que momento solicitar datos por teclado, se debe informar al
        // usuario por medio de un mensaje en pantalla
        System.out.print("Por favor ingrese su nombre: "); // Por favor ingrese su nombre: Erika

        // readLine es el metodo que permite capturar los datos por teclado, se debe
        // hacer uso del objeto que se creo y capturar el valor en una variable
        String nombre = br.readLine();

        // Por medio de estas clases solo se pueden capturar strings, si se desea
        // almacenar numeros se deben castear.

        // Se solicita nueva informacion
        System.out.print("Bienvenido " + nombre + ". Por favor ingrese su edad: "); // Bienvenido Erika. Por favor
                                                                                    // ingrese su edad: 37

        // se captura en una variable
        String entrada = br.readLine();

        // se castea la edad
        int edad = Integer.parseInt(entrada);

        // Finalmente se imprimen los valores recibidos por teclado en las variables
        // asignadas.
        System.out.println("Gracias " + nombre + " tienes " + edad + " años."); // Gracias Erika tienes 37 años.

        // Scanner
        // La clase debe importarse para el control de los datos.. java.util.Scanner o
        // java.util.*

        // se crea el objeto para hacer uso de sus metodos
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // Mensaje en pantalla para el usuario para solicitar los datos
        System.out.print("Por favor ingrese su nombre: "); // Por favor ingrese su nombre: Erika

        // Metodo que permite capturar los datos por teclado, es independiente del dato
        // que se desea almacenar
        // Si es String debe ser nextLine, si es entero nextInt, si es double nextDouble
        // etc.
        // Para acceder al metodo se debe hacer uso del objeto que se creo y capturar y
        // almacenar el valor dentro de una variable.
        String nombreSc = sc.nextLine();

        // Se solicita mas informacion al usuario
        System.out.print("Bienvenido " + nombreSc + ". Por favor ingrese su edad: "); // Bienvenido Erika. Por favor
                                                                                      // ingrese su edad: 37

        // se captura los datos en una variable por medio del objeto creado y llamando
        // al metodo NextInt porque se va a solicitar un entero.
        int edadSc = sc.nextInt();

        // Finalmente se imprimen los valores recibidos por teclado que estan guardados
        // en las variables previamente asignadas.
        System.out.println("Gracias " + nombreSc + " tienes " + edadSc + " años. "); // Gracias Erika tienes 37 años.

        // El resultado en tiempo de ejecucion es secuencial puesto que la ejecucion
        // espera que se ingresen datos para continuar con la siguiente instruccion
        // hasta imprimir todo el codigo.

        // A diferencia de BufferedReader e InputStreamReader, scanner permite trabajar
        // con otros tipos de datos, evitando el casteo de datos y reduciendo lineas de
        // codigo.
    }

}