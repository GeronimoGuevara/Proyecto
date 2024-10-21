import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String [] args) {

        //Ejercicio 3: Control de inventario
        //Una tienda necesita revisar el inventario de sus productos y determinar si algún artículo tiene menos de 5
        // unidades disponibles para realizar un pedido.
        //Instrucciones:
        //•	Pide al usuario ingresar el número de productos.
        //•	Usa un bucle para ingresar la cantidad disponible de cada producto.
        //•	Si algún producto tiene menos de 5 unidades, muestra un mensaje indicando que es necesario realizar un pedido.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de productos en el inventario:");
        int numProductos = sc.nextInt();

        int contador = 0;

        while (contador < numProductos) {
            System.out.println("Ingrese la cantidad disponible para el producto " + (contador + 1) + ":");
            int cantidad = sc.nextInt();
            if (cantidad < 5) {
                System.out.println("El producto " + (contador + 1) + " tiene menos de 5 unidades. Es necesario realizar un pedido.");
            }
            contador++;
        }
    }
}
