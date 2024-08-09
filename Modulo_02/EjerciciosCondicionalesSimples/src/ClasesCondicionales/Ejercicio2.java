package ClasesCondicionales;

public class Ejercicio2 {

    public static void main(String[] args) {

        // 2. Dados dos números enteros, determinar cuál es el mayor por medio de
        // una condicional y realizar una potencia con el número menor como
        // exponente (Math.pow).

        int numero1 = 2;
        int numero2 = 4;

        if (numero1 > numero2) {
            System.out.println("Potencia: " + Math.pow(numero1, numero2));
        } else {
            System.out.println("Potencia: " + Math.pow(numero2, numero1));
        }
    }

}
