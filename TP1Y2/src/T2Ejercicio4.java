import java.util.Scanner;
import java.util.InputMismatchException;

public class T2Ejercicio4 {
    public static void main (String [] args) {
        //Ejercicio 4: Calculadora de IMC con Recomendaciones
        //Escribe un programa que pida al usuario su peso en kilogramos y su altura en metros, y luego
        //calcule su Índice de Masa Corporal (IMC). Imprime una recomendación basada en el IMC (bajo
        //peso, peso normal, sobrepeso, obesidad).

        //JOptionPane.showInputDialog();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su peso corporal en kilogramos");
        Double peso = sc.nextDouble();

        System.out.println("Ingrese su altura en metros");
        Double altura = sc.nextDouble();

        Double imc = peso / (Math.pow(altura,2));
        System.out.println("Su indice de IMC es de: "+imc);
        if (imc < 18.5) {
            System.out.println("Usted se encuentra en un nivel de imc \"Bajo Peso\"");
            System.out.println("Recomendación: Consulta a un profesional de la salud para evaluar si existe alguna causa médica subyacente y recibir \n una dieta adecuada para ganar peso de manera saludable. Es importante incluir alimentos ricos en calorías nutritivas,\n como frutos secos, aguacate, y proteínas magras, para aumentar la masa muscular en lugar de grasa.\n");

        } else if (18.5 <= imc && imc <=24.9) {
            System.out.println("Usted se encuentra en un nivel de IMC \"Peso Normal\"");
            System.out.println("Recomendación: Mantén un estilo de vida saludable, equilibrando una dieta rica en nutrientes con ejercicio regular.  \n Prioriza mantener hábitos saludables a largo plazo, como comer frutas, verduras, proteínas magras, y realizar \n actividad física moderada al menos 30 minutos al día.\n");
            
        } else if (25 <= imc && imc <= 29.9) {
            System.out.println("Usted se encuentra en un nivel de IMC \"Sobre Peso\"");
            System.out.println("Recomendación: Considera hacer cambios en la dieta y aumentar la actividad física. Es recomendable reducir la ingesta\n de alimentos altos en azúcar y grasas saturadas, e incrementar el consumo de fibra y proteínas saludables. Un plan de\n ejercicio que  incluya tanto entrenamiento cardiovascular como de fuerza puede ayudar a perder peso de manera efectiva.\n");
            
        } else if (30 <= imc) {
            System.out.println("Usted se encuentra en un nivel de IMC \"Obesidad\"");
            System.out.println("Recomendación: Es fundamental trabajar junto a un profesional médico o nutricionista para desarrollar un plan personalizado \n de pérdida de peso. Un enfoque a largo plazo que combine cambios en la alimentación (como controlar las porciones y reducir el consumo\n de calorías vacías) y ejercicio regular será clave. Además, si es necesario, pueden evaluarse otros tratamientos \n como intervenciones médicas o terapias.\n");

        }
    }
}
