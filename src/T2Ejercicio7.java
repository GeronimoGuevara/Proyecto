import java.util.Scanner;

public class T2Ejercicio7 {
    public static void main (String [] args) {

        //Ejercicio 7: Sistema de Recomendación de Actividades
        //Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
        //recomiende una actividad basada en su estado de ánimo.
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuál es tu estado de ánimo? (feliz, triste, enérgico, relajado): ");
        String estadoAnimo = scanner.nextLine().toLowerCase();

        System.out.println("Recomendación de Actividad:");

        switch (estadoAnimo) {
            case "feliz":
                System.out.println("- ¡Genial! Considera salir a celebrar con amigos o hacer algo divertido, como ir al cine.");
                break;
            case "triste":
                System.out.println("- Está bien sentirse así. Te recomiendo ver una película que te haga reír o escuchar música alegre.");
                break;
            case "energico":
                System.out.println("- ¡Perfecto! Podrías hacer ejercicio, como correr o practicar algún deporte. ¡Aprovecha esa energía!");
                break;
            case "relajado":
                System.out.println("- Es un buen momento para meditar, leer un libro o tomar un baño relajante.");
                break;
            default:
                System.out.println("- Lo siento, no reconozco ese estado de ánimo. Por favor, elige entre: feliz, triste, enérgico, relajado.");
                break;
        }
    }
}
