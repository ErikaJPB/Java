package ClasesVectores;

public class Ejercicio2 {

    public static void main(String[] args) {

        // Desarrollar un programa que dados dos grupos (Grupo A – Grupo B)
        // cada uno con 10 estudiantes y una nota final de la materia por
        // estudiante, determinar:
        // - El promedio general de cada grupo.
        // - El promedio general de ambos grupos.
        // - El grupo con mejor promedio.

        double promedioA = 0, promedioB = 0, promedioGrupos = 0;
        double promA = 0, promB = 0;

        String estudiantesA[] = { "Andres", "Victor", "Rodrigo", "Camilo", "Andrea", "Ana", "Natalia", "Laura",
                "Carolina", "Monica" };

        double notasA[] = { 10, 9, 10, 8, 7, 6, 7, 7, 9, 8 };

        String estudiantesB[] = { "Fernando", "Marcos", "Miguel", "Alejandro", "Oscar", "Omar", "Karina", "Luz",
                "Fernanda", "Maria" };

        double notasB[] = { 7, 8, 8, 6, 10, 8, 8, 10, 9, 9 };

        for (int i = 0; i < notasA.length; i++) {
            promA = promA + notasA[i];

        }
        promedioA = promA / notasA.length;

        System.out.println("Promedio A: " + promedioA);
        // Promedio A: 8.1

        for (int i = 0; i < notasB.length; i++) {
            promB = promB + notasB[i];
        }

        promedioB = promB / notasB.length;

        System.out.println("Promedio B: " + promedioB);
        // Promedio B: 8.3

        promedioGrupos = (promedioA + promedioB) / 2;
        System.out.println("Promedio General: " + promedioGrupos);
        // Promedio General: 8.2

        if (promedioA > promedioB) {
            System.out.println("El grupo con mejor promedio es el A");
        } else if (promedioB > promedioA) {
            System.out.println("El grupo con mejor promedio es el B");
            // El grupo con mejor promedio es el B
        } else {
            System.out.println("Ambos grupos tienen el mismo promedio");
        }
    }

}