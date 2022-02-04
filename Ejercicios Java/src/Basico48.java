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
        while (version < 0 && version > 2){

        }
        System.out.println("=================================");
        System.out.println("|| INTERCAMBIADOR DE VARIABLES ||");
        System.out.println("=================================");
        System.out.printf("Variable A: ");
        a = sc.nextInt();
        System.out.printf("Variable B: ");
        b = sc.nextInt();
        System.out.println("¿Qué versión deseas realizar?\n 1. Con auxiliar\n 2.Sin auxiliar");
        version = sc.nextInt();




    }
}
