package Agenda;

public class Contacto {

    // Atributos

    private String nombre;
    private String numero;

    // Constructor

    public Contacto() {

    }

    public Contacto(String nombre, String numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    // getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    // Override el metodo toString.
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Número: " + numero;
    }

    public static void main(String[] args) {

    }

}