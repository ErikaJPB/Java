package ClasesPOO;

// El nombre identifica la clase de forma unica en nuestro proyecto. 
public class Persona {

    // La clase Persona es una plantilla de como es un humano.

    // Nombre, pais y edad son atributos.
    String nombre;
    String pais;
    int edad;

    public Persona() {
        // Cada ser humano, es una instancia u objeto de dicha clase.
        nombre = "Erika";
        pais = "Colombia";
        edad = 37;
    }

    public void Saludar() {
        // Metodo de la clase persona
        System.out.println("Hola");
    }

}
