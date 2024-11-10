import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("HOLA MUNDO");
        int [] numeros = new int[6];
        Scanner sc = new Scanner(System.in);

        int A [], B[], C[];
        A = new int[4];
        B = new int[4];
        C = new int[4];
        cargarArreglo(A);
        cargarArreglo(B);
        sumarArreglos(A,B,C);
        MostrarElementos(C);
    }
    public static void cargarArreglo (int [] arreglo) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i< arreglo.length ; i++) {
            System.out.println("Ingrese los numero de la posicion "+(i+1));
            arreglo[i] = sc.nextInt();

        }
    }
    public static void sumarArreglos(int []A,int []B,int []C) {
        for (int i = 0 ; i < C.length ; i++){
        C[i] = A[i] + B[i];

        }
    }
    public static void MostrarElementos( int []C) {
        for (int i = 0 ; i < C.length ; i++ ) {
            System.out.println("La suma de los elementos es de: " + C[i]);

        }
    }
}