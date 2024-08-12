package OtroPaquete;

import ClasesPOO.Carro;

public class Main {
    public static void main(String[] args) {

        Carro Forester = new Carro("Subaru", "Verde", "Subaru", true);

        System.out.println("Marca: " + Forester.getMarca());
        System.out.println("Modelo: " + Forester.getModelo());
        System.out.println("Color: " + Forester.getColor());
        System.out.println("En Venta: " + Forester.isEnVenta());
    }
}
