import java.util.Scanner;
//Ejercicio 1
public class Main {
    public static void main(String[] args) {
        // Ejercicio 1: Cálculo del tiempo dedicado a cada actividad
        //Un alumno quiere medir el tiempo total que dedica a sus actividades académicas y personales durante el día.
        //Instrucciones:
        //•	Pide al usuario que ingrese las horas dedicadas a cada actividad: estudiar, hacer ejercicios, leer, y tiempo libre.
        //•	Usa un bucle para registrar las horas y luego calcula el tiempo total dedicado.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de actividades que realiza en el día: ");

        int cantActividades = sc.nextInt();
        int i;
        double cantHoras = 0, horasTotales = 0;

        for (i = 0; i < cantActividades; i++) {
            System.out.println("Ingrese la cantidad de horas que le dedica a la actividad " + (i + 1) + ": ");
            cantHoras = sc.nextDouble();
            horasTotales += cantHoras;
        }

        System.out.println("El tiempo total dedicado a todas las actividades es: " + horasTotales + " horas.");
    }
}
