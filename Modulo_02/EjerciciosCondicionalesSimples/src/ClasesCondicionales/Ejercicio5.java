package ClasesCondicionales;

public class Ejercicio5 {

    public static void main(String[] args) {

        // Por medio de una nota decimal, determinar sí el estudiante aprobó o no
        // la clase (0 – 6 = Perdió – 7 – 10 = Aprobó).

        double nota = 7.4;

        if (nota >= 7 && nota <= 10) {
            System.out.println("Aprobado");
        } else if (nota <= 6.9) {
            System.out.println("Reprobado");
        }
    }

}
