package ClasesHerencia;

public class Main {

    public static void main(String[] args) {

        // Objeto de la clase Taxi
        Taxi taxiAmarillo = new Taxi();

        // Uso de los atributos de la clase Vehiculo
        taxiAmarillo.setMatricula("AAA 123");
        taxiAmarillo.setModelo("2003");
        taxiAmarillo.setPotencia(800);

        // Uso del atributo de la clase Taxi
        taxiAmarillo.setLicencia("123123123132");

        // Uso de los metodos de la clase Vehiculo
        taxiAmarillo.encenderVehiculo();
        taxiAmarillo.apagarVehiculo();

        System.out.println(taxiAmarillo.getMatricula());
        System.out.println(taxiAmarillo.getModelo());
        System.out.println(taxiAmarillo.getPotencia());
        System.out.println(taxiAmarillo.getLicencia());

        // Objeto de la clase AutoBus
        AutoBus autoCol = new AutoBus();

        // Uso de los atributos de la clase Vehiculo
        autoCol.setMatricula("ABA 123");
        autoCol.setModelo("2007");
        autoCol.setPotencia(2500);

        // Uso del atributo de la clase AutoBus
        autoCol.setPuestos(34);

        // Uso de los metodos de la clase Vehiculo
        autoCol.encenderVehiculo();
        autoCol.apagarVehiculo();

        System.out.println(autoCol.getMatricula());
        System.out.println(autoCol.getModelo());
        System.out.println(autoCol.getPotencia());
        System.out.println(autoCol.getPuestos());
    }

}