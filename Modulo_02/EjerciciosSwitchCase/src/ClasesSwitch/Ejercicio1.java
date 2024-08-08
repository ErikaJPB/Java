package ClasesSwitch;

public class Ejercicio1 {

    public static void main(String[] args) {

        int tipo = 2;

        switch (tipo) 
        {
            case 0:
                System.out.println("No hay establecido un valor definido para el tipo");
                break;
            case 1:
                System.out.println("Agua");
                break;
            case 2:
                System.out.println("Gasolina");
                break;
            case 3:
                System.out.println("Hormigón");
                break;
            default:
                System.out.println("No existe un valor válido");
        }
    }

}