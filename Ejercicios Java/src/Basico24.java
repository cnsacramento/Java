import java.util.Scanner;

/**
 * @author Christian Novo Sacramento
 */
/*
Programa Java que lea un número entero por teclado y calcule si es par o impar.
*/
public class Basico24 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero;

        //Se pide el número
        System.out.println("¿Qué número quieres saber si es par?");
        numero = sc.nextInt();

        //Se halla si el número es par(si el resto de dividirlo por 2 es igual a cero) o impar
        if (numero % 2 == 0) {
            System.out.println(numero + " es un número par");
        } else {
            System.out.println(numero + " es un número impar");
        }

    }
}
