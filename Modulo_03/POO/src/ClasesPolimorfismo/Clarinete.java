package ClasesPolimorfismo;

public class Clarinete extends Instrumento {

    // Se recomienda el uso de anotaciones en especial @Override
    @Override

    // La clase padre Instrumento implementa el metodo tocar, la clase hija lo
    // sobreescribe, por lo que
    // ahora son dos metodos diferentes.

    // public void tocar() {
    // System.out.println("Tocando el Clarinete");
    // }

    // Si queremos obtener la ejecucion de ambos metodos tanto el de la clase padre
    // como el de hija, se usa la palabra super.
    // hace las veces de this, pero no hace referencia al objeto o clase actual sino
    // a su clase padre, en este caso Instrumento.

    public void tocar() {
        super.tocar();
        System.out.println("Tocando el Clarinete");
    }

    public static void main(String[] args) {

    }

}
