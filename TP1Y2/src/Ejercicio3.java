import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su condicion fisica (Principiante, Intermedio, Avanzado): ");
        String condicionFisica = scanner.nextLine().toLowerCase();
        String rutina = "";
        int cantDias = 0;

        switch (condicionFisica) {
            case "principiante":
                cantDias = 2;
                rutina = String.format("%-30s %-30s%n", "DIA 1", "DIA 2") +
                        String.format("%-30s %-30s%n", "Flexiones de brazos 3x10", "Press plano 3x10") +
                        String.format("%-30s %-30s%n", "Abdominales 4x15", "Abdominales oblicuos 4x15") +
                        String.format("%-30s %-30s%n", "Sentadillas pesas rusas 4x8", "Sentadilla con barra 4x10");
                break;
            case "intermedio":
                cantDias = 3;
                rutina = String.format("%-30s %-30s %-30s%n", "DIA 1", "DIA 2", "DIA 3") +
                        String.format("%-30s %-30s %-30s%n", "Press de banca 4x10", "Sentadilla 4x10", "Peso muerto 4x8") +
                        String.format("%-30s %-30s %-30s%n", "Dominadas 3x8", "Fondos en paralelas 3x10", "Remo con barra 3x10") +
                        String.format("%-30s %-30s %-30s%n", "Plancha 3x30s", "Abdominales 4x15", "Elevación de talones 3x12");
                break;
            case "avanzado":
                cantDias = 5;
                rutina = String.format("%-30s %-30s %-30s %-30s %-30s%n", "DIA 1", "DIA 2", "DIA 3", "DIA 4", "DIA 5") +
                        String.format("%-30s %-30s %-30s %-30s %-30s%n", "Press de banca 5x5", "Sentadilla profunda 5x5", "Peso muerto 5x5", "Press militar 4x6", "Dominadas con peso 4x6") +
                        String.format("%-30s %-30s %-30s %-30s %-30s%n", "Remo con mancuerna 4x8", "Fondos en paralelas 4x8", "Abdominales con peso 4x15", "Plancha lateral 3x30s", "Cardio 30 min") +
                        String.format("%-30s %-30s %-30s %-30s %-30s%n", "Sprints 10x100m", "Sentadillas búlgaras 4x8", "Zancadas 4x10", "Curl de biceps 4x10", "Tríceps en cuerda 4x10");
                break;
            default:
                System.out.println("Condición física no válida.");
                return;
        }

        System.out.printf("Ya que su condición física es: %s, usted entrenará %d días.%n", condicionFisica, cantDias);
        System.out.println();
        System.out.println(rutina);
    }
}
