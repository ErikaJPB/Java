package ClasesPilas;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        // PILAS o STACK => Es una version restringida de una lista, es una lista de
        // datos lineal que solo tiene un unico punto de acceso fijo por el cual se
        // añaden
        // eliminan o se consultan elementos. El metodo de acceso es de tipo LIFO (Last
        // in First out).
        // La unica forma de acceder a la pila es desde la cima.
        // En caso de querer acceder a un elemento de la pila que no se encuentre en la
        // cima se tendra que recurrir a una pila auxiliar y hacer un volcado de la
        // pila, una vez realizada la
        // operacion se vuelven a volcar los elementos de la pila auxiliar a la
        // original.

        // Pila de Strings
        Stack<String> pilaStrings = new Stack<String>();
        System.out.println(pilaStrings);

        // Pila de Enteros
        Stack<Integer> pilaEnteros = new Stack<Integer>();
        System.out.println(pilaEnteros);

        // Pila de Doubles
        Stack<Double> pilaDoubles = new Stack<Double>();
        System.out.println(pilaDoubles);

        // Pila de Objetos
        Stack<Object> pilaObjetos = new Stack<Object>();
        System.out.println(pilaObjetos);

        // Pilas de un tipo Clase
        // Stack<Usuario> pilaUsuarios = new Stack<Usuario>();

        // Pilas de cualquier tipo
        // Stack pilaSinTipo = new Stack();

        // La clase Stack cuenta con 5 metodos propios de su clase empty, peek, pop,
        // push y search.
        // Ademas implementa metodos de otras estructuras como add, remove, get, set y
        // clear.

        // Metodo push => Recibe un dato de la pila y lo inserta en la cima.

        Stack<String> pilaMaterias = new Stack<String>();

        pilaMaterias.push("Matematicas");
        pilaMaterias.push("Español");
        pilaMaterias.push("Sociales");

        System.out.println(pilaMaterias); // [Matematicas, Español, Sociales]
        System.out.println(pilaMaterias.get(1)); // Español

        // Metodo pop => Devuelve y elimina el elemento superior de la pila.
        System.out.println(pilaMaterias.pop()); // Sociales

        // Metodo peek => devuelve el elemento de la parte superior de la cima sin
        // eliminarlo
        pilaMaterias.push("Sociales");
        pilaMaterias.push("Biologia");
        pilaMaterias.push("Fisica");

        System.out.println(pilaMaterias); // [Matematicas, Español, Sociales, Biologia, Fisica]
        System.out.println(pilaMaterias.peek()); // Fisica

        // Metodo empty => Retorna true en caso de que la lista se encuentre vacia o
        // false si esta contiene elementos.
        System.out.println("La pila contiene elementos?: " + pilaMaterias.empty()); // La pila contiene elementos?:
                                                                                    // false

        // Metodo search => Determina si un dato pertenece a la lista. Si se encuentra
        // devuelve la posicion del elemento desde la parte superior de la pila, si no
        // devuelve -1.

        System.out.println(pilaMaterias.search("Religion")); // -1
        System.out.println(pilaMaterias.search("Matematicas")); // 5
        System.out.println(pilaMaterias.search("Sociales")); // 3
        System.out.println(pilaMaterias.search("Fisica")); // 1

        // Metodo recorrer pila => Recupera y recorre todos los datos de la pila a
        // partir de su estrutura

        do {
            System.out.println("Valor: " + pilaMaterias.peek());
        } while (pilaMaterias.pop() != null && !pilaMaterias.empty());

    }

}
