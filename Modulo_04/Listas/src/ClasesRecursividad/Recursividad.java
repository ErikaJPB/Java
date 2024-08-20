package ClasesRecursividad;

public class Recursividad {

    // Funciones recursivas => son aquellas que se invocan a si mismas en algun
    // momento de su ejecucion. Para poder solucionar un problema de forma recursiva
    // es necesario saber alguna solucion no recursiva para alguno de los casos mas
    // sencillos. Todo metodo recursivo debe tener al menos una sentencia que
    // devuelva un resultado(la solucion del caso mas sencillo) y
    // las sentencias necesarias para acercarse en cada invocacion a ese caso.
    // Cuando el metodo se llama a si mismo, a las nuevas variables y parametros
    // locales se les asigna almacenamiento en la pila (stack) y el codigo del
    // metodo se ejecuta con estas nuevas variables desde el principio.
    // Una llamada recursiva no hace una nueva copia del metodo sino que sus
    // argumentos son nuevos, a medida que retorna cada llamada recursiva las viejas
    // variables y parametros locales se eliminan de la pila y la ejecucion
    // se reanuda en el punto de la llamada dentro del metodo. Se podria decir que
    // los metodos recursivos se desplazan hacia afuera y hacia atras.

    // La recursividad se debe utilizar cuando el problema a resolver o la
    // estructura de datos por procesar (por ejemplo arboles) tienen una clara
    // definicion recursiva.
    // No se debe usar cuando la iteracion ofrece una solucion obvia.

    // Para medir la eficacia de un algoritmo recursivo se tiene en cuenta: tiempo
    // de ejecucion, uso de memoria, legibilidad y facilidad de comprension.
    // Las soluciones recursivas suelen ser mas lentas que las iterativas por el
    // tiempo empleado en la llamada del metodo, consume mas memoria porque debe
    // guardar los contextos de ejecucion etc. Pero en algunos casos una mayor
    // claridad del
    // algoritmo hace que la solucion sea mas facil de leer y comprender que su
    // correspondiente solucion iterativa.

    // Ejercicio de factorial

    // factorial de un numero consiste en multiplicar dicho numero por todos sus
    // anteriores hasta llegar a 1.

    public int factorial(int numero) {
        if (numero <= 1) { // caso base
            return 1;
        } else {
            return numero * factorial(numero - 1); // llamada recursiva
        }
    }

}
