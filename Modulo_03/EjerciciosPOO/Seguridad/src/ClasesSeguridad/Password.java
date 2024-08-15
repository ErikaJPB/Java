package ClasesSeguridad;

public class Password {

    // Atribtutos
    private int longitud;
    private String password;

    // Constructor por defecto que asigna 10 a la longitud

    public Password() {
        this.longitud = 10;
        this.password = generar();
    }

    // Constructor que recibe la longitud deseada

    public Password(int longitud) {
        this.longitud = longitud;
        this.password = generar();
    }

    // Getters and setters
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getPassword() {
        return password;
    }

    // Metodo generar password
    public String generar() {
        StringBuilder passwordBuilder = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int tipoCaracter = (int) (Math.random() * 3) + 1;
            switch (tipoCaracter) {
                case 1: // Minusculas (97 - 122)
                    passwordBuilder.append((char) ((int) (Math.random() * (123 - 97)) + 97));
                    break;
                case 2: // Mayusculas (65 - 90)
                    passwordBuilder.append((char) ((int) (Math.random() * (91 - 65)) + 65));
                    break;
                case 3: // Numeros (48 - 57)
                    passwordBuilder.append((char) ((int) (Math.random() * (58 - 48)) + 48));
                    break;
            }
        }
        return passwordBuilder.toString();
    }

    // Metodo validar password

    public boolean validar() {
        int minCont = 0, mayCont = 0, numCont = 0;

        for (int i = 0; i < password.length(); i++) {
            char caracter = password.charAt(i);
            if (caracter >= 'a' && caracter <= 'z') {
                minCont++;
            } else if (caracter >= 'A' && caracter <= 'Z') {
                mayCont++;
            } else if (caracter >= '0' && caracter <= '9') {
                numCont++;
            }
        }

        boolean esSegura = minCont >= 1 && mayCont >= 2 && numCont >= 5;

        System.out.println("Contraseña: " + password);
        System.out.println("Minúsculas: " + minCont);
        System.out.println("Mayúsculas: " + mayCont);
        System.out.println("Números: " + numCont);
        System.out.println("¿Es segura? " + (esSegura ? "Sí" : "No"));

        return esSegura;

    }

    public static void main(String[] args) {

    }

}
