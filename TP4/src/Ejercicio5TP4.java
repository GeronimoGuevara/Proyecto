public class Ejercicio5TP4 {
    public static void main(String[] args) {
        int[] calificaciones = {4, 5, 3, 4, 2, 5, 4, 3, 5, 4};

        double promedio = calcularPromedioSatisfaccion(calificaciones);
        System.out.println("El promedio de satisfacción de los clientes es: " + promedio);
    }

    public static double calcularPromedioSatisfaccion(int[] calificaciones) {

        int suma = 0;
        for (int i = 0; i < calificaciones.length; i++) {

            suma += calificaciones[i];
        }
        double promedio = (double) suma / calificaciones.length;

        return promedio;
    }
}
