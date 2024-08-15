package Agenda;

public class Main {

    public static void main(String[] args) {

        Agenda erikaAgenda = new Agenda();

        Contacto contactoUno = new Contacto();
        Contacto contactoDos = new Contacto();
        Contacto contactoTres = new Contacto();

        contactoUno.setNombre("Maria");
        contactoUno.setNumero("3154322525");

        contactoDos.setNombre("Fabio");
        contactoDos.setNumero("3122121546");

        contactoTres.setNombre("Laura");
        contactoTres.setNumero("3141234565");

        erikaAgenda.registrarContacto(contactoUno);
        erikaAgenda.registrarContacto(contactoDos);
        erikaAgenda.registrarContacto(contactoTres);

        erikaAgenda.listarContactos();

        erikaAgenda.buscarContacto("Laura");

        erikaAgenda.disponibles();
    }

}