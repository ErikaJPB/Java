package ClasesPOO;

public class Perro {

    // La clase puede contener N atributos.
    // Se recomienda el uso de private para limitar el alcance de este.
    // Usar nombres claros en relacion con la clase
    // En la mayoria de los casos no se inicilizan los atributos
    // Si se inicializa un atributo se recomienda el uso de la palabra final para
    // determinarse como una constante.

    // final private String raza = "Perro";
    // private String nombre;

    // String raza;
    // String nombre;
    // int edad;
    // String encargada;

    final private String raza = "Perro";
    private String nombre;
    private int edad;
    private String encargada;

    public Perro() {

        this.nombre = "Bruno";
        this.edad = 3;
        this.encargada = "Erika";
    }

    public void ladrar() {
        System.out.println("Gau!, gau!");
    }

    public void pasear() {
        System.out.println("Ir al parque");
    }

    // Getters and Setters => son metodos de acceso para cambiar atributos privados
    // de las clases.

    // * Setters => Hace referencia a la acción a establecer, sirven para asignar un
    // valor inicial
    // a un atributo de forma explicita, el setter no retorna nada, solo asigna y
    // solo permite dar acceso
    // a ciertos atributos que el usuario puede modificar.

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // *Getters => Hace referencia a la accion de obtener, sirve para acceder o
    // recuperar el valor ya asignado
    // a un atributo para que pueda ser utilizado. Suelen ser metodos publicos que
    // no conllevan parametros porque solo van
    // a devolver valores que ya estan asignados. No necesita el this

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEncargada() {
        return encargada;
    }

    public void setEncargada(String encargada) {
        this.encargada = encargada;
    }

    public String getRaza() {
        return raza;
    }

    // Constructor vacio

    // This => Sirve para hacer referencia a un metodo, propiedad o atribujo del
    // objeto actual.
    // Se utiliza cuando hay sobrecarga de nombres dentro de una variable local de
    // un metodo o constructor
    // que al llevar el mismo nombre cause confusion al relacionarse.
    // En el sgte ejemplo this, ayuda a diferenciar los parametros de los atributos
    // dado que tienen el mismo nombre.

    // CONSTRUCTOR => Contienen las acciones que se realizaran por defecto al crear
    // un objeto.
    public Perro(String nombre, int edad, String encargada) {
        this.nombre = nombre;
        this.edad = edad;
        this.encargada = encargada;
    }

    // Otro constructor
    // No se permiten mas de 2 constructores

    public Perro(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) {

        // El objeto debe recibir 3 argumentos del mismo tipo y en el mismo orden de
        // acuerdo a como se
        // declara en el constructor.
        Perro Firulais = new Perro("Firulais", 9, "Ana");
        System.out.println(Firulais.getNombre());

        // Usando el segundo constructor que acepta solo nombre;
        Perro Poseidon = new Perro("Poseidon");
        System.out.println(Poseidon.getNombre());
        System.out.println(Poseidon.getEncargada()); // como no se le asigno, devuelve null

        Perro Boz = new Perro("Boz", 14, "Julia");
        System.out.println(Boz.getNombre());
    }

}
