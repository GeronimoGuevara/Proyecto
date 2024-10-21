public class Ejercicio6TP4 {
    public static void main(String[] args) {
        double[] facturas = {1000.0, 1500.0, 2500.0, 3000.0, 500.0};

        calcularImpuesto(facturas);
    }

    public static void calcularImpuesto(double[] facturas) {

        System.out.println("Facturas con impuestos aplicados:");
        for (int i = 0; i < facturas.length; i++) {

            double impuesto = facturas[i] * 0.21;
            double totalConImpuesto = facturas[i] + impuesto;
            System.out.println("Factura: $" + facturas[i] + " - Impuesto: $" + impuesto + " - Total: $" + totalConImpuesto);
        }
    }
}
