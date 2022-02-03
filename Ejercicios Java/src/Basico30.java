import java.util.Scanner;

/**
 * @author Christian Novo Sacramento
 */
/*
 Programa que lea dos números por teclado y muestre el resultado de la división
 del primer número por el segundo. Se debe comprobar que el divisor no puede ser cero.
*/
public class Basico30 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero1, numero2;
        double division;

        //Se solicitan los números
        System.out.println("====================");
        System.out.println("| DIVISIÓN NÚMEROS |");
        System.out.println("====================" + "\n");
        System.out.printf("Número 1: ");
        numero1 = sc.nextInt();
        System.out.printf("Número 2: ");
        numero2 = sc.nextInt();

        //Se comprueba la condición y se hace la operación
        if (numero2 == 0) {
            System.out.println("ERROR!!! (El divisor no puede ser 0)");
        }else {
            division = numero1 / numero2;
            System.out.println(numero1 + "/" + numero2 + " = " + division);
        }
    }
}
