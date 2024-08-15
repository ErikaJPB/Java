package ClasesCasa;

public class Casa {

    // Atributos con valores constantes

    // private String ciudad = "Bucaramanga";
    // private String barrio = "Cabecera";
    // private String color = "Blanco";
    // private int pisos = 3;
    // private int habitaciones = 5;
    // private int banos = 3;
    // private int cocinas = 1;
    //

    // Atributos

    private String ciudad;
    private String barrio;
    private String color;
    private int pisos;
    private int habitaciones;
    private int banos;
    private int cocinas;

    // Constructores

    // Constructor 1 = ciudad, barrio, color

    public Casa(String ciudad, String barrio, String color) {
        this.ciudad = ciudad;
        this.barrio = barrio;
        this.color = color;
    }

    // Constructor 2 = barrio, color, pisos

    public Casa(String barrio, String color, int pisos) {
        this.barrio = barrio;
        this.color = color;
        this.pisos = pisos;
    }

    // Constructor 3 = pisos, habitaciones, banos y cocinas

    public Casa(int pisos, int habitaciones, int banos, int cocinas) {
        this.pisos = pisos;
        this.habitaciones = habitaciones;
        this.banos = banos;
        this.cocinas = cocinas;
    }

    // Getters
    public String getCiudad() {
        return ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getColor() {
        return color;
    }

    public int getPisos() {
        return pisos;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public int getBanos() {
        return banos;
    }

    public int getCocinas() {
        return cocinas;
    }

    // Setters

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public void setBanos(int banos) {
        this.banos = banos;
    }

    public void setCocinas(int cocinas) {
        this.cocinas = cocinas;
    }

    public static void main(String[] args) {

    }

}