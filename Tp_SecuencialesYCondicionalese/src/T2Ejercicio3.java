import java.util.Scanner;

public class T2Ejercicio3 {
    public static void main (String []args ){
        //Ejercicio 3: Sistema de Recomendación de Libros
        //Escribe un programa que pida al usuario su género de libro favorito (fantasía, misterio, romance,
        //ciencia ficción) y luego recomiende un libro basado en su elección.

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su genero de libros favoritos: ");
        String genero = sc.nextLine().toLowerCase();

        switch (genero){
            case "fantasia":
                System.out.println("Los libros recomendados para el genero Fantasia son:");
                System.out.println("\"El nombre del viento\" de Patrick Rothfuss: La historia de Kvothe, un joven prodigio que se convierte en un legendario mago y aventurero, narrada con un estilo lírico y cautivador.");
                System.out.println("\"La comunidad del anillo\" de J.R.R. Tolkien: La primera parte de El Señor de los Anillos, donde se inicia la épica búsqueda para destruir el Anillo Único.");
                System.out.println("\"La chica que soñaba con una cerilla y un bidón de gasolina\" de Stieg Larsson: Aunque no es puramente fantasía, esta obra combina elementos de misterio y drama en un entorno que se siente fantástico por su complejidad.");

                break;
            case "misterio":
                System.out.println("Los libros recomendados para el genero Misterio son:");
                System.out.println("\"La chica del tren\" de Paula Hawkins: Un thriller psicológico que sigue a una mujer cuya vida se entrelaza con la de una pareja que observa desde el tren, llevando a un oscuro misterio.");
                System.out.println("\"El nombre de la rosa\" de Umberto Eco: Una novela histórica de misterio ambientada en una abadía medieval, donde un fraile investiga una serie de asesinatos.");
                System.out.println("\"Mujer en la ventana\" de A.J. Finn: Una mujer agorafóbica espía a sus vecinos y se convierte en testigo de un posible crimen, lo que desencadena una serie de eventos intrigantes.");
                break;
            case "romance":
                System.out.println("Los libros recomendados para el genero Romance son:");
                System.out.println("\"Orgullo y prejuicio\" de Jane Austen: Una novela clásica que explora las complejidades del amor y las relaciones en la Inglaterra del siglo XIX, centrada en Elizabeth Bennet y el Sr. Darcy.");
                System.out.println("\"Bajo la misma estrella\" de John Green: Una conmovedora historia de amor entre dos adolescentes que luchan contra el cáncer, llena de ternura y realismo.");
                System.out.println("\"El diario de una pasión\" de Nicholas Sparks: Una emotiva historia de amor que sigue a Noah y Allie a lo largo de los años, mostrando la fuerza y la resistencia del amor verdadero.");
                break;
            case "ciencia ficcion":
                System.out.println("Los libros recomendados para el genero Ciencia Ficcion son:");
                System.out.println("\"Dune\" de Frank Herbert: Un clásico de la ciencia ficción que narra la historia de Paul Atreides y la lucha por el control del planeta Arrakis, lleno de intrigas políticas y ecos de ecología.");
                System.out.println("\"Neuromante\" de William Gibson: Una obra seminal que dio forma al subgénero del ciberpunk, siguiendo las hazañas de un hacker en un mundo dominado por la tecnología.");
                System.out.println("\"La guerra de los mundos\" de H.G. Wells: Una historia clásica de invasión alienígena que explora la lucha de la humanidad contra una raza marciana.");
                break;
            default:
                System.out.println("el genero ingresado no es valido");
                break;
        }
    }
}
