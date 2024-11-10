import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String [] args) {
        //Ejercicio 6: Generador de Planes de Estudio
        //Escribe un programa que pida al usuario cuántas horas al día puede estudiar y luego genere un
        //plan de estudio semanal distribuyendo esas horas en diferentes materias.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de horas al dia que tiene para estudiar");
        double horas = scanner.nextDouble();
        System.out.println("Ingrese la cantidad de materias que tiene que estudiar");
        double materias = scanner.nextDouble();
        System.out.println("ingrese la cantidad de dias que usted va a estudiar de 1 a 7");
        double cantDias = scanner.nextDouble();

        double HorasMateria = horas / materias;
        double HorasSemanalesMateria = HorasMateria * cantDias;

        System.out.println("Usted necesitara estudiar "+ HorasMateria + " por materia al dia que da un total de : "+ HorasSemanalesMateria + " horas semanales por materia ");

    }
}
