package ClasesWhile;

public class Ejercicio4 {

    public static void main(String[] args) {

        // Desarrollar un programa que continúe con la serie sumatoria de 11 –
        // 22 – 33 – 44. Debe mostrar únicamente los primeros 25 valores de la
        // serie.

        int serie = 0;
        int indice = 0;

        while (indice < 25) {
            serie = serie + 11;
            System.out.print(serie + " ");
            // 11 22 33 44 55 66 77 88 99 110 121 132 143 154 165 176 187 198 209 220 231
            // 242 253 264 275
            indice++;
        }
    }

}
