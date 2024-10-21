import java.util.Scanner;

public class T2Ejercicio2 {
    public static void main(String [] args) {

        //Ejercicio 2: Calculadora de Descuentos
        //Escribe un programa que pida al usuario el precio de un producto y la categoría del cliente
        //(estudiante, adulto, jubilado). Aplica un descuento del 10% para estudiantes, 5% para adultos y
        //15% para jubilados. Imprime el precio final después del descuento.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");
        double precio = sc.nextDouble();
        double precioFinal = 0.0;

        System.out.println("ingrese su categoria: estudiante, adulto o jubilado");
        sc.nextLine();
        String categoria = sc.nextLine().toLowerCase();

        switch (categoria) {
            case "estudiante":
                precioFinal = precio - (precio*0.10);
                System.out.println("El precio final del producto con el 10% de descuento aplicado es de: "+precioFinal+" pesos");
                break;
            case "adulto":
                precioFinal = precio - (precio*0.05);
                System.out.println("El precio final del producto con el 5% de descuento aplicado es de: "+precioFinal+" pesos");
                break;
            case "jubilado":
                precioFinal = precio - (precio*0.15);
                System.out.println("El precio final del producto con el 15% de descuento aplicado es de: "+precioFinal+" pesos");
                break;
            default:
                System.out.println("La categoria ingresada no es valida");
                break;
        }
    }
}
