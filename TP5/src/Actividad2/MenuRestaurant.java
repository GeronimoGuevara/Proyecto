package Actividad2;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuRestaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Plato> platos = new ArrayList<>();

        boolean segirCargandoPlatos = true;

        while (segirCargandoPlatos) {
            System.out.println("Ingrese el nombre del plato: ");
            String nombrePlato = sc.nextLine();

            System.out.println("Ingrese el precio del plato: ");
            double precio = sc.nextDouble();
            sc.nextLine();

            System.out.println("Es bebida? s/n");
            String respuestaBebida = sc.nextLine().trim().toLowerCase();

            boolean esBebida = respuestaBebida.equals("s");

            Plato plato = new Plato(nombrePlato,precio,esBebida);

            if (!esBebida) {
                boolean seguirCargandoIngredientes = true;

                while (seguirCargandoIngredientes) {

                    System.out.println("Ingrese los ingredientes (al menos 1) ");
                    String nombreIngrediente = sc.nextLine();

                    System.out.println("Ingrese la cantidad del ingrediente: ");
                    double cantidad = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Ingrese la unidad de medida del ingrediente: ");
                    String unidadMedida = sc.nextLine();

                    plato.agregarIngredientes(new Ingrediente(nombreIngrediente,cantidad,unidadMedida));

                    System.out.println("Quiere seguir cargando ingredientes?? s/n ");
                    String opcionSeguir = sc.nextLine().trim().toLowerCase();
                    seguirCargandoIngredientes = opcionSeguir.equals("s");
                }
            }
            platos.add(plato);


            System.out.println("Desea cargar otro plato?? s/n");
            String opcionPlatos = sc.nextLine().trim().toLowerCase();
            segirCargandoPlatos = opcionPlatos.equals("s");

        }
        System.out.println("\nMenu:");
        for (Plato plato : platos) {
            System.out.println(plato);
            System.out.println("===============================");

        }
        sc.close();
    }
}
