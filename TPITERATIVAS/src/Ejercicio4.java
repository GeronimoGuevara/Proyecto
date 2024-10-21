import java.util.Scanner;

public class Ejercicio4 {
    public static void main (String [] args) {

        //Ejercicio 4: Registro de ventas diarias
        //Una tienda desea registrar las ventas realizadas cada día durante una semana. El programa
        // debe calcular el total de ventas al final de la semana.
        //Instrucciones:
        //•	Usa un bucle para registrar las ventas diarias durante 7 días.
        //•	Al final del bucle, muestra el total de ventas de la semana.
        Scanner sc = new Scanner(System.in);

        double totalVentas = 0;
        int dia = 1;

        while (dia <= 7) {
            System.out.println("Ingrese las ventas del día " + dia + ":");
            double ventasDia = sc.nextDouble();

            totalVentas += ventasDia;
            dia++;
        }
        System.out.println("El total de ventas de la semana es: $" + totalVentas);
    }
}
