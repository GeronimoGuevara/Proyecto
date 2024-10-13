import java.util.Scanner;
public class T2Ejercicio6 {
    public static void main (String [] args) {

        //Ejercicio 6: Evaluador de Hábitos Saludables
        //Escribe un programa que pida al usuario cuántas horas al día duerme, cuántas horas al día hace
        //ejercicio y cuántas comidas saludables consume al día. Luego, imprime una evaluación de sus
        //hábitos saludables basada en estos datos.

        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas horas al día duerme? ");
        int horasDormir = scanner.nextInt();

        System.out.print("¿Cuántas horas al día hace ejercicio? ");
        int horasEjercicio = scanner.nextInt();

        System.out.print("¿Cuántas comidas saludables consume al día? ");
        int comidasSaludables = scanner.nextInt();

        System.out.println("Evaluación de Hábitos Saludables:");

        if (horasDormir < 6) {
            System.out.println("- Deberías intentar dormir más. Se recomienda dormir entre 7 y 9 horas.");
        } else if (horasDormir >= 6 && horasDormir <= 8) {
            System.out.println("- Buenas horas de sueño. ¡Sigue así!");
        } else {
            System.out.println("- Podrías estar durmiendo demasiado. Intenta mantener un equilibrio.");
        }

        if (horasEjercicio < 1) {
            System.out.println("- Intenta hacer al menos 1 hora de ejercicio al día.");
        } else if (horasEjercicio >= 1 && horasEjercicio <= 2) {
            System.out.println("- Buen trabajo con el ejercicio. ¡Sigue así!");
        } else {
            System.out.println("- Considera disminuir el tiempo de ejercicio si te sientes fatigado.");
        }

        if (comidasSaludables < 2) {
            System.out.println("- Intenta incorporar más comidas saludables en tu dieta.");
        } else if (comidasSaludables >= 2 && comidasSaludables <= 4) {
            System.out.println("- Buenas elecciones de comidas. ¡Sigue así!");
        } else {
            System.out.println("- Excelente. Mantener una dieta rica en alimentos saludables es clave.");
        }

        scanner.close(); // Cerrar el escáner
    }
}

