import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String[] args) {
        //Ejercicio 2: Cálculo de salarios semanales
        //Una empresa desea calcular el salario semanal de sus empleados basándose en las horas trabajadas y una tarifa fija por hora.
        //Instrucciones:
        //•	Pide al usuario ingresar la cantidad de empleados.
        //•	Para cada empleado, pide ingresar las horas trabajadas.
        //•	Usa un bucle para calcular el salario de cada empleado (suponiendo una tarifa fija de $15 por hora).

        Scanner sc = new Scanner(System.in);
        double tarifaPorHora = 15.0;

        System.out.println("Ingrese la cantidad de empleados en la empresa. ");
        int cantEmpleados = sc.nextInt();
        int i = 1;
        for (i = 1 ; i <cantEmpleados ; i++) {
            System.out.println("Ingrese la cantidad de horas trabajadas por el empleado numero "+i);
            double horasTrabajadas = sc.nextDouble();

            double salarioSemanal = horasTrabajadas * tarifaPorHora;
            System.out.println("El salario semanal del empleado "+i+ " es de: " + salarioSemanal);

        }


    }
}
