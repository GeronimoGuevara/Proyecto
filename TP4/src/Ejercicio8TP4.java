public class Ejercicio8TP4 {
    public static void main(String[] args) {

        String[] empleados = {"Juan", "Ana", "Luis", "Carla", "Pedro"};

        int[] horasTrabajadas = {40, 35, 45, 50, 30};

        calcularPagoSemanal(empleados, horasTrabajadas);
    }

    public static void calcularPagoSemanal(String[] empleados, int[] horasTrabajadas) {

        double tarifa_hora = 15.0;
        System.out.println("Pago semanal de los empleados:");

        for (int i = 0; i < empleados.length; i++) {

            double pago = horasTrabajadas[i] * tarifa_hora;
            System.out.println(empleados[i] + " - Horas trabajadas: " + horasTrabajadas[i] + " Corresponden : " + pago + " pesos");
        }
    }
}
