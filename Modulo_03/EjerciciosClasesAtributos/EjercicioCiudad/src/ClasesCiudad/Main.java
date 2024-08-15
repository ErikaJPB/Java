package ClasesCiudad;

public class Main {

    public static void main(String[] args) {

        Ciudad bogota = new Ciudad();

        bogota.setNombre("Bogotá");
        bogota.setPoblacion(10000000);
        bogota.setPais("Colombia");
        bogota.setPresidente("Gustavo Petro");

        System.out.println("Ciudad: " + bogota.getNombre());
        System.out.println("Población: " + bogota.getPoblacion());
        System.out.println("País: " + bogota.getPais());
        System.out.println("Presidente: " + bogota.getPresidente());
    }

}
