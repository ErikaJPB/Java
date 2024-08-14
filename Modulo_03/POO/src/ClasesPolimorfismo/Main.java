package ClasesPolimorfismo;

public class Main {

    public static void main(String[] args) {

        Clarinete ClarineteNegro = new Clarinete();

        // Partiendo del objeto tipo Clarinete, se accede al metodo tocar de la misma
        // clase (no la padre, porque ha sido sobreescrita)
        ClarineteNegro.tocar();

    }

}
