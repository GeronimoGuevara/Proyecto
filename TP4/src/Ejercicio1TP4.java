public class Ejercicio1TP4 {
    public static void main(String[] args) {
        double[] ventasMensuales = {
                150.50, 200.00, 175.75, 300.00, 250.25, 180.00, 220.00, 190.50, 210.00, 205.00,
                180.00, 230.50, 240.00, 170.25, 225.75, 195.50, 260.00, 250.00, 180.00, 200.00,
                210.50, 275.00, 185.00, 215.75, 300.00, 280.50, 190.00, 245.00, 225.00, 200.50
        };

        double totalIngresos = calcularIngresosMensuales(ventasMensuales);
        System.out.println("El total de ingresos mensuales es: " + totalIngresos);
    }

    public static double calcularIngresosMensuales(double[] ventasMensuales) {
        double total = 0;
        for (int i = 0; i < ventasMensuales.length; i++) {
            total += ventasMensuales[i];
        }
        return total;
    }
}
