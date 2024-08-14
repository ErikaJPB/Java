package ClasesAbstractas;

// Clases abstractas => son aquellas clases base (superclases) de las cuales no se permite crear objetos.

// Dentro de este tipo de clases pueden definirse metodos abstractos que se caracterizan por el hecho de que no pueden ser implementados 
// en la clase base. Solo se escriben en la superclase y su funcionalidad tiene que indicarse en las clases derivadas. 

public abstract class Figura {

    private String color;

    // Constructor
    public Figura(String color) {
        this.color = color;
    }

    // Este metodo es abstracto por lo que no cuenta con implementacion.
    public abstract double calcularArea();

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {

    }

}