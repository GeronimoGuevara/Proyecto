import java.util.Scanner;

public class T2Ejercicio1 {
    public static void main (String [] args) {
        //Ejercicio 1: Sistema de Recomendación de Películas
        //Escribe un programa que pida al usuario su género de película favorito (acción, comedia, drama,
        //ciencia ficción) y luego recomiende una película basada en su elección.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su genero favorito de pelicula: Accion, Comedia, Drama o Ciencia Ficcion");
        String pelFav = sc.nextLine().toLowerCase();

        switch (pelFav) {
            case "accion":
                System.out.println("Peliculas de Acción:");
                System.out.println("Mad Max: Fury Road (2015): Un film post-apocalíptico con escenas de acción impresionantes y una trama cargada de adrenalina.");
                System.out.println("John Wick (2014): Con Keanu Reeves, la película sigue a un exasesino en su búsqueda de venganza, con coreografías de acción excepcionales.");
                System.out.println("Die Hard (1988): Un clásico de acción donde un policía enfrenta a terroristas en un edificio en Nueva York.");
                break;
            case "comedia":
                System.out.println("Peliculas de Comedia:");
                System.out.println("The Hangover (2009): Un grupo de amigos debe reconstruir los eventos de una noche loca en Las Vegas.");
                System.out.println("Groundhog Day (1993): Un hombre se ve atrapado viviendo el mismo día una y otra vez, una comedia con toques filosóficos.");
                System.out.println("Superbad (2007): Dos amigos de la adolescencia intentan disfrutar de su última gran fiesta antes de graduarse.");
                break;
            case "drama":
                System.out.println("Peliculas de Drama:");
                System.out.println("The Shawshank Redemption (1994): La historia de un hombre encarcelado injustamente y su lucha por la esperanza y la libertad.");
                System.out.println("A Beautiful Mind (2001): Basada en la vida de John Nash, un brillante matemático que lucha con la esquizofrenia.");
                System.out.println("12 Years a Slave (2013): La historia real de un hombre libre que es secuestrado y vendido como esclavo en el sur de Estados Unidos.");
                break;
            case "ciencia ficcion":
                System.out.println("Peliculas de Ciencia Ficción:");
                System.out.println("Interstellar (2014): Un viaje épico a través del espacio para salvar a la humanidad de su extinción.");
                System.out.println("Blade Runner 2049 (2017): Una secuela de la clásica película de ciencia ficción, que explora la naturaleza de la humanidad y la inteligencia artificial.");
                System.out.println("The Matrix (1999): Un hacker descubre que el mundo en el que vive es una simulación y debe luchar por la libertad.\n");
                break;
            default:
                System.out.println("El genero ingresado es invalido");

        }

    }
}
