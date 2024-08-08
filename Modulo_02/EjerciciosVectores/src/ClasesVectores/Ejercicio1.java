package ClasesVectores;

public class Ejercicio1 {

    public static void main(String[] args) {

        // Desarrollar un programa que por medio de un vector de tipo float
        // permita almacenar el peso de 5 personas para posteriormente:
        // - Determinar el promedio del peso de las 5 personas.
        // - Determinar cuántas personas superar el promedio del peso.
        // - Determinar cuántas personas son inferiores al promedio del peso.

        float pesos[] = { 71.4F, 62.3F, 85.6F, 47.9F, 61.2F };
        float promPeso = 0.0F;
        float promedio = 0.0F;
        int max = 0;
        int min = 0;

        for (int i = 0; i < pesos.length; i++) {
            promPeso = promPeso + pesos[i];
        }

        promedio = promPeso / 5;

        for (int i = 0; i < pesos.length; i++) {
            if (pesos[i] > promedio) {
                max++;
            } else {
                min++;
            }
        }

        System.out.println("El promedio del peso es: " + promedio);
        // El promedio del peso es: 65.68
        System.out.println("Número de personas que superan el promedio: " + max);
        // Número de personas que superan el promedio: 2
        System.out.println("Número de personas que están por debajo del promedio: " + min);
        // Número de personas que están por debajo del promedio: 3
    }

}
