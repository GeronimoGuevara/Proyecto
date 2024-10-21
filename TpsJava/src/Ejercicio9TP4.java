public class Ejercicio9TP4 {
    public static void main(String[] args) {

        double[] precios = {100.0, 200.0, 300.0, 400.0, 500.0};

        double[] preciosFinales = calcularPrecioFinal(precios);

        System.out.println("Precios originales:");
        for (double i : precios) {

            System.out.println(i);
        }

        System.out.println("\nPrecios finales:");
        for (double i : preciosFinales) {

            System.out.println(i);
        }
    }

    public static double[] calcularPrecioFinal(double[] precios) {
        double descuento = 0.90;
        double[] preciosFinales = new double[precios.length];

        for (int i = 0; i < precios.length; i++) {
            preciosFinales[i] = precios[i] * descuento;
        }

        return preciosFinales;
    }
}
