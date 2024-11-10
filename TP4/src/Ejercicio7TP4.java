public class Ejercicio7TP4 {
    public static void main(String[] args) {
        double[] compras = {450.0, 600.0, 300.0, 800.0, 150.0, 550.0};

        aplicarDescuento(compras);
    }

    public static void aplicarDescuento(double[] compras) {

        System.out.println("Compras con descuentos aplicados:");
        for (int i = 0; i < compras.length; i++) {

            if (compras[i] > 500) {
                double descuento = compras[i] * 0.15;
                double totalConDescuento = compras[i] - descuento;
                System.out.println("Compra: " + compras[i] + " - Descuento: " + descuento + " - Total con descuento: " + totalConDescuento);
            } else {
                System.out.println("Compra: " + compras[i] + " - No califica para descuento.");
            }
        }
    }
}
