package ClasesWhile;

public class Ejercicio3 {

    public static void main(String[] args) {

        // Desarrollar un programa que permita contar cuantas vocales existentes
        // en el siguiente parrafo.
        // “Porta fames dis aenean platea neque semper? Conubia eleifend commodo
        // maecenas
        // risus risus pellentesque. Eros iaculis duis posuere integer purus euismod
        // consequat.
        // Vel congue curabitur penatibus ac mus nisi iaculis; scelerisque feugiat
        // blandit molestie
        // euismod. Tincidunt risus sociis nostra fermentum laoreet aliquet aptent est.
        // Platea
        // non proin aliquet scelerisque nam maecenas elit cum.”

        String parrafo = "Porta fames dis aenean platea neque semper? Conubia eleifend commodo maecenas "
                + "risus risus pellentesque. Eros iaculis duis posuere integer purus euismod consequat. "
                + "Vel congue curabitur penatibus ac mus nisi iaculis; scelerisque feugiat blandit molestie "
                + "euismod. Tincidunt risus sociis nostra fermentum laoreet aliquet aptent est. Platea "
                + "non proin aliquet scelerisque nam maecenas elit cum.";

        parrafo = parrafo.toLowerCase();

        int vocales = 0;

        int indice = 0;

        while (indice < parrafo.length()) {
            char c = parrafo.charAt(indice);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocales++;
            }
            indice++;
        }

        System.out.println("El párrafo tiene " + vocales + " vocales.");
        // El párrafo tiene 152 vocales.
    }

}