package ClasesPOO;

// El nombre identifica la clase de forma unica en nuestro proyecto. 
public class Persona {

    // La clase Persona es una plantilla de como es un humano.

    // Nombre, pais y edad son atributos.
    String nombre;
    String pais;
    int edad;

    // Constructor vacio
    public Persona() {

    }

    // Constructor
    public Persona(String nombre, String pais, int edad) {
        // Cada ser humano, es una instancia u objeto de dicha clase.
        this.nombre = nombre;
        this.pais = pais;
        this.edad = edad;
    }

    public void Saludar() {
        // Metodo de la clase persona
        System.out.println("Hola");
    }

    public void Comer() {
        System.out.println(this.nombre + " esta comiendo");
    }

    public void Cantar() {
        System.out.println(this.nombre + " esta cantando");
    }

    // Setters and getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static void main(String[] args) {

        // Diego no es el objeto sino la variable que almacenara la referencia
        // a un objeto de la clase persona que todavia no existe.
        Persona Diego;

        // Aqui el operador new creara un objeto de la clase persona reservando memoria
        // para guardar
        // sus atributos
        Diego = new Persona();
        System.out.println(Diego.nombre);

        // Se establecen los valores a los atributos por medio de set
        Diego.setNombre("Diego");
        Diego.setPais("Colombia");
        Diego.setEdad(22);

        // Se obtienen los valores de los atributos por medio del metodo get
        System.out.println(Diego.getNombre());
        System.out.println(Diego.getPais());
        System.out.println(Diego.getEdad());

        // Se operan los metodos en la clase persona para realizar acciones
        Diego.Cantar();
        Diego.Comer();

        // Instancia Objeto tipo Persona

        Persona Maria = new Persona();

        // Se establecen los valores a los atributos por medio de set
        Maria.setNombre("Maria");
        Maria.setPais("Chile");
        Maria.setEdad(28);

        // Se obtienen los valores de los atributos por medio del metodo get
        System.out.println(Maria.getNombre());
        System.out.println(Maria.getPais());
        System.out.println(Maria.getEdad());

        // Se operan los metodos en la clase persona para realizar acciones
        Maria.Cantar();
        Maria.Comer();
    }

}
