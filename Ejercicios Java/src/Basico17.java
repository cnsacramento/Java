import java.util.Scanner;

/**
 * @author Christian Novo Sacramento
 */
/*
Programa Java que lea un número entero de 3 cifras y muestre por separado las cifras del número.
 */
public class Basico17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero;
        int cifra1,cifra2,cifra3;

        //Se solicita el número de 3 cifras
        System.out.println("Dime un número de 3 cifras");
        numero = sc.nextInt();

        //Se hallan las 3 cifras
        cifra1 = numero / 100; //Al ser tipo int devuelve el número sin decimales
        cifra2 = (numero % 100) / 10; //Halla el resto que es 25 y al dividirlo por 10 el int devuelve sin decimales
        cifra3 = numero % 10; //Halla el resto

        //Se muestran las cifras
        System.out.println(numero + " descompuesto por cifras: ");
        System.out.println("Primera cifra --> " + cifra1);
        System.out.println("Segunda cifra --> " + cifra2);
        System.out.println("Tercera cifra --> " + cifra3);
    }
}
