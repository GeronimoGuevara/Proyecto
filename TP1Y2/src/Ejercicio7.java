import java.util.Scanner;

public class Ejercicio7 {
    public static void main (String [] args) {
        //Ejercicio 7: Calculadora de Índice de Felicidad
        //Escribe un programa que pida al usuario varios factores de felicidad (nivel de satisfacción con la
        //vida, nivel de estrés, nivel de salud, etc.) en una escala del 1 al 10 y luego calcule e imprima un
        //índice de felicidad basado en esos factores.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Se le pedirá que todos los valores de la siguiente encuesta los responda con valores del 1 al 10");
        System.out.println("que nivel de satisfaccion tiene con la vida?");
        double satisfaccion = scanner.nextDouble();

        System.out.println("cual es su nivel de estres actualmente?");
        double nEstres = scanner.nextDouble();
        System.out.println("cual es su nivel de salud actual?");
        double nSalud = scanner.nextDouble();
        //
        double resultado = (satisfaccion + (10 - nEstres) + nSalud)/3;

        System.out.println("Su indice de felicidad es de: "+ resultado + "/10");



    }
}
