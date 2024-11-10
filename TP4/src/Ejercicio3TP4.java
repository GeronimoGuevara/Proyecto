public class Ejercicio3TP4 {
    public static void main(String[] args) {
        String[] clientes = {"Gonzalo Paredes", "Franco Paredes", "Raul Paredes ", "Armando Paredes", "Pedro Paredes"};

        double[] factPendientes = {350.75, 600.00, 450.50, 800.25, 200.00};

        enviarFacturas(clientes, factPendientes);
    }

    public static void enviarFacturas(String[] clientes, double[] factPendientes) {
        System.out.println("Clientes con facturas mayores a $500:");

        for (int i = 0; i < clientes.length; i++) {

            if (factPendientes[i] > 500) {
                System.out.println(clientes[i] + " - Monto pendiente: $" + factPendientes[i]);
            }
        }
    }
}
