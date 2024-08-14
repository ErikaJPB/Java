package ClasesPOO;

public class Aritmetica {

    public int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public int resta(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public int multiplicacion(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public int division(int numero1, int numero2) {
        return numero1 / numero2;
    }

    public static void main(String[] args) {

        Aritmetica Operaciones = new Aritmetica();

        int suma = Operaciones.suma(9, 2);
        int resta = Operaciones.resta(9, 12);
        int multiplicacion = Operaciones.multiplicacion(3, 2);
        int division = Operaciones.division(10, 5);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
    }

}