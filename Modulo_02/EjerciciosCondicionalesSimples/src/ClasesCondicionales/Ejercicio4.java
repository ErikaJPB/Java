package ClasesCondicionales;

public class Ejercicio4 {

    public static void main(String[] args) {

        // Dados dos números enteros, determinar si uno es múltiplo del otro (Por
        // medio del módulo).

        int numero1 = 16;
        int numero2 = 4;

        if (numero1 % numero2 == 0) {
            System.out.println(numero2 + " es múltiplo de " + numero1);
        } else {
            System.out.println(numero2 + " no es múltiplo de " + numero1);
        }

    }

}
