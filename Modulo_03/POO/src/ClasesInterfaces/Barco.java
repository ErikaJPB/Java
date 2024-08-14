package ClasesInterfaces;

// Interfaces => Es una coleccion de metodos abstractos y propiedades constantes, se especifica que se debe hacer pero no su 
// implementacion. 
// Diferencia entre interface y abstract es que una interfaz proporciona un mecanismo de encapsulacion de los protocolos de los metodos sin forzar
// al usuario a utilizar la herencia. 
// Es una plantilla para la construccion de clases.
// Una clase puede implementar una o varias interfaces, en ese caso la clase debe proporcionar la declaracion y definicion de todos los metodos de cada una de las interfaces o bien declararse como clase abstract.
// La interfaz puede utilizarse para declar constantes que luego pueden ser utilizadas por otras clases. 
// Los metodos de la interfaz se declaran implicitamente como abstractos y publicos
// Una interfaz no puede implementar ningun metodo porque todos son abstractos
// La interfaz no declara variables de instancia.

public interface Barco {

    // Todas las constantes incluidas en la interfaz se declaran implicitamente como
    // public, static y final (se puede omitir) y es necesario inicializarlas en la
    // misma sentencia de declaracion.

    void moverPosicion(int x, int y);

    void disparar();
}
