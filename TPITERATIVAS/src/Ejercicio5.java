import java.util.Scanner;

public class Ejercicio5 {
    public static void main (String [] args) {

        //Ejercicio 5: Cálculo de horas extras
        //Una empresa desea calcular las horas extras trabajadas por sus empleados. Si un empleado trabaja
        // más de 40 horas en la semana, las horas adicionales se consideran horas extras.
        //Instrucciones:
        //•	Pide al usuario ingresar el número de empleados.
        //•	Usa un bucle para ingresar las horas trabajadas por cada empleado.
        //•	Si un empleado trabajó más de 40 horas, calcula y muestra las horas extras.

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de empleados:");
        int numEmpleados = sc.nextInt();

        int i = 1;
        int horasTrabajadas;
        int horasExtras;

        do {
            System.out.println("Ingrese las horas trabajadas por el empleado " + i + ":");
            horasTrabajadas = sc.nextInt();

            if (horasTrabajadas > 40) {
                horasExtras = horasTrabajadas - 40;
                System.out.println("El empleado " + i + " trabajó " + horasExtras + " horas extras.");
            } else {
                System.out.println("El empleado " + i + " no trabajó horas extras.");
            }

            i++;
        } while (i <= numEmpleados);




    }
}
