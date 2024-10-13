import java.util.Scanner;

//EJERCICIO 1 TP SECUENCIALES
public class Ejercicio1 {
    public static void main(String[] args) {
        //Ejercicio 1: Generador de Horóscopo
        //Escribe un programa que pida al usuario su fecha de nacimiento (en formato DD/MM/AAAA) y luego
        //imprima su signo del zodiaco y un mensaje de horóscopo correspondiente.
        Scanner Scanner = new Scanner(System.in);
        System.out.println("introduce tu fecha de nacimiento en formato DD/MM/AAAA");
        String fecha = Scanner.nextLine();
        String[] partes = fecha.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);

        String signo = "";
        String horoscopo = "";

        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            signo = "Acuario";
            horoscopo = "Hoy es un buen día para comunicarte con los demás.";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            signo = "Piscis";
            horoscopo = "Deja fluir tu creatividad, será tu mejor aliada.";
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            signo = "Aries";
            horoscopo = "Es un día perfecto para comenzar nuevos proyectos.";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            signo = "Tauro";
            horoscopo = "La estabilidad emocional será clave hoy.";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            signo = "Géminis";
            horoscopo = "La curiosidad te llevará a nuevas aventuras.";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            signo = "Cáncer";
            horoscopo = "Hoy es un buen día para cuidar de tus seres queridos.";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            signo = "Leo";
            horoscopo = "Tu carisma atraerá la atención que deseas.";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            signo = "Virgo";
            horoscopo = "La atención al detalle será tu mayor fortaleza hoy.";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            signo = "Libra";
            horoscopo = "La armonía en tus relaciones será crucial.";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            signo = "Escorpio";
            horoscopo = "Tu intuición te guiará en decisiones importantes.";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            signo = "Sagitario";
            horoscopo = "Es un buen momento para explorar nuevos horizontes.";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            signo = "Capricornio";
            horoscopo = "La disciplina será la clave para lograr tus metas.";
        } else {
            System.out.println("Fecha no válida.");
            Scanner.close();
            return;
        }
        System.out.println("Tu signo es: " +signo);
        System.out.println("Horoscopo: " +horoscopo);
    }
}