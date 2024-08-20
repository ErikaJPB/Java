package ClasesColas;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        // COLAS o QUEUES => Es una estructura de datos, una secuencia de datos en la
        // que la operacion de insercion push se realiza por un extremo y la operacion
        // de extraccion pop se realiza por el otro. Estructura FIFO, es decir, los
        // elementos solo se eliminar por el principio y solo se pueden añadir por el
        // final de la cola. "Linea de espera".
        // Se recomienda usar tipos, el tamaño es dinamico, cuenta con metodos de las
        // otras estructuras y tiene 6 metodos propios de su interfaz.
        // La clase en la que se apoya es LinkedList.
        // La interfaz que implementa es queue.

        // Cola de enteros
        Queue<Integer> colaEnteros = new LinkedList<Integer>();
        System.out.println(colaEnteros);

        // Cola de strings
        Queue<String> colaStrings = new LinkedList<String>();
        System.out.println(colaStrings);

        // Cola de doubles
        Queue<Double> colaDoubles = new LinkedList<Double>();
        System.out.println(colaDoubles);

        // Cola de objetos
        Queue<Object> colaObjetos = new LinkedList<Object>();
        System.out.println(colaObjetos);

        // Cola de un tipo de clase
        // Queue<Usuario> colaUsuarios = new LinkedList<Usuario>();
        // System.out.println(colaUsuarios);

        // Cola de cualquier tipo
        // Queue colaSinTipo = new LinkedList();

        // La interfaz queue cuenta con 6 metodos propios que son add, element, offer,
        // peek, poll y remove. Y a su vez implementa algunos de los metodos de las
        // otras estructuras como addAll, remove, clear, size, iterator entre otros.

        // Metodo add => Recibe unicamente el dato que desea guardar y el idx lo asigna
        // la cola dependiendo de los demas datos e indices que ya estan registrados.

        Queue<Integer> colaNumeros = new LinkedList<Integer>();

        colaNumeros.add(2);
        colaNumeros.add(4);
        colaNumeros.add(6);
        colaNumeros.add(8);
        colaNumeros.add(10);

        System.out.println(colaNumeros); // [2, 4, 6, 8, 10]

        // Metodo Element => Recupera el primer dato de la cola pero no lo elimina.
        System.out.println("El primer elemento de la cola es: " + colaNumeros.element()); // El primer elemento de la
                                                                                          // cola es: 2

        // Metodo offer => Recibe unicamente el dato que desea guardar, el idx lo asigna
        // la cola a partir de los demas datos e indices registrados
        colaNumeros.offer(16);
        colaNumeros.offer(20);

        System.out.println(colaNumeros); // [2, 4, 6, 8, 10, 16, 20]

        // Metodo peek => Recupera el primer dato presente en la cola, pero no lo
        // elimina, devuelve nulo si la cola esta vacia.
        System.out.println("El primer elemento de la cola es: " + colaNumeros.peek()); // El primer elemento de la cola
                                                                                       // es: 2

        // Metodo poll => Recupera y elimina el primer elemento de la cola, o devuelve
        // nulo si la cola esta vacia.
        System.out.println("El elemento eliminado es: " + colaNumeros.poll()); // El elemento eliminado es: 2

        System.out.println(colaNumeros); // [4, 6, 8, 10, 16, 20]

        // Metodo remove => Recupera y elimina el primer elemento de la cola
        System.out.println("El elemento eliminado es: " + colaNumeros.remove()); // El elemento eliminado es: 4

        System.out.println(colaNumeros); // [6, 8, 10, 16, 20]

        // Metodo iterator => crea una variable de iteracion de cola para recorrer la
        // misma en el orden en el que se encuentra estructurada

        Iterator<Integer> colaNumerosIterable = colaNumeros.iterator();

        while (colaNumerosIterable.hasNext()) {
            System.out.println("Valor: " + colaNumerosIterable.next());
            // Valor: 6
            // Valor: 8
            // Valor: 10
            // Valor: 16
            // Valor: 20
        }

    }

}
