package ClasesPolimorfismo;

public class Instrumento {

    // Polimorfismo => Una clase que hereda puede redefinir los metodos de su clase
    // padre, de esta manera puede
    // crear nuevos metodos con el mismo nombre de su superclase.

    // La estructura de los metodos debe ser igual en ambas clases, mismos
    // parametros, tipos de retorno e implementacion del mismo modificador de
    // acceso.
    // Los metodos static y final no se pueden sobreescribir

    public void tocar() {
        System.out.println("Tocar el instrumento");
    }

    public static void main(String[] args) {

    }

}
