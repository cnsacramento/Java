import java.util.Scanner;

/**
 * @author Christian Novo Sacramento
 */
/*
Programa que lea un número entero y muestre si el número es múltiplo de 10.
*/
public class Basico25 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero;

        //Se solicita el número
        System.out.println("¿Qué número quieres saber si es múltiplo de 10?");
        numero = sc.nextInt();

        //Un número es multiplo de otro si el resto de dividirlo por el mismo es cero
        if (numero % 10 == 0) {
            System.out.println(numero + " es un múltiplo de 10.");
        } else {
            System.out.println(numero + " no es un múltiplo de 10.");
        }
    }
}
