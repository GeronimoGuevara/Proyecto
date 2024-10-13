import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        System.out.println("ingrese su peso en kilogramos");
        double peso = Scanner.nextDouble();
        System.out.println("ingrese la duracion del ejercicio en minutos");
        double tiempo = Scanner.nextDouble();
        Scanner.nextLine();
        System.out.println("ingrese el tipo de ejercicio (correr, nadar, bicicleta)");
        String tipo_ejercicio = Scanner.nextLine().toLowerCase();

        double met = 0;
        switch (tipo_ejercicio) {
            case "correr":
                met = 8.0;
                break;
            case "nadar":
                met = 7.0;
                break;
            case "bicicleta":
                met = 6.0;
                break;
            default:
                System.out.println("ejercicio no valido elejir correr, nadar o bicicleta");

        }
        double caloriasHora = met * peso;
        double caloriasMinuto = caloriasHora / 60;
        double caloriasTotales = caloriasMinuto * tiempo;

        System.out.println("Calorías quemadas:" +caloriasTotales);
        Scanner.close();

    }
}
