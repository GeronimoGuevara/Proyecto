public class Ejercicio4TP4 {
    public static void main(String[] args) {

        String[] clientes = {"Juan Pérez", "Ana Gómez", "Luis Martínez", "Carla Sánchez", "Pedro Torres"};

        int[] compras = {5, 12, 8, 15, 3};

        calcularDescuentos(clientes, compras);
    }
    public static void calcularDescuentos(String[] clientes, int[] compras) {

        System.out.println("Clientes con descuento por fidelización:");

        for (int i = 0; i < clientes.length; i++) {

            if (compras[i] > 10) {
                System.out.println(clientes[i] + " - Compras: " + compras[i] + " - Descuento: 10%");
            }
        }
    }
}
