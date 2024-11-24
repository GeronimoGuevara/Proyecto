package Actividad1;

import java.util.ArrayList;
import java.util.Scanner;

public class A1_CargarNotas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<A1_Alumno> alumnos = new ArrayList<>();

        System.out.println("Ingrese la cantidad de alumnos:");
        int cantAlumnos = sc.nextInt();
        sc.nextLine();

        for (int i = 0 ; i < cantAlumnos; i++){

            System.out.println("Ingrese el nombre completo del alumno:");
            String nombreCompleto = sc.nextLine();

            System.out.println("Ingrese el legajo del alumno");
            long legajo = sc.nextLong();
            sc.nextLine();

            A1_Alumno alumno = new A1_Alumno(nombreCompleto,legajo);
            System.out.println("Ingrese la cantidad de notas del alumno (minimo 1): ");
            int cantNotas;
            do {
                cantNotas = sc.nextInt();
                System.out.println("Debe ingresar al menos una nota");

            }while (cantNotas < 1);
            sc.nextLine();
            for (int j = 0 ; j < cantNotas ; j++) {
                System.out.println("Ingrese el nombre de la catedra: ");
                String catedra = sc.nextLine();

                System.out.println("Ingrese la nota del examen: ");
                double notaExamen = sc.nextDouble();
                sc.nextLine();

                alumno.agregarNota(new A1_Nota(catedra, notaExamen));

            }
            alumnos.add(alumno);

        }
        System.out.println("\nInformacion cargada:");
        for (A1_Alumno alumno : alumnos){
            System.out.println(alumno);
            System.out.println("=============================");
        }
        sc.close();
    }


}
