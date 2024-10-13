import java.util.Random;
import java.util.Scanner;

public class T2Ejercicio5 {
    public static void main (String [] args ) {
        //Ejercicio 5: Juego de Piedra, Papel o Tijera
        //Escribe un programa que pida al usuario que elija entre piedra, papel o tijera. Luego, el programa
        //elige una opción al azar y determina quién gana. Imprime el resultado del juego.

        Scanner sc = new Scanner(System.in);

        System.out.println("elegir entre piedra papel o tijeras ");
        String mano = sc.nextLine().toLowerCase();

        String [] opciones = {
                "piedra",
                "papel",
                "tijeras"
        };
        Random random = new Random();
        int indiceAleatorio = random.nextInt(opciones.length);

        String textoElejido = opciones[indiceAleatorio];

        System.out.println("la maquina elijio: "+textoElejido);

        if (mano.equals(textoElejido)) {
            System.out.println("Empataron");
        } else if ((mano.equals("piedra") && textoElejido.equals("tijeras")) ||
                (mano.equals("papel") && textoElejido.equals("piedra")) ||
                (mano.equals("tijeras") && textoElejido.equals("papel"))) {
            System.out.println("Ganaste");
        } else {
            System.out.println("Ganó la máquina");
        }
    }
}