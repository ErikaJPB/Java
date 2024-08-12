package ClasesPOO;

public class Main {
    public static void main(String[] args) {

        // POO => Es un paradigma de la programación, es decir, es una forma de pensar.
        // Es una propuesta tecnologica
        // cuyo nucleo central es resolver uno o varios problemas claramente
        // delimitados. Resuelve problemas
        // a partir de clases y objetos, una forma especial de programar, más cercana a
        // como se expresan las
        // cosas en la vida real.

        // Clases => Son declaraciones de objetos, o abstracciones de objetos o moldes.
        // Es decir, la definicion de un
        // objeto es una clase. Cuando se programa un objeto y se definen sus
        // caracteristicas y funcionalidades, lo que se
        // hace es programar una clase.

        Persona persona = new Persona();
        persona.Saludar();

        Perro perro = new Perro();
        perro.ladrar();
        perro.pasear();

        // Implementacion del setter
        Perro Firulais = new Perro();
        Firulais.setNombre("Firulais");

        // Implementacion del getter
        System.out.println("El nombre del perro es: " + Firulais.getNombre());
        // El nombre del perro es: Firulais
        System.out.println("La raza del perro es: " + Firulais.getRaza());
        // La raza del perro es: Perro

        Carro Mini = new Carro("Mini Cooper", "Rojo", "CountryMan C", true);

        System.out.println("Marca: " + Mini.getMarca());
        System.out.println("Modelo: " + Mini.getModelo());
        System.out.println("Color: " + Mini.getColor());
        System.out.println("En Venta: " + Mini.isEnVenta());
    }
}
