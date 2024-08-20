package ClasesListas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.LinkedList;

public class Main {

    // Listas => Forma util de almacenar y manipular grandes volumenes de datos. Se
    // puede realizar de dos formas diferentes:
    // - Clases o interfaces de Java
    // - Implementacion desde cero.
    // Las estructuras de datos que hacen uso de listas en Java son: Lists,
    // ArrayList, Linkedlist.

    // Interfaz List

    // java.util.list = representa una secuencia ordenada de objetos. Los elementos
    // contenidos se pueden insertar, acceder, iterar y eliminar segun el orden
    // en el que aparecen internamente. El orden de los elementos es el motivo por
    // el cual esta estructura de datos se denomina lista.
    // Caracteristicas:
    // - No es necesario establecer un tamaño para la lista
    // - Se recomienda definir un tipo de dato para la lista
    // - La importacion de las clases e interfaces es obligatoria
    // - Hay listas que pueden almacenar cualquier tipo de dato en su estructura,
    // simplemente no se le asigna tipo alguno.
    // - idx empiezan en 0, como en los vectores y matrices.

    public static void main(String[] args) {

        // Declaracion de la lista

        // Lista de tipo strings
        // List <String> listaNombres = new ArrayList<String>();

        // Lista de tipo enteros
        // List <Integer> listaDeNumeros = new ArrayList<Integer>();

        // Lista de doubles
        // List <Double> listaDoubles = new ArrayList<Double>();

        // Lista de Objetos
        // List <Object> listaObjetos = new ArrayList<Object>();

        // Lista de un tipo Clase
        // List <Usuario> listaDeUsuarios = new ArrayList<Usuarios>();

        // Lista de cualquier tipo
        // List lista = new ArrayList();

        // Lista con tamaño establecido
        // List <String> listaDeDiez = new ArrayList<String>(10);

        // Lista Paises
        List<String> listaPaises = new ArrayList<String>();

        // A partir de la lista creada se pueden implementar las funcionalidades de un
        // CRUD

        // Create - agregar elementos

        // Metodo add => Recibe solamente el dato que se desea guardar, el idx lo asigna
        // la lista en base a los datos que
        // ya estan guardados
        listaPaises.add("Colombia");
        listaPaises.add("Peru");
        listaPaises.add("Argentina");
        listaPaises.add("Mexico");

        // Metodo add con idx => recibe el dato que se desea guardar y el indice que se
        // le desea asignar al dato.

        listaPaises.add(4, "Venezuela");
        listaPaises.add(5, "Uruguay");
        listaPaises.add(6, "Ecuador");

        System.out.println(listaPaises); // [Colombia, Peru, Argentina, Mexico, Venezuela, Uruguay, Ecuador]

        // Metodo add list => recibe todos los elementos de una lista nueva, esta nueva
        // lista debe ser del mismo tipo de la contenedora. Los indices
        // son asignados automaticamente.

        List<String> nuevaListaDePaises = new ArrayList<String>();

        nuevaListaDePaises.add("Mexico");

        System.out.println(nuevaListaDePaises); // [Mexico]

        nuevaListaDePaises.addAll(listaPaises);

        System.out.println(nuevaListaDePaises); // [Mexico, Colombia, Peru, Argentina, Mexico, Venezuela, Uruguay,
                                                // Ecuador]

        // Metodo add list con idx => recibe todos los elementos de una lista nueva en
        // una posicion especificada.

        List<String> listaPaisesUno = new ArrayList<String>();
        listaPaisesUno.add(0, "Colombia");
        listaPaisesUno.add(1, "Chile");
        listaPaisesUno.add(2, "Argentina");
        listaPaisesUno.add(3, "Venezuela");
        listaPaisesUno.add(4, "Perú");

        System.out.println(listaPaisesUno); // [Colombia, Chile, Argentina, Venezuela, Perú]

        List<String> listaPaisesDos = new ArrayList<String>();
        listaPaisesDos.add("México");
        listaPaisesDos.add("Panamá");
        listaPaisesDos.add("Ecuador");

        listaPaisesUno.addAll(5, listaPaisesDos);

        System.out.println(listaPaisesUno); // [Colombia, Chile, Argentina, Venezuela, Perú, México, Panamá, Ecuador]

        // Metodo set => actualiza el idx de la lista a partir de una posicion y un
        // valor del mismo tipo determinado. No se pueden actualizar posiciones no
        // existentes.

        listaPaisesUno.set(0, "Costa Rica");
        System.out.println(listaPaisesUno); // [Costa Rica, Chile, Argentina, Venezuela, Perú, México, Panamá, Ecuador]

        // Metodo get => recupera un valor de la lista a partir de una posicion
        // determinada.

        System.out.println(listaPaisesUno.get(1)); // Chile

        // Metodo size => devuelve el tamaño de la lista a partir de los valores
        // existente dentro de esta

        System.out.println("El tamaño de la lista es: " + listaPaisesUno.size()); // El tamaño de la lista es: 8

        // Metodo contains => recibe un valor del mismo tipo y determina si existe o no
        // dentro de la lista. (true or false)

        System.out.println("La lista contiene a Colombia: " + listaPaisesUno.contains("Colombia")); // La lista contiene
                                                                                                    // a Colombia: false

        System.out.println("La lista contiene a México: " + listaPaisesUno.contains("México")); // La lista contiene a
                                                                                                // México: true

        // Por su valor booleano, es un metodo que puede ser usado en condicionales
        if (listaPaisesUno.contains("Argentina")) {
            System.out.println("La lista si contiene a Argentina"); // La lista si contiene a Argentina
        }

        // Metodo clear => limpia todos los datos de la lista de forma que queda
        // completamente vacia.

        System.out.println(listaPaisesDos); // [México, Panamá, Ecuador]
        listaPaisesDos.clear();
        System.out.println(listaPaisesDos); // []
        System.out.println("El tamaño de la lista de paises dos es: " + listaPaisesDos.size()); // El tamaño de la lista
                                                                                                // de paises dos es: 0

        // Metodo isEmpty => retorna true or false en caso de que la lista se encuentre
        // llena o vacia.

        if (listaPaisesDos.isEmpty()) {
            System.out.println("La lista está vacía"); // La lista está vacía
        } else {
            System.out.println("La lista contiene paises");
        }

        // Metodo remove por idx => recibe el idx y elimina el dato que se encuentre en
        // esa posicion

        listaPaisesDos.add(0, "Colombia");
        listaPaisesDos.add(1, "Uruguay");
        listaPaisesDos.add(2, "Paraguay");
        listaPaisesDos.add(3, "Bolivia");

        System.out.println(listaPaisesDos); // [Colombia, Uruguay, Paraguay, Bolivia]

        listaPaisesDos.remove(2);

        System.out.println(listaPaisesDos); // [Colombia, Uruguay, Bolivia]
        System.out.println(listaPaisesDos.get(2)); // Bolivia, => ahora Bolivia se desplaza a la posicion 2

        // Metodo remove por valor

        listaPaisesDos.remove("Bolivia");
        System.out.println(listaPaisesDos); // [Colombia, Uruguay]

        // Metodo IndexOf => devuelve el indice de un dato especificado en el metodo en
        // caso de que exista en la lista

        listaPaisesDos.add("Argentina");
        listaPaisesDos.add("Venezuela");

        System.out.println(listaPaisesDos); // [Colombia, Uruguay, Argentina, Venezuela]
        System.out.println("La posicion de Argentina en la lista es: " + listaPaisesDos.indexOf("Argentina")); // La
                                                                                                               // posicion
                                                                                                               // de
                                                                                                               // Argentina
                                                                                                               // en la
                                                                                                               // lista
                                                                                                               // es: 2

        // Metodo iterator => crea una variable de iteracion de listas para recorrer la
        // misma en el orden en que se encuentra almacenada.
        // Se debe importar iterator para un correcto funcionamiento
        Iterator<String> listaPaisesIterable = listaPaisesDos.iterator();

        while (listaPaisesIterable.hasNext()) {
            System.out.println("Valor: " + listaPaisesIterable.next());
            // Valor: Colombia
            // Valor: Uruguay
            // Valor: Argentina
            // Valor: Venezuela
        }

        // Clase ArrayList => representa una secuencia ordenada de objetos los cuales se
        // pueden insertar, acceder, iterar y eliminar de acuerdo al orden en que
        // aparecen
        // en el java ArrayList. Se realiza la implementacion de una matriz de tamaño
        // variable de la interfaz List. Implementa todas las operaciones de List
        // opcionales y permite
        // todos los elementos incluidos el valor nulo. Esta clase tmb proporciona
        // metodos para manipular el tamaño de la matriz que se utiliza para almacenar
        // la lista.
        // - Se puede inicializar por un tamaño pero este puede aumentar si aumentan los
        // datos o disminuir en caso de que se eliminen.
        // - No se puede usar para tipos primitivos como int, char etc. en ese caso se
        // deben usar wrappers.
        // - Para guardar cualquier tipo de dato en el ArrayList no se debe asignar tipo
        // alguno.
        // - Indices inician en 0.

        // ArrayList de enteros
        ArrayList<Integer> listaNumerosEnteros = new ArrayList<Integer>();
        System.out.println("Lista de enteros: " + listaNumerosEnteros);

        // ArrayList de Strings
        ArrayList<String> listaStrings = new ArrayList<String>();
        System.out.println("Lista de Strings: " + listaStrings);

        // ArrayList de Doubles
        ArrayList<Double> listaDoubles = new ArrayList<Double>();
        System.out.println("Lista de Doubles: " + listaDoubles);

        // ArrayList de Objetos
        ArrayList<Object> listaObjetos = new ArrayList<Object>();
        System.out.println("Lista de Objetos: " + listaObjetos);

        // ArrayList de Clase
        // ArrayList <Usuario> listaUsuarios = new ArrayList<Usuario>();

        // ArrayList de cualquier tipo
        // ArrayList lista = new ArrayList();
        // System.out.println("Lista de cualquier tipo: " + lista);

        // ArrayList con tamaño establecido
        ArrayList<Integer> listaEnteros = new ArrayList<Integer>(10);
        System.out.println("Lista de enteros con tamaño establecido: " + listaEnteros);

        // Clase LinkedList => representa una secuencia ordenada de objetos enlazados.
        // Son una estructura de datos lineales donde los elementos no se almacenan en
        // ubicaciones contiguas y cada elemento
        // es un objeto separado con una parte de datos y una parte de direccion. Los
        // elementos estan vinculados mediante punteros y direcciones. Cada elemento es
        // un nodo.
        // - No se puede acceder directamente a un nodo, se debe comenzar desde la
        // cabeza y seguir el enlace hasta llegar al nodo al que queremos acceder.
        // - No se puede inicializar el tamaño pero el tamaño aumenta si la coleccion
        // aumenta o se reduce si se eliminan datos de la coleccion.
        // - No se pueden usar tipos primitivos como int, char etc, se deben usar
        // wrapppers.
        // - Si no se le asigna tipo al LinkedList se puede almacenar cualquier tipo de
        // dato.
        // - El indice inicia en 0

        // Lista enlazada de Strings
        LinkedList<String> listaEnlazadaStrings = new LinkedList<String>();
        System.out.println("Lista Enlazada de Strings: " + listaEnlazadaStrings);

        // Lista enlazada de Enteros
        LinkedList<Integer> listaEnlazadaEnteros = new LinkedList<Integer>();
        System.out.println("Lista Enlazada de Enteros: " + listaEnlazadaEnteros);

        // Lista enlazada de Doubles
        LinkedList<Double> listaEnlazadaDoubles = new LinkedList<Double>();
        System.out.println("Lista Enlazada de Doubles: " + listaEnlazadaDoubles);

        // Lista enlazada de Objetos
        LinkedList<Object> listaEnlazadaObjetos = new LinkedList<Object>();
        System.out.println("Lista Enlazada de Objetos: " + listaEnlazadaObjetos);

        // Lista enlazada de Clase
        // LinkedList<Usuario> listaEnlazadaUsuarios = new LinkedList<Usuario>();
        // System.out.println("Lista Enlazada de Usuarios: " + listaEnlazadaUsuarios);

        // Lista enlazada cualquier tipo
        // LinkedList listaEnlazada = new LinkedList();

        // Metodo add => recibe unicamente el dato que se desea guardar
        LinkedList<String> listaNombres = new LinkedList<String>();

        listaNombres.add("Erika");
        listaNombres.add("Fabio");
        listaNombres.add("Maria");
        listaNombres.add("Diego");

        System.out.println("Lista de nombres: " + listaNombres); // Lista de nombres: [Erika, Fabio, Maria, Diego]

        // Metodo add con idx
        listaNombres.add(4, "Jose");
        listaNombres.add(5, "Monica");
        listaNombres.add(6, "Fernando");

        System.out.println("Lista de nombres: " + listaNombres); // Lista de nombres: [Erika, Fabio, Maria, Diego, Jose,
                                                                 // Monica, Fernando]

        // Metodo add LinkedList => recibe todos los elementos de una lista nueva, debe
        // ser del mismo tipo de la contenedora, los idx se asignan automaticamente.
        LinkedList<String> listaNombresUno = new LinkedList<String>();

        listaNombresUno.add(0, "Laura");
        listaNombresUno.add(1, "Angel");

        System.out.println("Lista de nombres uno: " + listaNombresUno); // Lista de nombres uno: [Laura, Angel]

        listaNombres.addAll(listaNombresUno);
        System.out.println("Lista de nombres: " + listaNombres); // Lista de nombres: [Erika, Fabio, Maria, Diego, Jose,
                                                                 // Monica, Fernando, Laura, Angel]

        // Metodo add LinkedList con idx
        listaNombresUno.addAll(2, listaNombres);
        System.out.println("Lista de nombres uno: " + listaNombresUno); // Lista de nombres uno: [Laura, Angel, Erika,
                                                                        // Fabio, Maria, Diego, Jose, Monica, Fernando,
                                                                        // Laura, Angel]

        // Metodo AddFirst => recibe el dato que se desea guardar y el indice asignado
        // es el 0
        listaNombres.addFirst("Emmanuel");
        System.out.println("Lista de nombres: " + listaNombres); // Lista de nombres: [Emmanuel, Erika, Fabio, Maria,
                                                                 // Diego, Jose, Monica, Fernando, Laura, Angel]

        // Metodo AddLast => recibe el dato que se desea guardar y el indice asignado es
        // la ultima posicion.
        listaNombres.addLast("Nicolas");
        System.out.println("Lista de nombres: " + listaNombres); // Lista de nombres: [Emmanuel, Erika, Fabio, Maria,
                                                                 // Diego, Jose, Monica, Fernando, Laura, Angel,
                                                                 // Nicolas]

        // Metodo set => actualiza un idx de la lista a partir de una posicion y valor
        // del mismo tipo determinado.
        System.out.println("Lista de nombres uno: " + listaNombresUno); // Lista de nombres uno: [Laura, Angel, Erika,
                                                                        // Fabio, Maria, Diego, Jose, Monica, Fernando,
                                                                        // Laura, Angel]
        listaNombresUno.set(9, "Nelly");
        listaNombresUno.set(10, "Gustavo");
        System.out.println("Lista de nombres uno: " + listaNombresUno); // Lista de nombres uno: [Laura, Angel, Erika,
                                                                        // Fabio, Maria, Diego, Jose, Monica, Fernando,
                                                                        // Nelly, Gustavo]

        // Metodo get => recupera un valor de la lista a partir de una posicion
        // determinada.
        System.out.println(listaNombresUno.get(0)); // Laura
        System.out.println(listaNombresUno.get(1)); // Angel

        // Metodo GetFirst => recupera el primer valor de la lista
        System.out.println(listaNombres.getFirst()); // Emmanuel

        // Metodo GetLast => recupera el ultimo valor de la lista
        System.out.println(listaNombres.getLast()); // Nicolas

        // Metodo size => Devuelve el tamaño de la lista a partir de los valores
        // existentes dentro de esta.
        System.out.println("El tamaño de la lista es: " + listaNombres.size()); // El tamaño de la lista es: 11

        listaNombresUno.add("Daniel");
        System.out.println("El tamaño de la lista uno es: " + listaNombresUno.size()); // El tamaño de la lista uno es:
                                                                                       // 12

        // Metodo contains => recibe un valor del mismo tipo y determina si existe o no
        // dentro de la lista
        System.out.println("La lista contiene a Fernando: " + listaNombres.contains("Fernando")); // La lista contiene a
                                                                                                  // Fernando: true

        if (listaNombresUno.contains("Emmanuel")) {
            System.out.println("La lista si contiene a Emmanuel");
        } else {
            System.out.println("Debes agregar a Emmanuel a la lista"); // Debes agregar a Emmanuel a la lista
        }

        // Metodo clear => limpia todos los datos de la lista de forma que esta queda
        // completamente vacia
        listaNombresUno.clear();
        System.out.println("El tamaño de la lista uno es: " + listaNombresUno.size()); // El tamaño de la lista uno es:
                                                                                       // 0

        // Metodo isEmpty => retorna true en caso de que la lista este vacia o false, si
        // esta contiene datos.
        System.out.println(listaNombres.isEmpty()); // false
        System.out.println(listaNombresUno.isEmpty()); // true

        // Metodo remove => recibe el idx valido dentro de la lista y elimina el dato
        // que se encuentra en esta. La lista se ordenara
        // de forma que no queden espacios vacios o huecos. Si se llama sin idx o valor
        // borrara la posicion 0.

        listaNombresUno.add(0, "Emmanuel");
        listaNombresUno.add(1, "Angel");
        listaNombresUno.add(2, "Juan");
        listaNombresUno.add(3, "Nicolas");
        listaNombresUno.add(4, "Andres");

        System.out.println(listaNombresUno); // [Emmanuel, Angel, Juan, Nicolas, Andres]
        listaNombresUno.remove();
        System.out.println(listaNombresUno); // [Angel, Juan, Nicolas, Andres]

        // Metodo remove por valor
        listaNombresUno.remove("Andres");
        System.out.println(listaNombresUno); // [Angel, Juan, Nicolas]

        // Metodo remove por indice
        listaNombresUno.remove(1);
        System.out.println(listaNombresUno); // [Angel, Nicolas]

        // Metodo offer => recibe unicamente el dato que se desea guardar, el idx
        // depende de la lista porque este debe quedar en la ultima posicion.
        listaNombresUno.offer("David");
        System.out.println(listaNombresUno); // [Angel, Nicolas, David]

        // Metodo offerFirst => recibe unicamente el dato que se desea guardar y el idx
        // asignado es el 0
        listaNombresUno.offerFirst("Emmanuel");
        System.out.println(listaNombresUno); // [Emmanuel, Angel, Nicolas, David]

        // Metodo offerLast => recibe unicamente el dato que se desea guardar y el idx
        // es el ultimo
        listaNombresUno.offerLast("Andres");
        System.out.println(listaNombresUno); // [Emmanuel, Angel, Nicolas, David, Andres]

        // Metodo peek => recupera pero no elimina el primer dato de la lista
        System.out.println(listaNombresUno.peek()); // Emmanuel

        // Metodo peekFirst => recupera pero no elimina el primer elemento de la lista
        System.out.println(listaNombresUno.peekFirst()); // Emmanuel

        // Metodo peekLast => recupera pero no elimina el ultimo elemento de la lista
        System.out.println(listaNombresUno.peekLast()); // Andres

        System.out.println(listaNombresUno); // [Emmanuel, Angel, Nicolas, David, Andres]

        // Metodo poll => recupera y elimina el primer elemento de la lista
        System.out.println(listaNombresUno.poll()); // Emmanuel

        System.out.println(listaNombresUno); // [Angel, Nicolas, David, Andres]

        // Metodo pollFirst => recupera y elimina el primer elemento de la lista
        System.out.println(listaNombresUno.pollFirst()); // Angel

        // Metodo pollLast => recupera y elimina el ultimo elemento de la lista
        System.out.println(listaNombresUno.pollLast()); // Andres

        System.out.println(listaNombresUno); // [Nicolas, David]

        // Metodo pop => recupera y elimina el primer elemento de la lista
        System.out.println(listaNombresUno.pop()); // Nicolas

        System.out.println(listaNombresUno); // [David]

        // Metodo push => recibe unicamente el dato que se desea guardar, el idx
        // asignado es 0, asi que queda en la primera posicion y las otras posiciones
        // aumentan 1 si existen
        listaNombresUno.push("Andres");
        listaNombresUno.push("Nicolas");
        listaNombresUno.push("Angel");
        listaNombresUno.push("Emmanuel");

        System.out.println(listaNombresUno); // [Emmanuel, Angel, Nicolas, Andres, David]

        // Metodo lastIterator => crea una variable de iteracion de listas para
        // recorrerlas en el orden en el que se encuentran almacenadas.

        ListIterator<String> listaNombresIterable = listaNombresUno.listIterator();

        while (listaNombresIterable.hasNext()) {
            System.out.println("Valor: " + listaNombresIterable.next());
            // Valor: Emmanuel
            // Valor: Angel
            // Valor: Nicolas
            // Valor: Andres
            // Valor: David
        }

    }

}