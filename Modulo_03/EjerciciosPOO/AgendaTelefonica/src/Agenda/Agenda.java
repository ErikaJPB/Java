package Agenda;

public class Agenda {

    // Atributos

    final private Contacto[] contactos;
    private int contador;

    // Constructor

    public Agenda() {
        this.contactos = new Contacto[10];
        this.contador = 0;

    }

    // Metodos

    // Registrar Contacto
    public void registrarContacto(Contacto contacto) {
        if (contador < 10) {
            contactos[contador] = contacto;
            contador++;
            System.out.println("Contacto registrado exitosamente.");
        } else {
            System.out.println("Agenda llena, no se pueden registrar más contactos.");
        }
    }

    // Listar Contacto
    public void listarContactos() {
        System.out.println("Lista de Contactos: ");
        for (int i = 0; i < contador; i++) {
            System.out.println(contactos[i].toString());
        }
    }

    // Buscar Contacto
    public void buscarContacto(String nombre) {
        for (int i = 0; i < contador; i++) {
            if (contactos[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Contacto encontrado: " + contactos[i].toString());
                return;
            }
        }
        System.out.println("Contacto no encontrado");
    }

    // Disponibles

    public void disponibles() {
        int espaciosDisponibles = 10 - contador;
        System.out.println("Espacios disponibles en la agenda: " + espaciosDisponibles);
    }

    public static void main(String[] args) {

    }

}