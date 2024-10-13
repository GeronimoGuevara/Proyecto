import java.util.Scanner;

public class Ejercicio4 {
    public static void main (String[] args){

        Scanner Scanner = new Scanner(System.in);
        System.out.println("ingrese su estado de animo: (Feliz, Triste, Energetico o Relajado)");
        String estadoAnimo = Scanner.nextLine().toLowerCase();
        String canciones = "";

        switch (estadoAnimo) {
            case "feliz":
                canciones = String.format("%-60s%n", "Playlist Feliz") +
                        String.format("%-60s%n", "Happy - Pharrell Williams")+
                        String.format("%-60s%n", "Uptown Funk - Mark Ronson ft. Bruno Mars")+
                        String.format("%-60s%n", "Walking on Sunshine - Katrina and the Waves")+
                        String.format("%-60s%n", "Good Vibrations - The Beach Boys")+
                        String.format("%-60s%n", "Can't Stop the Feeling! - Justin Timberlake");
                break;

            case "triste":
                canciones = String.format("%-60s%n", "Playlist Triste") +
                        String.format("%-60s%n", "Tears in Heaven - Eric Clapton")+
                        String.format("%-60s%n", "Someone Like You - Adele")+
                        String.format("%-60s%n", "The Night We Met - Lord Huron")+
                        String.format("%-60s%n", "Fix You - Coldplay")+
                        String.format("%-60s%n", "Hallelujah - Jeff Buckley");
                break;
            case "energetico":
                canciones = String.format("%-60s%n", "Playlist Energético") +
                        String.format("%-60s%n", "Lose Yourself - Eminem")+
                        String.format("%-60s%n", "Titanium - David Guetta ft. Sia")+
                        String.format("%-60s%n", "Stronger - Kanye West")+
                        String.format("%-60s%n", "Don't Stop Me Now - Queen")+
                        String.format("%-60s%n", "Wake Me Up - Avicii");
                break;
            case "relajado":
                canciones = String.format("%-60s%n", "Playlist Relajado") +
                        String.format("%-60s%n", "Weightless - Marconi Union")+
                        String.format("%-60s%n", "Banana Pancakes - Jack Johnson")+
                        String.format("%-60s%n", "Come Away With Me - Norah Jones")+
                        String.format("%-60s%n", "River - Leon Bridges")+
                        String.format("%-60s%n", "Breathe Me - Sia");
                break;
            default:
                System.out.println("Usted introdujo un estado de animo invalido");
                break;
        }
            System.out.println("Las canciones que te recomendamos escuchar si estas " + estadoAnimo + " son: \n" + canciones);

    }
}
