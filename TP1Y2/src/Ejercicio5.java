import java.util.Scanner;

public class Ejercicio5 {
    public static void main (String[] args) {
        //Ejercicio 5: Calculadora de Costo de Viaje
        //Escribe un programa que pida al usuario la distancia del viaje en kilómetros, el consumo de
        //combustible del vehículo en litros por kilómetro y el precio del combustible por litro, y luego
        //calcule e imprima el costo total del viaje.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la distancia de su viaje en kilometros");
        double distancia = scanner.nextDouble();
        System.out.println("Ingrese el consumo de su vehiculo de litros por kilometro");
        double litros = scanner.nextDouble();
        System.out.println("Ingrese el precio del combustible por litro");
        double precio = scanner.nextDouble();

        double resultado = 0;
        if ((distancia > 0) &&(litros > 0)&&(precio > 0)) {
            resultado = (distancia / litros) * precio;
            System.out.println("El costo total del viaje sera de: " + resultado);

        } else {
            System.out.println("los numeros ingresados son incorrectos");
        }
    }
}
