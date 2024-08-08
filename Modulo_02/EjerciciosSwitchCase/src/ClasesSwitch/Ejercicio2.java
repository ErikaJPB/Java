package ClasesSwitch;

public class Ejercicio2 {

    public static void main(String[] args) {

        int numeroUno = 8;
        int numeroDos = 2;
        char operador = '/';
        int resultado = 0;

        switch (operador) {
            case '+':
                resultado = numeroUno + numeroDos;
                System.out.println(numeroUno + " + " + numeroDos + " = " + resultado);
                // 8 + 2 = 10
                break;
            case '-':
                resultado = numeroUno - numeroDos;
                System.out.println(numeroUno + " - " + numeroDos + " = " + resultado);
                // 8 - 2 = 6
                break;
            case '*':
                resultado = numeroUno * numeroDos;
                System.out.println(numeroUno + " * " + numeroDos + " = " + resultado);
                // 8 * 2 = 16
                break;
            case '/':
                resultado = numeroUno / numeroDos;
                System.out.println(numeroUno + " / " + numeroDos + " = " + resultado);
                // 8 / 2 = 4
                break;
            default:
                System.out.println("Error");

        }
    }
}
