package Libreria;

public class Main {

    public static void main(String[] args) {

        Libro soledad = new Libro();

        soledad.setAutor("Gabriel García Márquez");
        soledad.setTitulo("Cien Años de Soledad");
        soledad.setPaginas(482);

        soledad.mostrarLibro();

        Libro alquemista = new Libro();

        alquemista.setAutor("Paulo Coelho");
        alquemista.setTitulo("El Alquemista");
        alquemista.setPaginas(192);

        alquemista.mostrarLibro();

        System.out.println(soledad.compararLibros(soledad, alquemista));
    }

}
