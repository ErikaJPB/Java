package ClasesCasa;

public class Main {

    public static void main(String[] args) {

        // Casa casaBlanca = new Casa();
        //
        // System.out.println("Ciudad: " + casaBlanca.getCiudad());
        // System.out.println("Barrio: " + casaBlanca.getBarrio());
        // System.out.println("Color: " + casaBlanca.getColor());
        // System.out.println("Pisos: " + casaBlanca.getPisos());
        // System.out.println("Habitaciones: " + casaBlanca.getHabitaciones());
        // System.out.println("Baños: " + casaBlanca.getBanos());
        // System.out.println("Cocinas: " + casaBlanca.getCocinas());

        Casa casaMorada = new Casa("Bucaramanga", "Provenza", "Morada");

        Casa casaAzul = new Casa("Cabecera", "Azul", 3);

        Casa casaGris = new Casa(3, 5, 3, 1);

        System.out.println("Objeto 1 - Casa Morada");
        System.out.println("Ciudad: " + casaMorada.getCiudad());
        System.out.println("Barrio: " + casaMorada.getBarrio());
        System.out.println("Color: " + casaMorada.getColor());

        System.out.println();

        System.out.println("Objeto 2 - Casa Azul");
        System.out.println("Barrio: " + casaAzul.getBarrio());
        System.out.println("Color: " + casaAzul.getColor());
        System.out.println("Pisos: " + casaAzul.getPisos());

        System.out.println();

        System.out.println("Objeto 3 - Casa Gris");
        System.out.println("Pisos: " + casaGris.getPisos());
        System.out.println("Habitaciones: " + casaGris.getHabitaciones());
        System.out.println("Baños: " + casaGris.getBanos());
        System.out.println("Cocinas: " + casaGris.getCocinas());

    }

}