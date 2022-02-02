import java.util.Scanner;

/**
 * @author
 */
/*
 Programa Java que lea un número entero N de 5 cifras y muestre sus cifras igual que en el ejemplo.
Por ejemplo para un número N = 12345    La salida debe ser:
5
45
345
2345
12345
*/
public class Basico19 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero;

        //Se solicita el número
        System.out.println("Dime un número de 5 cifras");
        numero = sc.nextInt();

        //Se hallan las cifras con ayuda de ir obteniendo los restos
        int cifra5 = numero % 10;
        int cifra4a5 = numero % 100;
        int cifra3a5 = numero % 1000;
        int cifra2a5 = numero % 10000;

        //Se muestra la estructura
        System.out.println("==============");
        System.out.println("| ESTRUCTURA |");
        System.out.println("==============");
        System.out.println(cifra5);
        System.out.println(cifra4a5);
        System.out.println(cifra3a5);
        System.out.println(cifra2a5);
        System.out.println(numero);
    }
}
