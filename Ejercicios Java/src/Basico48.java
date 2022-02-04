import java.util.Scanner;

/*
 Programa para intercambiar el valor de dos variables. 
 Los valores iniciales se leen por teclado.
Por ejemplo, suponiendo que las variables se llaman A y B, 
si A contiene 3 y B contiene 5, después del intercambio A contendrá 5 y B 3. 
En este ejemplo, para intercambiar el valor entre dos variables utilizaremos 
una avariable auxiliar donde guardar el valor de una de ellas. 
Después veremos la forma de hacerlo sin usar una variable auxiliar para el intercambio.
*/
/**
 * @author Christian Novo Sacramento
 */
public class Basico48 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a, b, version = -1;

        //Se solicitan las variables
        System.out.println("=================================");
        System.out.println("|| INTERCAMBIADOR DE VARIABLES ||");
        System.out.println("=================================");
        System.out.printf("Variable A: ");
        a = sc.nextInt();
        System.out.printf("Variable B: ");
        b = sc.nextInt();
        System.out.println("¿Qué versión deseas realizar?\n 1. Con auxiliar\n 2.Sin auxiliar");
        version = sc.nextInt();
        while (version != 1 && version != 2){ //En caso de que no elija una versión correcta entra al búcle para corregirlo
            System.out.println("ERROR!!!! (Debe seleccionar \"1\" o \"2\" )");
            System.out.printf("Version: ");
            version = sc.nextInt();
        }
        switch (version) {
            case 1: System.out.println("Versión con auxiliar: ");
                int auxiliar = a;
                a = b;
                b = auxiliar;
                System.out.println("Ahora el valor de A es: " + a + " y el valor de B: " + b);
                break;
            case 2: System.out.println("Versión sin auxiliar:");
                a = a + b;  //Guardamos el valor de a y b juntos con las suma
                b = a - b; //Obtenemos el valor de a en b
                a = a - b; //Obtenemos el valor de b en a. Restando el valor actual de "B=a" al valor de A 
                System.out.println("Ahora el valor de A es: " + a + " y el valor de B: " + b);
                break;
        }
    }
}
