package ClasesOrdenamiento;

public class Main {

    public static void main(String[] args) {

        // Metodos de Ordenamiento => sirven para ordenar vectores o matrices con
        // valores asignados.

        // Metodo de Ordenamiento Burbuja // Ω(n2)
        // Funciona revisando cada elemento de la lista que va a ser ordenada con el
        // siguiente, intercambiandolos de posicion si estan en el orden equivocado.
        // Es necesario revisar varias veces toda la lista hasta que no se necesiten mas
        // intercambios. Se le considera un algoritmo de comparacion.

        // vector a ordenar
        int vector[] = { 9, 2, 5, 7, 1, 2, 0 };

        // variable auxiliar
        int temp;

        // primer ciclo que va a recorrer
        for (int i = 1; i < vector.length; i++) {

            // segundo ciclo que va a recorrer
            for (int j = 0; j < vector.length - 1; j++) {

                // comparar los valores en cada una de las posiciones para determinar cual es
                // mayor

                if (vector[j] > vector[j + 1]) {

                    // intercambio de las posiciones y valores

                    temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }

        }

        // Imprimir el vector ordenado
        System.out.println("Vector ordenado:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " - ");
            // Vector ordenado:
            // 0 - 1 - 2 - 2 - 5 - 7 - 9 -
        }

        System.out.println();

        // Metodo de Ordenamiento por insercion // Ω(n2/4)
        // consiste en ir insertando un elemento de la lista o un arreglo en la parte
        // ordenada de esta, asumiendo que el primer elemento
        // es la parte ordenada; el algoritmo ira comparando un elemento de la parte
        // desordenada de la lista con los elementos de la parte ordenada, insertando el
        // elemento en la posicion correcta dentro de la parte ordenada y asi
        // sucesivamente hasta obtener la lista ordenada.

        // vector a ordenar
        int vectorUno[] = { 9, 2, 5, 7, 1, 2, 0 };

        // primer ciclo a recorrer

        for (int i = 0; i < vectorUno.length; i++) {
            // declaracion de la var aux
            int aux = vectorUno[i];
            // declaracion de la var del ciclo
            int j;
            // segundo ciclo a recorrer
            for (j = i - 1; j >= 0 && vectorUno[j] > aux; j--) {
                // intercambio de valores en las posiciones
                vectorUno[j + 1] = vectorUno[j];
            }

            // asignacion de valores al ciclo
            vectorUno[j + 1] = aux;
        }

        System.out.println("Vector ordenado:");
        for (int i = 0; i < vectorUno.length; i++) {
            System.out.print(vectorUno[i] + " - ");
            // Vector ordenado:
            // 0 - 1 - 2 - 2 - 5 - 7 - 9 -
        }

        System.out.println();

        // Metodo de Ordenamiento por seleccion // Ω(n2)
        // consiste en encontrar el menor de todos los elementos del vector e
        // intercambiarlo con el que esta en la primera posicion. Luego el segundo mas
        // pequeño y asi
        // sucesivamente hasta ordenarlo todo.

        // vector a ordenar
        int vectorDos[] = { 9, 2, 5, 7, 1, 2, 0 };

        // variable auxiliar
        int swap;

        // primer ciclo a recorrer
        for (int i = 0; i <= vectorDos.length - 1; i++) {
            // almacenado de variable de recorrido
            int j = i;

            // segundo ciclo de recorrido
            for (int k = i + 1; k <= vectorDos.length - 1; k++) {
                // comparacion de valores y almacenamiento de posiciones
                if (vectorDos[k] < vectorDos[j])
                    j = k;

                // comparacion de posiciones
                if (j != i) {
                    // intercambio de valores en posiciones
                    swap = vectorDos[j];
                    vectorDos[j] = vectorDos[i];
                    vectorDos[i] = swap;
                }
            }

        }

        System.out.println("Vector ordenado:");
        for (int i = 0; i < vectorDos.length; i++) {
            System.out.print(vectorDos[i] + " - ");
            // Vector ordenado:
            // 0 - 1 - 2 - 2 - 5 - 7 - 9 -
        }

    }

}
