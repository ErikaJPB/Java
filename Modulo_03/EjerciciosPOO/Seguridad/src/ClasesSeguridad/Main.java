
package ClasesSeguridad;

public class Main {

    public static void main(String[] args) {

        Password passwordUno = new Password();
        passwordUno.validar();

        Password passwordDos = new Password(50);
        passwordDos.validar();

    }

}
